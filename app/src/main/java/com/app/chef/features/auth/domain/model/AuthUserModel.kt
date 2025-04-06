package com.app.chef.features.auth.domain.model


data class AuthUserModel(
    var vName: String?=null,
    var vPhone: String = "",
    var vEmail: String?=null,
    var vGender: String = "",
    var vImage: String = "",
    var vDob: String = "",
    var iServiceCharges: String = "",
    var companyFee: Long = 0,
    var iSpecialization: String = "",
    var iQualification: String = "",
    var iModule: String = "",    // Career counselor, Field expert, business coach
    var iActiveSlots: List<Map<String, String>> = emptyList(),    // keys -> weekDays [monday, tuesday..]
    var userId: String?=null,
    var token: String = "",
    var phoneVerified: Boolean = false,
    var isProvider: Boolean = true,
    var emailVerified: Boolean = false,
    var userVerified: Boolean = false,
    var notificationEnabled: Boolean = false,
    var address: String = "",
    var latitude: Long? = null,
    var longitude: Long? = null,
    var myBookings: List<Map<String, String>> = emptyList() // Expected list type
) {

    fun toMap(): Any {
        return mapOf(

            "vName" to vName,
            "vPhone" to vPhone,
            "vEmail" to vEmail,
            "vGender" to vGender,
            "vImage" to vImage,
            "vDob" to vDob,
            "iServiceCharges" to iServiceCharges,
            "companyFee" to companyFee,
            "iSpecialization" to iSpecialization,
            "iQualification" to iQualification,
            "iModule" to iModule,
            "iActiveSlots" to iActiveSlots,
            "userId" to userId,
            "token" to token,
            "phoneVerified" to phoneVerified,
            "isProvider" to isProvider,
            "emailVerified" to emailVerified,
            "userVerified" to userVerified,
            "notificationEnabled" to notificationEnabled,
            "address" to address,
            "latitude" to latitude,
            "longitude" to longitude,
            "myBookings" to myBookings
        )
    }
}
