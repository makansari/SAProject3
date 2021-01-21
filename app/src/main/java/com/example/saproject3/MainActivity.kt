package com.example.saproject3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("mytag","Activity Oncreated")

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

            var myIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.globalknowledge.com/"))
            startActivity(myIntent)

        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("mytag","Activity onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.w("mytag","Activity onResume")

        Log.v("mytag","checking for verbose")


    }

    override fun onPause() {
        super.onPause()
        Log.i("mytag","Activity Pause")


    }

    override fun onStop() {
        super.onStop()
        Log.i("mytag","Activity onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("mytag","Activity onDestroy")

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
                 var id = item.itemId
        if(id==R.id.settingid){
            Toast.makeText(this, "USER SELECTED SETTINGS ", Toast.LENGTH_SHORT).show()
        }
        if(id == R.id.logoutid){
            Toast.makeText(this, "USER SELECTED Logout ", Toast.LENGTH_SHORT).show()

        }

        return super.onOptionsItemSelected(item)
    }


}