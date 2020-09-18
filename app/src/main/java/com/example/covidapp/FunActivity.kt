package com.example.covidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_fun.*

class FunActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun)

        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayout.VERTICAL, false)
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
        funList.add(
            Model(
                R.drawable.f4,
                "",
                "Watch all the really long movies you’ve avoided until now."
            )
        )

        funList.add(
            Model(
                R.drawable.f5,
                "",
                "Download Duolingo App, or a similar app, and teach yourself a foreign language."
            )
        )

        funList.add(
            Model(
                R.drawable.f6,
                "",
                "Look at pictures of puppies or kitties."
            )
        )
        funList.add(
            Model(
                R.drawable.f7,
                "",
                "Learn calligraphy. YouTube can help."
            )
        )
        funList.add(
            Model(
                R.drawable.f8,
                "",
                "Knit or crochet."
            )
        )
        funList.add(
            Model(
                R.drawable.f9,
                "",
                "Use Skype, FaceTime, Google Hangouts or Marco Polo to video chat with your long-distance friends."
            )
        )
        funList.add(
            Model(
                R.drawable.f10,
                "",
                "Learn How to Code, so you can build like this app and help other people (: ."
            )
        )
        val funAdapter = MythsAdapter(funList)

        recyclerView.adapter = funAdapter
    }
}
