package com.example.mech_aid.ui.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.cardview.widget.CardView
import com.example.mech_aid.Login
import com.example.mech_aid.R
import com.example.mech_aid.Service1

class ServicesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)

        var card1 = findViewById<RelativeLayout>(R.id.card1)

        card1.setOnClickListener{
            val intent = Intent(this, Service1::class.java)
            startActivity(intent)
        }
    }
}