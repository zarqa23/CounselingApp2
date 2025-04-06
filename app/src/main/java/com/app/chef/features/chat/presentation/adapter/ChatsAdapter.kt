package com.app.chef.features.chat.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.doctorapp.core.helper.SharedPrefHelper
import com.android.doctorapp.databinding.MessageItemBinding
import com.app.chef.features.chat.domain.model.ChatsModel
import com.bumptech.glide.Glide
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


class ChatsAdapter(var list: ArrayList<ChatsModel>) : RecyclerView.Adapter<ChatsAdapter.MyViewHolder>() {


    inner class MyViewHolder(val binding: MessageItemBinding) : RecyclerView.ViewHolder(binding.root)

    /*private val differCallback = object : DiffUtil.ItemCallback<ChatsModel>() {
        override fun areItemsTheSame(oldItem: ChatsModel, newItem: ChatsModel): Boolean {
            val b: Boolean = (oldItem.messageId==newItem.messageId)
            return oldItem.messageId == newItem.messageId
        }

        override fun areContentsTheSame(oldItem: ChatsModel, newItem: ChatsModel): Boolean {
            val b: Boolean = (oldItem==newItem)
            return oldItem == newItem
        }
    }*/

//    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = MessageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
//        return differ.currentList.size
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        val item = differ.currentList[position]
        val item = list.get(position)
        holder.binding.apply {
            when(item.iUserType){
                "provider" -> {
                    if(!SharedPrefHelper(holder.binding.root.context).isProvider()){
                        userChatArea.visibility = View.VISIBLE
                        providerChatArea.visibility = View.GONE
                        tvMessageUser.text = item.message
                        tvTimeUser.text = formatTime(item.timestamp)
                        return
                    }
                    userChatArea.visibility = View.GONE
                    providerChatArea.visibility = View.VISIBLE

//                    Glide.with(root).load(item.receiverImage).into(ivProvider)
                    tvMessage.text = item.message
                    tvTime.text = formatTime(item.timestamp)
                }
                "user" -> {
                    if(!SharedPrefHelper(holder.binding.root.context).isProvider()){
                        userChatArea.visibility = View.GONE
                        providerChatArea.visibility = View.VISIBLE
                        tvMessage.text = item.message
                        tvTime.text = formatTime(item.timestamp)
                        return
                    }
                    userChatArea.visibility = View.VISIBLE
                    providerChatArea.visibility = View.GONE

//                    Glide.with(root).load(item.receiverImage).into(ivProfileUser)
                    tvMessageUser.text = item.message
                    tvTimeUser.text = formatTime(item.timestamp)
                }
            }

        }
    }
    fun formatTime(milliseconds: Long): String {
        val sdf = SimpleDateFormat("d MMM hh:mm a", Locale.getDefault())
        val date = Date(milliseconds)
        return sdf.format(date)
    }

    private var onItemClickListener: ((ChatsModel, Int)-> Unit)? = null

    fun setOnItemClickListener(listener: (ChatsModel, Int)-> Unit){
        onItemClickListener = listener
    }
}
