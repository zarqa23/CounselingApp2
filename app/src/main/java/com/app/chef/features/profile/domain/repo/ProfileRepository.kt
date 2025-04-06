package com.app.chef.features.profile.domain.repo

import android.net.Uri
import com.app.chef.features.profile.domain.model.ProfileDataModel
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import java.util.UUID


class ProfileRepository() {


    suspend fun addUserData(
        userRequestModel: Any,
        firestore: CollectionReference
    ): String {
        return try {
            val documentReference = firestore
                .add(userRequestModel)
                .await()
            "Data saved: ${documentReference.id}" // Return the document ID as a String
        } catch (e: Exception) {
            e.printStackTrace()
            "Error: ${e.message}" // Handle and return the error message
        }
    }

    suspend fun getUserData(
        firestore: CollectionReference,
        condition:Any
    ): ProfileDataModel? {
        return try {
            val querySnapshot = firestore
                .whereEqualTo("userId", condition)
                .get()
                .await()

            if (!querySnapshot.isEmpty) {
                val documentSnapshot = querySnapshot.documents[0]
//                Log.d(javaClass.simpleName, documentSnapshot.toObject(ProfileDataModel::class.java)?.toMap().toString())
                documentSnapshot.toObject(ProfileDataModel::class.java)
            } else {
                null
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    suspend fun getProvidersData(
        firestore: CollectionReference
    ): ArrayList<ProfileDataModel> {
        return try {
            val querySnapshot = firestore
                .whereEqualTo("isProvider", true)
                .get()
                .await()

            if (!querySnapshot.isEmpty) {
                val providerList = ArrayList<ProfileDataModel>()
                for (documentSnapshot in querySnapshot.documents) {
                    documentSnapshot.toObject(ProfileDataModel::class.java)?.let {
                        providerList.add(it)
                    }
                }
                providerList
            } else {
                ArrayList()  // Return an empty list if no providers are found
            }
        } catch (e: Exception) {
            e.printStackTrace()
            ArrayList()  // Return an empty list in case of an error
        }
    }


    suspend fun updateUserData(
        firestore: CollectionReference,
        condition: Any,
        updatedData: Map<String, Any>
    ): String {
        return try {
            val querySnapshot = firestore
                .whereEqualTo("userId", condition)
                .get()
                .await()

            if (!querySnapshot.isEmpty) {
                val documentSnapshot = querySnapshot.documents[0]
                val documentReference = documentSnapshot.reference

                documentReference.update(updatedData).await()
                "Data updated: ${documentReference.id}"
            } else {
                "User data not found"
            }
        } catch (e: Exception) {
            e.printStackTrace()
            "Error: ${e.message}"
        }
    }


    suspend fun uploadImageToFirebase(imageUri: Uri, userId:String): String {
        return withContext(Dispatchers.IO) {
            val storageReference = FirebaseStorage.getInstance().reference.child("profile_images/$userId/${UUID.randomUUID()}.jpg")
            storageReference.putFile(imageUri).await()
            val downloadUrl = storageReference.downloadUrl.await().toString()
            downloadUrl
        }
    }

}