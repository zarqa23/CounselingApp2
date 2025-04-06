package com.app.chef.features.profile.data

import android.net.Uri
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.doctorapp.core.helper.SharedPrefHelper
import com.android.doctorapp.core.utils.Constants
import com.android.doctorapp.core.utils.Resource
import com.app.chef.features.auth.domain.model.AuthUserModel
import com.app.chef.features.profile.domain.model.ProfileDataModel
import com.app.chef.features.profile.domain.repo.ProfileRepository
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.launch


class ProfileViewModel (
    val profileRepository: ProfileRepository
): ViewModel() {

    private var  mAuth: FirebaseAuth? = null
    private  var reference: DatabaseReference
    private  var mFirestoreRef: CollectionReference
    private var currentUser: FirebaseUser
    init {

        mAuth = FirebaseAuth.getInstance()    //Authentication
        mFirestoreRef = FirebaseFirestore.getInstance().collection(Constants.ConstantsDb.TABLE_USER_DATA)    //Firestire database
        currentUser = mAuth?.currentUser!!
        reference = FirebaseDatabase.getInstance().getReference("taxInfo") //Reference to DBTable
    }


    val generalToastResponse: MutableLiveData<String> = MutableLiveData()
    val resetPassResult: MutableLiveData<Resource<String>> = MutableLiveData()
    val editModeUserData: MutableLiveData<Resource<String>> = MutableLiveData()
    var currentUserData: MutableLiveData<Resource<ProfileDataModel>> = MutableLiveData()
    var providersData: MutableLiveData<Resource<ArrayList<ProfileDataModel>>> = MutableLiveData()
    var currentUserDataModel: ProfileDataModel = ProfileDataModel()




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


    fun updateUserData(user: Map<String, Any>) {

        val condition = currentUser.uid!!
        viewModelScope.launch {
            generalToastResponse.postValue(profileRepository.updateUserData(mFirestoreRef, condition, user))
            currentUserData.postValue(Resource.Success(profileRepository.getUserData(mFirestoreRef, condition)!!))
            val str = "hello world!"
        }
    }

    fun updateUserDataById(user: Map<String, Any>, id:String) {

        val condition = id
        viewModelScope.launch {
            val response = profileRepository.updateUserData(mFirestoreRef, condition, user)
            generalToastResponse.postValue(response)
//            editModeUserData.postValue(Resource.Success(response))
            val str = "hello world!"
        }
    }

    fun getUserData() {

        val condition = currentUser.uid!!
        viewModelScope.launch {
            val result = profileRepository.getUserData(mFirestoreRef, condition)!!
            result?.let{
                currentUserData.postValue(Resource.Success(result))
                currentUserDataModel = (result)
                currentUserData.value?.let {
                    val me = it
                    if (currentUserData.value?.data?.iModule!!.isNotEmpty()) {
                        when (currentUserData.value?.data?.iModule) {
                            "Expert" -> currentUserData.value?.data?.isProvider = true
                            "Coach" -> currentUserData.value?.data?.isProvider = true
                            "Counselor" -> currentUserData.value?.data?.isProvider = true
                            "Student" -> currentUserData.value?.data?.isProvider = false
                            "Business" -> currentUserData.value?.data?.isProvider = false
                            "Person" -> currentUserData.value?.data?.isProvider = false
                        }
                    }
                }
            }
            val str = "hello world!"
        }
    }

    fun getProvidersData() {

        viewModelScope.launch {
            val result = profileRepository.getProvidersData(mFirestoreRef)
            if(result.isEmpty()){
                providersData.postValue(Resource.Error("Data not found"))
            }
            providersData.postValue(Resource.Success(result))
            val str = "hello world!"
        }
    }

    val profileImageUrl = MutableLiveData<String>()

    fun uploadProfileImage(imageUri: Uri) {
        viewModelScope.launch {
            val imageUrl = profileRepository.uploadImageToFirebase(imageUri, currentUser.uid)
            profileImageUrl.postValue(imageUrl)
        }
    }

    fun appointRequest(user: ProfileDataModel) {
//        currentUser = mAuth?.currentUser!!
        if(user.userId.equals(""))
            return

        viewModelScope.launch {
//            currentUserData = user
            generalToastResponse.postValue(profileRepository.addUserData(user.toMap(), mFirestoreRef))
        }
    }
}