package com.example.covidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_symptoms.*

class SymptomsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptoms)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val symptomsList = ArrayList<Model>()
        symptomsList.add(
            Model(
                R.drawable.cough,
                "Dry Cough",
                ""
//                "if a person notices they are coughing a lot for over an hour, or they have three or more coughing episodes in a day, they may have coronavirus."
            )
        )
        symptomsList.add(
            Model(
                R.drawable.fever,
                "Fever",
                ""
//                "Doctors consider a temperature of 100.4°F or higher to be a fever.\n" +
//                        "\n" +
//                        "A person with a fever will feel hot to touch on their back or chest."
            )
        )
        symptomsList.add(
            Model(
                R.drawable.pain,
                "Headache",
                ""
//                "Headaches are a common experience for many adults. On its own, a headache should probably not be cause for alarm, especially if it behaves like other headaches you've experienced."
            )
        )
        symptomsList.add(
            Model(
                R.drawable.sore_throat,
                "Sneeze",
                ""
//                "\"We're seeing sore throat in COVID-19 patients,\" says Aronoff. \"it's what I would say is a minor symptom\" one that's common to lots of other ailments."
            )
        )

        val symptomsAdapter = SymptomsAdapter(symptomsList)

        recyclerView.adapter = symptomsAdapter
    }
}
