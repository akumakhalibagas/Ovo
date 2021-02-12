package com.makhalibagas.ovo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.makeramen.roundedimageview.RoundedImageView
import com.makhalibagas.ovo.R
import com.makhalibagas.ovo.model.Metode

class MetodeAdapter(private var list: List<Metode>) : RecyclerView.Adapter<MetodeAdapter.ViewHolder> (){

    class ViewHolder(v:View) : RecyclerView.ViewHolder(v) {

        val img = v.findViewById<ImageView>(R.id.iv_icon)
        val name = v.findViewById<TextView>(R.id.tv_name)

        fun bind(metode: Metode){
            Glide.with(itemView.context).load(metode.icon).into(img)
            name.text = metode.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_metode, parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val metode = list[position]
        holder.bind(metode)

    }
}