package com.example.covidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_myths.*

class MythsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myths)

        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val mythsList = ArrayList<Model>()
        mythsList.add(
            Model(
                R.drawable.n1,
                "",
                "There are currently no drugs licensed for the treatment or prevention of COVID-19."
            )
        )
        mythsList.add(
            Model(
                R.drawable.n2,
                "",
                "Adding pepper to your soup or other meals DOES NOT prevent or cure COVID-19."
            )
        )
        mythsList.add(
            Model(
                R.drawable.n3,
                "",
                "COVID-19 IS NOT transmitted through houseflies."
            )
        )
        mythsList.add(
            Model(
                R.drawable.n4,
                "",
                "Spraying and introducing bleach or another disinfectant into your body WILL NOT protect you against COVID-19 and can be dangerous."
            )
        )

        mythsList.add(
            Model(
                R.drawable.n5,
                "",
                "Drinking methanol, ethanol or bleach DOES NOT prevent or cure COVID-19 and can be extremely dangerous."
            )
        )
        mythsList.add(
            Model(
                R.drawable.n6,
                "",
                "5G mobile networks DO NOT spread COVID-19."
            )
        )
        mythsList.add(
            Model(
                R.drawable.n7,
                "",
                "Drinking alcohol does not protect you against COVID-19 and can be dangerous."
            )
        )
        mythsList.add(
            Model(
                R.drawable.n8,
                "",
                "COVID-19 virus can be transmitted in areas with hot and humid climates."
            )
        )
        mythsList.add(
            Model(
                R.drawable.n9,
                "",
                "Cold weather and snow CANNOT kill the new coronavirus."
            )
        )
        mythsList.add(
            Model(
                R.drawable.n10,
                "",
                "Taking a hot bath does not prevent the new coronavirus disease."
            )
        )

        val mythsAdapter = MythsAdapter(mythsList)

        recyclerView.adapter = mythsAdapter
    }
}
