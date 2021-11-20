package com.example.mech_aid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.cardview.widget.CardView

class Service1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service1)

        var expandBtn = findViewById<Button>(R.id.expandBtn)
        var expandBtn2 = findViewById<Button>(R.id.expandBtn2)
        var expandableLayout = findViewById<LinearLayout>(R.id.expandableLayout)
        var expandableLayout2 = findViewById<LinearLayout>(R.id.expandableLayout2)
        var cardView = findViewById<CardView>(R.id.cardView)
        var cardView2 = findViewById<CardView>(R.id.cardView2)

        expandBtn.setOnClickListener {
            if(expandableLayout.visibility == View.GONE){
                TransitionManager.beginDelayedTransition(cardView, AutoTransition())
                expandableLayout.visibility = View.VISIBLE
                expandBtn.text ="COLLAPSE"
            }
            else{
                TransitionManager.beginDelayedTransition(cardView, AutoTransition())
                expandableLayout.visibility = View.GONE
                expandBtn.text ="EXPAND"
            }
        }

        expandBtn2.setOnClickListener {
            if(expandableLayout2.visibility == View.GONE){
                TransitionManager.beginDelayedTransition(cardView2, AutoTransition())
                expandableLayout2.visibility = View.VISIBLE
                expandBtn2.text ="COLLAPSE"
            }
            else{
                TransitionManager.beginDelayedTransition(cardView2, AutoTransition())
                expandableLayout2.visibility = View.GONE
                expandBtn2.text ="EXPAND"
            }
        }
    }
}