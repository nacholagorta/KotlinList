package com.example.nacho.listkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.card_view.view.*

class myAdapter(val mItems: List<myObject>, context: Context) : RecyclerView.Adapter<myAdapter.ViewHolder>() {

    override
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ViewHolder = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false))

    override fun getItemCount(): Int = mItems.size

    override
    fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bindItems(mItems[position])

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(item: myObject) {
            itemView.txtName.text = item.nombre
            itemView.txtAge.text = item.edad.toString()
            itemView.txtAdress.text = item.dirección
        }
    }
}