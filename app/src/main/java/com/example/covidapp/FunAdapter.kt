package com.example.covidapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FunAdapter (var funList: ArrayList<Model>):RecyclerView.Adapter<FunAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FunAdapter.ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {

        return  funList.size
    }

    override fun onBindViewHolder(holder: FunAdapter.ViewHolder, position: Int) {
        val symptomsModel = funList[position]
        holder.bind(symptomsModel)

    }

    class ViewHolder(inflater: LayoutInflater, viewGroup: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.item_myths,viewGroup,false)){

        fun bind(funModel: Model){
            val symptomsText = itemView.findViewById<TextView>(R.id.txtSympyoms)
            val symptomsDetails = itemView.findViewById<TextView>(R.id.txtSympyomsDetail)
            val imageView = itemView.findViewById<ImageView>(R.id.imageView)
            imageView.setImageResource(funModel.imageview)
            symptomsText.text = funModel.symptomsText
            symptomsDetails.text = funModel.symptomsDetail

        }

    }


}