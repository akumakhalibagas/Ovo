package com.makhalibagas.ovo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.makhalibagas.ovo.R
import com.makhalibagas.ovo.model.Help

class HelpAdapter(private var list: List<Help>) : RecyclerView.Adapter<HelpAdapter.ViewHolder> (){

    class ViewHolder(v:View) : RecyclerView.ViewHolder(v) {

        val img = v.findViewById<ImageView>(R.id.iv_icon)
        val name = v.findViewById<TextView>(R.id.tv_name)

        fun bind(help: Help){
            Glide.with(itemView.context).load(help.icon).into(img)
            name.text = help.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_help, parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val bantuan = list[position]
        holder.bind(bantuan)

    }
}