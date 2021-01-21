package com.example.saproject3

import android.content.Intent
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

                var i = Intent(this,SecondActivity::class.java)  // Explicit Intent

                i.putExtra("un",userName)

                startActivity(i)


            }
    }
}