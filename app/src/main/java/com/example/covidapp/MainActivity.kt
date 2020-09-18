package com.example.covidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast

import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
        val symptomsList = ArrayList<Model>()
        symptomsList.add(
            Model(
                R.drawable.cough,
                "Dry Cough",
                ""
            )
        )
        symptomsList.add(
            Model(
                R.drawable.fever,
                "Fever",
                ""
            )
        )
        symptomsList.add(
            Model(
                R.drawable.pain,
                "Headache",
                ""
            )
        )


        val symptomsAdapter = SymptomsAdapter(symptomsList)

        recyclerView.adapter = symptomsAdapter

        recyclerViewPrecautions.layoutManager =
            LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
        val precautionList = ArrayList<Model>()
        precautionList.add(
            Model(
                R.drawable.soap,
                "Hand Wash",
                "Wash your hands frequently"
            )
        )
        precautionList.add(
            Model(
                R.drawable.hone,
                "Stay Home",
                "Stay at home if you feel unwell - even with a slight fever and cough"
            )
        )
        precautionList.add(
            Model(
                R.drawable.distance,
                "Social Distance",
                "Avoid crowded places"
            )
        )

        val precautionsAdapter = PrecautionsAdapter(precautionList)

        recyclerViewPrecautions.adapter = precautionsAdapter


        recyclerViewMyths.layoutManager =
            LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
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
                "There are currently no drugs licensed for the treatment or prevention of COVID-19."
            )
        )
        mythsList.add(
            Model(
                R.drawable.n3,
                "",
                "COVID-19 IS NOT transmitted through houseflies."
            )
        )

        val mythsAdapter = MythsAdapter(mythsList)

        recyclerViewMyths.adapter = mythsAdapter

        recyclerViewFun.layoutManager =
            LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
        val funList = ArrayList<Model>()
        funList.add(
            Model(
                R.drawable.f1,
                "",
                "Complete a puzzle: The more pieces the better! Feeling extra saucy? Take on a Rubik's Cube. More of a word person? Crossword puzzle!."
            )
        )
        funList.add(
            Model(
                R.drawable.f2,
                "",
                "Start a journal or blog. Sure, it can be about the coronavirus, but it could also be about a specific interest from chess to cheese."
            )
        )
        funList.add(
            Model(
                R.drawable.f3,
                "",
                "If it won't bother your neighbors: Dust off that old instrument and practice."
            )
        )

        val funAdapter = MythsAdapter(funList)

        recyclerViewFun.adapter = funAdapter





        txtViewSymptoms.setOnClickListener {
            var intent = Intent(this@MainActivity, SymptomsActivity::class.java)
            startActivity(intent)
        }

        btnKnowMore.setOnClickListener {
            var intent = Intent(this@MainActivity, MainActivitySecond::class.java)
            startActivity(intent)
        }
        btnKnowMoreCovid.setOnClickListener {
            var intent = Intent(this@MainActivity, KnowMoreActivity::class.java)
            startActivity(intent)
        }

        txtViewPrecautions.setOnClickListener {
            var intent = Intent(this@MainActivity, PrecautionActivity::class.java)
            startActivity(intent)
        }
        txtViewMyths.setOnClickListener {
            var intent = Intent(this@MainActivity, MythsActivity::class.java)
            startActivity(intent)
        }
        txtViewFun.setOnClickListener {
            var intent = Intent(this@MainActivity, FunActivity::class.java)
            startActivity(intent)
        }


        getGlobalData()
    }


    fun getGlobalData() {
        val url: String = "https://disease.sh/v2/all"

        val stringRequest = StringRequest(
            Request.Method.GET,
            url,
            Response.Listener<String> {

                var jsonObject = JSONObject(it.toString())


                txtInfected.text = jsonObject.getString("cases")
                txtRecovered.text = jsonObject.getString("recovered")
                txtDeceased.text = jsonObject.getString("deaths")

            },
            Response.ErrorListener {
                Toast.makeText(this@MainActivity, "Something went wrong",Toast.LENGTH_SHORT).show()
                txtInfected.text = "-"
                txtRecovered.text = "-"
                txtDeceased.text = "-"

            }
        )

        val requestQueue = Volley.newRequestQueue(this@MainActivity)
        requestQueue.add(stringRequest)

    }



}
