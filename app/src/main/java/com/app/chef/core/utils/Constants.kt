package com.android.doctorapp.core.utils

object Constants {


        const val BASE_URL = "https://fakestoreapi.com"
        const val API_KEY = "ab0cd1ef2gh3ij4kl5mn6op7qr8st9uv0wx1yz"

        // Room - database
        const val ROOM_DB_NAME = "products_db.db"
        const val ROOM_DB_VERSION = 1
        const val PRODUCTS_TABLE_NAME = "products"


    object ConstantsDb{
        const val TABLE_USER_DATA:String = "providers_data"

        const val MODULE_COUNSELOR:String = "Counselor"
        const val MODULE_COACH:String = "Coach"
        const val MODULE_EXPERT:String = "Expert"

        const val MODULE_STUDENT:String = "Student"
        const val MODULE_BUSINESS:String = "Business"
        const val MODULE_PERSON:String = "Person"
    }

}