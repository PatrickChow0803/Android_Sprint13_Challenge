package com.lambda.analytics.bestpracticechallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lambda.analytics.bestpracticechallenge.model.Makeup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.makeup_item.view.*

class MakeupAdapter(private val makeupList: List<Makeup>) : RecyclerView.Adapter<MakeupAdapter.ViewHolder>() {
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.makeup_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentMakeup = makeupList[position]
        Picasso.get().load(currentMakeup.image_link).into(holder.image)
        holder.name.text = currentMakeup.name
        holder.price.text = currentMakeup.price
        holder.rating.text = currentMakeup.rating
    }

    override fun getItemCount() = makeupList.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.iv_image
        val name: TextView = view.tv_makeup_name
        val rating: TextView = view.tv_makeup_rating
        val price: TextView = view.tv_makeup_price
    }
}