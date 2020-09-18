package com.example.covidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_precaution.*

class PrecautionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_precaution)

        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val precautionList = ArrayList<Model>()
        precautionList.add(
            Model(
                R.drawable.soap,
                "Hand Wash",
                "Wash your hands frequently."
            )
        )
        precautionList.add(
            Model(
                R.drawable.hone,
                "Stay Home",
                "Stay at home if you feel unwell - even with a slight fever and cough."
            )
        )
        precautionList.add(
            Model(
                R.drawable.distance,
                "Social Distance",
                "Avoid crowded places."
            )
        )
        precautionList.add(
            Model(
                R.drawable.clean,
                "Clean Object & Surface",
                "Always remember to clean stuff around you."
            )
        )

        precautionList.add(
            Model(
                R.drawable.cover,
                "Avoid Touching",
                "Avoid touching your eyes, mouth and nose."
            )
        )
        val precautionsAdapter = PrecautionsAdapter(precautionList)

        recyclerView.adapter = precautionsAdapter
    }
}
