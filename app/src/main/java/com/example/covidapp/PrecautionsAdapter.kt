package com.example.covidapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PrecautionsAdapter (var precautionList: ArrayList<Model>):RecyclerView.Adapter<PrecautionsAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrecautionsAdapter.ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {

        return  precautionList.size
    }

    override fun onBindViewHolder(holder: PrecautionsAdapter.ViewHolder, position: Int) {
        val precautionsModel = precautionList[position]
        holder.bind(precautionsModel)

    }

    class ViewHolder(inflater: LayoutInflater, viewGroup: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.item_symptoms,viewGroup,false)){

        fun bind(precautionsModel: Model){
            val symptomsText = itemView.findViewById<TextView>(R.id.txtSympyoms)
            val symptomsDetails = itemView.findViewById<TextView>(R.id.txtSympyomsDetail)
            val imageView = itemView.findViewById<ImageView>(R.id.imageView)
            imageView.setImageResource(precautionsModel.imageview)
            symptomsText.text = precautionsModel.symptomsText
            symptomsDetails.text = precautionsModel.symptomsDetail

        }

    }


}