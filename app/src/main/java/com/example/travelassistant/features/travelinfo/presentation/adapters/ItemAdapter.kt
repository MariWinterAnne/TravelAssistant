package com.example.travelassistant.features.travelinfo.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.travelassistant.R
import com.example.travelassistant.core.domain.entity.PersonalItem
import com.example.travelassistant.databinding.FragmentItemBinding

class ItemAdapter(
    private val items: MutableList<PersonalItem>
) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(val binding: FragmentItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        FragmentItemBinding.bind(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_item, parent, false)
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.itemName.text = items[position].item
    }

    fun setItems(itemsList: List<PersonalItem>) {
        if (itemsList.isNotEmpty()) {
            items.clear()
            items.addAll(itemsList)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount() = items.size
}