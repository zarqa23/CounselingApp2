package com.app.chef.features.profile.presentation.screen

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import androidx.core.content.FileProvider
import androidx.lifecycle.Observer
import com.android.doctorapp.core.utils.MyApp
import com.android.doctorapp.core.utils.MyApp.Companion.PERMISSIONS_REQUEST_CODE
import com.android.doctorapp.core.utils.Resource
import com.android.doctorapp.core.utils.TAGS
import com.android.doctorapp.databinding.ActivityEditProfileBinding
import com.app.chef.features.profile.domain.model.ProfileDataModel
import com.app.chef.features.profile.presentation.base.ProfileBaseActivity
import com.bumptech.glide.Glide
import java.io.File
import java.util.Calendar

class EditProfileActivity : ProfileBaseActivity() {

    private lateinit var b: ActivityEditProfileBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(b.root)

        setupViews()
        observeData()
        viewModel.getUserData()


        viewModel.profileImageUrl.observe(this) { imageUrl ->
//            Toast.makeText(this, "Image uploaded: $imageUrl", Toast.LENGTH_SHORT).show()
            Glide.with(this).load(imageUrl).into(b.ivImage)
            viewModel.updateUserData(mapOf<String, Any>("vImage" to imageUrl))
        }

        b.imageArea.setOnClickListener {
            if (myApp.checkAndRequestPermissions(this)) {
                showImagePickerOptions()
            }
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            PERMISSIONS_REQUEST_CODE -> {
                if (grantResults.isNotEmpty() && grantResults.all { it == PackageManager.PERMISSION_GRANTED }) {
                    showImagePickerOptions()
                } else {
                    Toast.makeText(this, "Permissions are required to proceed.", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun showImagePickerOptions() {
        val options = arrayOf("Take Photo", "Choose from Gallery")
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Choose your profile picture")

        builder.setItems(options) { _, which ->
            when (which) {
                0 -> takePictureFromCamera()
                1 -> choosePictureFromGallery()
            }
        }
        builder.show()
    }

    private fun takePictureFromCamera() {
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(cameraIntent, REQUEST_IMAGE_CAPTURE)
    }

    private fun choosePictureFromGallery() {
        val galleryIntent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(galleryIntent, REQUEST_IMAGE_PICK)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && data != null) {
            when (requestCode) {
                REQUEST_IMAGE_CAPTURE -> {
                    // Check if the data contains a Bitmap
                    val bitmap = data.extras?.get("data") as? Bitmap
                    if (bitmap != null) {
                        // Convert the Bitmap to Uri
                        val imageUri = saveBitmapToUri(bitmap)
                        Log.d(javaClass.simpleName, "$imageUri")
                        viewModel.uploadProfileImage(imageUri)
                    }
                }
                REQUEST_IMAGE_PICK -> {
                    // The selected image is already a Uri
                    val imageUri = data.data
                    if (imageUri != null) {
                        Log.d(javaClass.simpleName, "$imageUri")
                        viewModel.uploadProfileImage(imageUri)
                    }
                }
            }
        }
    }

    private fun saveBitmapToUri(bitmap: Bitmap): Uri {
        // Create a file in the app's cache directory
        val file = File(applicationContext.cacheDir, "${System.currentTimeMillis()}.jpg")
        file.outputStream().use {
            // Compress the Bitmap to the file as JPEG
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, it)
            it.flush()
        }
        // Return the Uri of the file
        return FileProvider.getUriForFile(this, "${applicationContext.packageName}.provider", file)
    }


    companion object {
        private const val REQUEST_IMAGE_CAPTURE = 1
        private const val REQUEST_IMAGE_PICK = 2
    }





    private fun observeData() {
        viewModel.currentUserData.observe(this, Observer { response ->
            when(response){
                is Resource.Loading -> {
                    //                    showProgressBar()
                }
                is Resource.Success -> {
                    //                    hideProgressBar()
                    Log.e(TAGS.API_SUCCESS, "Response: $response ${response::class.simpleName}")
                    response.data?.let {
                        setFieldsData(it)
                    }
                }
                is Resource.Error -> {
                    //                    hideProgressBar()
                    Log.e(TAGS.API_ERR, "An error occurred: $response ${response::class.simpleName}")
                    response?.let { it ->
                        Log.e(TAGS.API_ERR, "An error occurred: ${it.message}")
                        myApp.showToast(it.message.toString())
                    }
                }
            }
        })
    }

    private fun setFieldsData(dataModel: ProfileDataModel) {
        b.apply {
            etField1.setText(dataModel.vName)
            etField2.setText(dataModel.vEmail)
            if(dataModel.vPhone.isNotEmpty())etField3.setText(dataModel.vPhone)else etField3.text.clear()
            if(dataModel.vDob.isNotEmpty())etField4.setText(dataModel.vDob)else etField4.text=""
            if(dataModel.vGender.isNotEmpty()){
                if(dataModel.vGender.equals("Male"))checkboxMale.isChecked = true
                if(dataModel.vGender.equals("Female"))checkboxFemale.isChecked = true
            }
            if(dataModel.vImage.isNotEmpty())
                Glide.with(this@EditProfileActivity).load(dataModel.vImage).into(b.ivImage)
        }
    }

    private fun setupViews() {
        b.apply{
            backImgView.setOnClickListener { finish() }
            checkboxMale.setOnCheckedChangeListener { view, isChecked ->
                if(isChecked){
                    b.checkboxFemale.isChecked = false
                }
            }
            checkboxFemale.setOnCheckedChangeListener { view, isChecked ->
                if(isChecked){
                    b.checkboxMale.isChecked = false
                }
            }
            etField4.setOnClickListener {
                openDatePicker()
            }
            tvType1.setOnClickListener {
                if (validation()) {
                    val data = mapOf<String, Any>(
                        "vName" to etField1.text.toString(),
                        "vPhone" to etField3.text.toString(),
                        "vDob" to etField4.text.toString(),
                        "vGender" to if(checkboxMale.isChecked) "Male" else "Female"
                    )
                    viewModel.updateUserData(data)
                }
            }
        }
    }


    private fun openDatePicker() {
        val calendar = Calendar.getInstance()
        val datePickerDialog = DatePickerDialog(
            this,
            { _, year, month, dayOfMonth ->

                val selectedDate = String.format("%04d-%02d-%02d", year, month + 1, dayOfMonth)
                b.etField4.setText(selectedDate)
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )
        datePickerDialog.datePicker.maxDate = calendar.timeInMillis
        datePickerDialog.show()
    }


    private fun validation(): Boolean {
        b.apply {
            if(etField1.text.isEmpty()){
                myApp.showToast("NAME field can't be empty")
                return false
            }
            if(etField3.text.isEmpty()){
                myApp.showToast("Please enter phone number")
                return false
            }
            if(etField4.text.isEmpty()){
                myApp.showToast("Please enter date of birth")
                return false
            }
            if(!checkboxMale.isChecked && !checkboxFemale.isChecked){
                myApp.showToast("Please select gender")
                return false
            }
            return true
        }
    }
}