package com.android.doctorapp.features.auth.domain.repo

import android.util.Log
import com.app.chef.features.auth.domain.model.AuthUserModel
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class AuthRepository(
) {

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
    ): AuthUserModel? {
        return try {
            val querySnapshot = firestore
                .whereEqualTo("userId", condition)
                .get()
                .await()

            if (!querySnapshot.isEmpty) {
                val documentSnapshot = querySnapshot.documents[0]
                Log.d("FirestoreDocument", documentSnapshot.data.toString())
//                Log.d(javaClass.simpleName, documentSnapshot.toObject(AuthUserModel::class.java)?.toMap().toString())
                documentSnapshot.toObject(AuthUserModel::class.java)
            } else {
                null
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
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

}