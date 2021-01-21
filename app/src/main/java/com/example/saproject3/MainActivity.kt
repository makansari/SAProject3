package com.example.saproject3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            buttonSubmit.setOnClickListener {

               var userName = editTextUsername.text.toString()
                Toast.makeText(this,"username is  : $userName" , Toast.LENGTH_LONG).show()
                textViewResult.setText(userName)

                // Intents  -- explict and implicit
                // explicit Intent -- you explicitly define which activity u have to go

                var i = Intent(this,SecondActivity::class.java)  // Explicit Intent

                i.putExtra("un",userName)

                startActivity(i)


            }

        buttonImpicit.setOnClickListener {

        /*    var myIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:898828282"))
            startActivity(myIntent)*/

            var myIntent = Intent("Intent.ACTION_VIEW", Uri.parse("https://www.globalknowledge.com/"))
            startActivity(myIntent)

        }
    }
}