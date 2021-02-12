package com.makhalibagas.ovo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.makhalibagas.ovo.R
import com.makhalibagas.ovo.model.Category
import com.makhalibagas.ovo.model.Help

class CategoryAdapter(private var list: List<Category>) : RecyclerView.Adapter<CategoryAdapter.ViewHolder> (){

    class ViewHolder(v:View) : RecyclerView.ViewHolder(v) {

        val img = v.findViewById<ImageView>(R.id.iv_icon)
        val name = v.findViewById<TextView>(R.id.tv_name)

        fun bind(category: Category){
            Glide.with(itemView.context).load(category.icon).into(img)
            name.text = category.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val category = list[position]
        holder.bind(category)

    }
}