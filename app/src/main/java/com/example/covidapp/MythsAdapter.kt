package com.example.covidapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MythsAdapter (var mythsList: ArrayList<Model>):RecyclerView.Adapter<MythsAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MythsAdapter.ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {

        return  mythsList.size
    }

    override fun onBindViewHolder(holder: MythsAdapter.ViewHolder, position: Int) {
        val mythsModel = mythsList[position]
        holder.bind(mythsModel)

    }

    class ViewHolder(inflater: LayoutInflater, viewGroup: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.item_myths,viewGroup,false)){

        fun bind(mythsModel: Model){
            val symptomsText = itemView.findViewById<TextView>(R.id.txtSympyoms)
            val symptomsDetails = itemView.findViewById<TextView>(R.id.txtSympyomsDetail)
            val imageView = itemView.findViewById<ImageView>(R.id.imageView)
            imageView.setImageResource(mythsModel.imageview)
            symptomsText.text = mythsModel.symptomsText
            symptomsDetails.text = mythsModel.symptomsDetail

        }

    }


}