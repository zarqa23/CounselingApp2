package com.android.doctorapp.features.itemdetails.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.android.doctorapp.R
import com.android.doctorapp.databinding.ProductItemDesignBinding
import com.app.chef.features.profile.domain.model.ProfileDataModel



class ProductsRecycAdapter : RecyclerView.Adapter<ProductsRecycAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: ProductItemDesignBinding) : RecyclerView.ViewHolder(binding.root)

    private val differCallback = object : DiffUtil.ItemCallback<ProfileDataModel>() {
        override fun areItemsTheSame(oldItem: ProfileDataModel, newItem: ProfileDataModel): Boolean {
            return oldItem.userId == newItem.userId
        }

        override fun areContentsTheSame(oldItem: ProfileDataModel, newItem: ProfileDataModel): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ProductItemDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = differ.currentList[position]
        holder.binding.apply {
            name.text = item.vName
            qualif.text = item.iModule
//            specializ.text = item.iSpecialization
            charges.text = item.iServiceCharges
            if(item.vImage.isNotEmpty())
                Glide.with(root).load(item.vImage).into(image)

            chatArea.setOnClickListener{
                onItemClickListener?.let {
                    it(item, position)
                }
            }
            rootLayArea.setOnClickListener{
                onItemRootClickListener?.let {
                    it(item, position)
                }
            }
        }
    }

    private var onItemClickListener: ((ProfileDataModel, Int)-> Unit)? = null
    private var onItemRootClickListener: ((ProfileDataModel, Int)-> Unit)? = null


    fun setOnItemClickListener(listener: (ProfileDataModel, Int)-> Unit){
        onItemClickListener = listener
    }
    fun setOnItemRootClickListener(listener: (ProfileDataModel, Int)-> Unit){
        onItemRootClickListener = listener
    }
}
