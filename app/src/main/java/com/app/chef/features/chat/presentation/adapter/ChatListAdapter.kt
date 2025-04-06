package com.app.chef.features.chat.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.android.doctorapp.databinding.ChatListLayoutItemBinding
import com.app.chef.features.chat.domain.model.ChatListModel


class ChatListAdapter : RecyclerView.Adapter<ChatListAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: ChatListLayoutItemBinding) : RecyclerView.ViewHolder(binding.root)

    private val differCallback = object : DiffUtil.ItemCallback<ChatListModel>() {
        override fun areItemsTheSame(oldItem: ChatListModel, newItem: ChatListModel): Boolean {
            return oldItem.senderId == newItem.senderId
        }

        override fun areContentsTheSame(oldItem: ChatListModel, newItem: ChatListModel): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ChatListLayoutItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = differ.currentList[position]
        holder.binding.apply {
//            if(item.iUserType.equals("user")){
                name.text = item.senderName
                module.text = item.iModule
//            }

            rootArea.setOnClickListener {
                onItemClickListener?.let {
                    it(item, position)
                }
            }
        }
    }

    private var onItemClickListener: ((ChatListModel, Int)-> Unit)? = null

    fun setOnItemClickListener(listener: (ChatListModel, Int)-> Unit){
        onItemClickListener = listener
    }
}
