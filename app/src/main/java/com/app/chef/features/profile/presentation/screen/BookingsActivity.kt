package com.app.chef.features.profile.presentation.screen

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.doctorapp.R
import com.android.doctorapp.core.helper.SharedPrefHelper
import com.android.doctorapp.core.utils.Resource
import com.android.doctorapp.databinding.ActivityBookingsBinding
import com.android.doctorapp.features.itemdetails.presentation.adapter.ProductsRecycAdapter
import com.app.chef.features.chat.presentation.ChatActivity
import com.app.chef.features.profile.presentation.adapters.BookingsAdapter
import com.app.chef.features.profile.presentation.base.ProfileBaseActivity

class BookingsActivity : ProfileBaseActivity() {

    private lateinit var b: ActivityBookingsBinding
    private lateinit var bookingsAdp: BookingsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityBookingsBinding.inflate(layoutInflater)
        setContentView(b.root)

        setViews()
        observe()
    }

    private fun observe() {
        viewModel.currentUserData.observe(this, Observer {
            when(it) {
                is Resource.Success -> {
                    it.data?.let {
                        bookingsAdp.differ.submitList(it.myBookings.toMutableList())
                    }
                }
                is Resource.Error -> {

                }
                is Resource.Loading -> {}
            }
        })
        viewModel.getUserData()
    }

    private fun setViews() {
        b.toolbar.titleTxt.text = "My Bookings"
        b.toolbar.userProfileImage.visibility = View.GONE
        b.toolbar.backImgView.visibility = View.VISIBLE
        b.toolbar.backImgView.setOnClickListener { finish() }

        bookingsAdp = BookingsAdapter()
        b.bookingsRecyc.apply {
            adapter = bookingsAdp
            layoutManager = LinearLayoutManager(this@BookingsActivity, LinearLayoutManager.VERTICAL, false)
        }
        bookingsAdp.setOnChatClickListener { clientId, posi ->
            var node = ""
            if(SharedPrefHelper(this).isProvider())
                node = "user:${clientId}_provider:${viewModel.currentUserData.value?.data?.userId}"
            else
                node = "user:${viewModel.currentUserData.value?.data?.userId}_provider:${clientId}"
            startActivity(Intent(this, ChatActivity::class.java).apply {
                putExtra("node", node)
            })
        }

        bookingsAdp.setOnCallClickListener { call, posi ->
            callUser(call)
        }
    }


    private fun callUser(phoneNumber: String) {
        if(phoneNumber.isNullOrEmpty())
            return
        try {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$phoneNumber") // Set the phone number
            }
            startActivity(intent)
            /*if (intent.resolveActivity(packageManager) != null) {
            } else {
                myApp.showToast("No app available to handle the call functionality")
            }*/

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}