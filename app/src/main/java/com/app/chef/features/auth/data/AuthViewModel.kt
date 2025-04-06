package com.android.doctorapp.features.auth.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.doctorapp.R
import com.android.doctorapp.core.utils.Constants
import com.android.doctorapp.core.utils.Constants.ConstantsDb.TABLE_USER_DATA
import com.android.doctorapp.core.utils.Resource
import com.android.doctorapp.features.auth.domain.repo.AuthRepository
import com.app.chef.features.auth.domain.model.AuthUserModel
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AuthViewModel (
    val authRepository: AuthRepository
): ViewModel() {

    private var  mAuth: FirebaseAuth? = null
    private  var reference: DatabaseReference
    private  var mFirestoreRef: CollectionReference
    private lateinit var currentUser: FirebaseUser
    init {

        mAuth = FirebaseAuth.getInstance()    //Authentication
        mFirestoreRef = FirebaseFirestore.getInstance().collection(TABLE_USER_DATA)    //Firestire database
//        currentUser = mAuth?.currentUser!!
        reference = FirebaseDatabase.getInstance().getReference("taxInfo") //Reference to DBTable
    }

    val signupResult: MutableLiveData<Resource<String>> = MutableLiveData()
    val loginResult: MutableLiveData<Resource<String>> = MutableLiveData()
    val resetPassResult: MutableLiveData<Resource<String>> = MutableLiveData()
    val googleLoginResult: MutableLiveData<Resource<String>> = MutableLiveData()
    val generalToastResponse: MutableLiveData<String> = MutableLiveData()
    var currentUserData: AuthUserModel = AuthUserModel(vName = "", vEmail = "", userId = "")


    fun registerUser(user: AuthUserModel, pass:String) {
        signupResult.postValue(Resource.Loading())
        mAuth?.createUserWithEmailAndPassword(user.vEmail!!, pass)
            ?.addOnCompleteListener { task ->
                signupResult.postValue(handleNetRequestResponse(task))
                if(task.isSuccessful){
                    user.userId = task.result.user!!.uid
                    addUserData(user)
                }
            }
    }

    fun loginUser(email: String, password: String) {
        loginResult.postValue(Resource.Loading())
        mAuth?.signInWithEmailAndPassword(email, password)
            ?.addOnCompleteListener { task ->
                if(task.isSuccessful){
                    currentUser = task.getResult().user!!
                    currentUserData.userId = currentUser.uid
                }
                getUserData(task)
//                loginResult.postValue(handleNetRequestResponse(task))
            }
    }

    fun loginWithGoogle(credential: AuthCredential) {
        googleLoginResult.postValue(Resource.Loading())
        mAuth?.signInWithCredential(credential)
            ?.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    currentUser = task.getResult().user!!
                    googleLoginResult.postValue(Resource.Success("Login Successful!"))
                }else
                    googleLoginResult.postValue(Resource.Error(task.exception?.message.toString()))
            }
    }


    private fun handleNetRequestResponse(response: Task<AuthResult>): Resource<String> {
        if (response.isSuccessful) {
            response.result?.let {
                return Resource.Success("success")
            }
        }
        return Resource.Error(response.exception?.message.toString())
    }

    fun resetLinkToMail(email: String) {
        resetPassResult.postValue(Resource.Loading())
        mAuth?.sendPasswordResetEmail(email)
            ?.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    resetPassResult.postValue(Resource.Success("Link sent successfully!"))
                }else
                    resetPassResult.postValue(Resource.Error(task.exception?.message.toString()))
            }
    }


    fun addUserData(user: AuthUserModel) {
//        currentUser = mAuth?.currentUser!!
        if(user.userId.equals(""))
            return

        viewModelScope.launch {
            currentUserData = user
            generalToastResponse.postValue(authRepository.addUserData(user.toMap(), mFirestoreRef))
        }
    }

    fun getUserData(task: Task<AuthResult>) {

        val condition = currentUser.uid!!
        viewModelScope.launch {
            currentUserData = authRepository.getUserData(mFirestoreRef, condition)!!
            if (currentUserData.iModule!!.isNotEmpty()) {
                when (currentUserData.iModule) {
                    "Expert" -> currentUserData.isProvider = true
                    "Coach" -> currentUserData.isProvider = true
                    "Counselor" -> currentUserData.isProvider = true
                    "Student" -> currentUserData.isProvider = false
                    "Business" -> currentUserData.isProvider = false
                    "Person" -> currentUserData.isProvider = false
                }
            }
            loginResult.postValue(handleNetRequestResponse(task))
            val str = "hello world!"
        }
    }

    fun updateUserData(user: Map<String, Any>, condition:Any) {
//        currentUser = mAuth?.currentUser!!
        if(condition.equals(""))
            return

        viewModelScope.launch {
            generalToastResponse.postValue(authRepository.updateUserData(mFirestoreRef, condition, user))
            currentUserData = (authRepository.getUserData(mFirestoreRef, condition)!!)
            val str = "hello world!"
        }
    }
    suspend fun changeModule(user: Map<String, Any>, condition: Any): Boolean {
        if (condition == "") {
            return false
        }

        return try {
            withContext(Dispatchers.IO) {
                generalToastResponse.postValue(authRepository.updateUserData(mFirestoreRef, condition, user))
                currentUserData = (authRepository.getUserData(mFirestoreRef, condition)!!)
                val str = "hello world!"

                true  // Success
            }
        } catch (e: Exception) {
            false  // Failure
        }
    }


}