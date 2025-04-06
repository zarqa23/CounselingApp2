package com.app.chef.features.dashboard.presentation.screens

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.doctorapp.R
import com.android.doctorapp.core.utils.MyApp
import com.android.doctorapp.core.utils.Resource
import com.android.doctorapp.databinding.ActivityProviderDetailsBinding
import com.android.doctorapp.features.dashboard.presentation.MainActivity
import com.app.chef.features.profile.data.ProfileVMProviderFact
import com.app.chef.features.profile.data.ProfileViewModel
import com.app.chef.features.profile.domain.model.ProfileDataModel
import com.app.chef.features.profile.domain.repo.ProfileRepository
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class ProviderDetailsActivity : AppCompatActivity() {

    private lateinit var b: ActivityProviderDetailsBinding
    private lateinit var data: ProfileDataModel
    private lateinit var myApp: MyApp
    private lateinit var viewModel: ProfileViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityProviderDetailsBinding.inflate(layoutInflater)
        setContentView(b.root)
        myApp = MyApp(this)
        setupViewmodel()

        data = (intent.getSerializableExtra("data") as? ProfileDataModel)!!
        if (data == null) {
            myApp.showToast("Data not found!")
            finish()
        }
        setViews()
        observe()
    }

    private fun setupViewmodel() {
        val prodsRepository = ProfileRepository()
        val vmProviderFactory = ProfileVMProviderFact(prodsRepository)
        viewModel = ViewModelProvider(this, vmProviderFactory).get(ProfileViewModel::class.java)
        viewModel.getUserData()
    }


    private fun setViews() {

        b.apply {
            toolbar.userProfileImage.visibility = View.GONE
            toolbar.backImgView.visibility = View.VISIBLE
            data?.let {
                etField1.text = it.vName
                etField2.text = it.vEmail
                etField3.text = it.vPhone
                etField4.text = it.iQualification
                etField5.text = it.iSpecialization
                etField6.text = it.vGender
                etField7.text = it.iModule
                etField8.text = it.iServiceCharges
            }

            toolbar.backImgView.setOnClickListener {
                finish()
            }

            etField9.setOnClickListener {
                openDatePicker()
            }

            tvType1.setOnClickListener {
                if(etField9.text.isNotEmpty()){
                    val currentUser = viewModel.currentUserDataModel
                    var map = mapOf<String, String>(
                        "clientId" to currentUser.userId!!,
                        "clientName" to currentUser.vName!!,
                        "clientPhone" to currentUser.vPhone,
                        "clientModule" to currentUser.iModule,
                        "image" to currentUser.vImage,
                        "providerId" to data.userId!!,
                        "providerName" to data.vName!!,
                        "providerModule" to data.iModule,
                        "providerPhone" to data.vPhone,
                        "providerImage" to data.vImage,
                        "vSchedule" to etField9.text.toString()
                    )
                    var updatedBookings = data.myBookings.toMutableList()
                    updatedBookings.add(map)
//                    data.myBookings = updatedBookings
                    viewModel.updateUserDataById(mapOf(
                        "myBookings" to updatedBookings
                    ), data.userId!!)


                    updatedBookings = currentUser.myBookings.toMutableList()
                    map.toMutableMap().put("image", data.vImage)
                    updatedBookings.add(map)
                    viewModel.updateUserData(mapOf(
                        "myBookings" to updatedBookings
                    ))
                }
            }
        }
    }
    private fun observe() {
        viewModel.editModeUserData.observe(this, Observer {
            when(it){
                is Resource.Success -> {
                    finish()
                }
                is Resource.Error -> {

                }
                is Resource.Loading -> {}
            }
        })
    }

    private fun openDatePicker() {
        val calendar = Calendar.getInstance()
        val datePickerDialog = DatePickerDialog(
            this,
            { _, year, month, dayOfMonth ->

                openTimePicker(year, month+1, dayOfMonth)
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )
        datePickerDialog.datePicker.minDate = calendar.timeInMillis
        datePickerDialog.show()
    }
    private fun openTimePicker(year: Int, month: Int, dayOfMonth: Int) {
        val currentCalendar = Calendar.getInstance()

        TimePickerDialog(
            this,
            { _, hourOfDay, minute ->
                val selectedCalendar = Calendar.getInstance()
                selectedCalendar.set(year, month, dayOfMonth, hourOfDay, minute)

                if (selectedCalendar.timeInMillis > currentCalendar.timeInMillis) {
                    // Format as "22 Aug 2024 - 5:40 PM"
                    val dateFormat = SimpleDateFormat("dd MMM yyyy - h:mm a", Locale.getDefault())
                    val formattedDate = dateFormat.format(selectedCalendar.time)
                    b.etField9.text = formattedDate

                } else {
                    myApp.showMessage(b.root, "Please select future date/time to schedule appointment")
                }
            },
            currentCalendar.get(Calendar.HOUR_OF_DAY),
            currentCalendar.get(Calendar.MINUTE),
            false
        ).show()
    }
}