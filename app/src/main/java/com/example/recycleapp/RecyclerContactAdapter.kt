package com.example.recycleapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerContactAdapter(private val context: Context, private val contactList: ArrayList<ContactModel>) :
    RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = contactList[position]

        // Bind data to views in the ViewHolder
        holder.imageView.setImageResource(currentItem.image)
        holder.nameTextView.text = currentItem.name
        holder.phoneTextView.text = currentItem.phone
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.contact_image)
        val nameTextView: TextView = itemView.findViewById(R.id.contact_name)
        val phoneTextView: TextView = itemView.findViewById(R.id.contact_phone)
    }
}
