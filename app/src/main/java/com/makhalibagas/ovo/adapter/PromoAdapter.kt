package com.makhalibagas.ovo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.makeramen.roundedimageview.RoundedImageView
import com.makhalibagas.ovo.R
import com.makhalibagas.ovo.model.Promo

class PromoAdapter(private var list: List<Promo>) : RecyclerView.Adapter<PromoAdapter.ViewHolder> (){


    class ViewHolder(v:View) : RecyclerView.ViewHolder(v) {

        val img = v.findViewById<RoundedImageView>(R.id.img)
        fun bind(promos: Promo){
            Glide.with(itemView.context).load(promos.img).into(img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val promos = list[position]
        holder.bind(promos)

    }
}