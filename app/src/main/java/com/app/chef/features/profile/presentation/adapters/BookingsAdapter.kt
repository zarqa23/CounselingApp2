package com.app.chef.features.profile.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.android.doctorapp.core.helper.SharedPrefHelper
import com.android.doctorapp.databinding.LayoutBookingsItemBinding
import com.bumptech.glide.Glide


class BookingsAdapter : RecyclerView.Adapter<BookingsAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: LayoutBookingsItemBinding) : RecyclerView.ViewHolder(binding.root)

    private val differCallback = object : DiffUtil.ItemCallback<Map<String, String>>() {
        override fun areItemsTheSame(oldItem: Map<String, String>, newItem: Map<String, String>): Boolean {
            return oldItem.get("clientId") == newItem.get("clientId")
        }

        override fun areContentsTheSame(oldItem: Map<String, String>, newItem: Map<String, String>): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = LayoutBookingsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = differ.currentList[position]
        holder.binding.apply {

            if(SharedPrefHelper(root.context).isProvider()){
                name.text = item.get("clientName")
                module.text = item.get("clientModule")
                time.text = item.get("vSchedule")
                if (!item.get("image").isNullOrEmpty())
                    Glide.with(root).load(item.get("image")).into(image)
            }else {
                name.text = item.get("providerName")
                module.text = item.get("providerModule")
                time.text = item.get("vSchedule")
                if(!item.get("providerImage").isNullOrEmpty())
                    Glide.with(root).load(item.get("providerImage")).into(image)
            }

            chatArea.setOnClickListener {
                onChatClickListener?.let {
                    if(SharedPrefHelper(root.context).isProvider())
                        it(item.get("clientId").toString(), position)
                    else
                        it(item.get("providerId").toString(), position)
                }
            }
            callArea.setOnClickListener {
                onCallClickListener?.let {
                    if(SharedPrefHelper(root.context).isProvider())
                        it(item.get("clientPhone").toString(), position)
                    else
                        it(item.get("providerPhone").toString(), position)
                }
            }
        }
    }

    private var onChatClickListener: ((String, Int)-> Unit)? = null
    private var onCallClickListener: ((String, Int)-> Unit)? = null

    fun setOnChatClickListener(listener: (String, Int)-> Unit){
        onChatClickListener = listener
    }
    fun setOnCallClickListener(listener: (String, Int)-> Unit){
        onCallClickListener = listener
    }
}
