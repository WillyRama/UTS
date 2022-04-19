package com.example.utswilly

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class YamahaAdapter (private val context: Context, private val yamaha: List<Yamaha>, val listener: (Yamaha) ->Unit)
    : RecyclerView.Adapter<YamahaAdapter.YamahaViewHolder>(){

    class YamahaViewHolder (view: View): RecyclerView.ViewHolder(view) {

        val imgYamaha: ImageView = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameYamaha = view.findViewById<TextView>(R.id.tv_item_name)
        val descYamaha = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(yamaha: Yamaha, listener: (Yamaha) -> Unit) {
            imgYamaha.setImageResource(yamaha.imgYamaha)
            nameYamaha.text = yamaha.nameYamaha
            descYamaha.text = yamaha.descriptionYamaha
            itemView.setOnClickListener{listener(yamaha)}

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YamahaViewHolder {
        return YamahaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_yamaha,parent, false)
        )
    }

    override fun onBindViewHolder(holder: YamahaViewHolder, position: Int) {
        holder.bindView(yamaha [position], listener)
    }

    override fun getItemCount(): Int = yamaha.size
}