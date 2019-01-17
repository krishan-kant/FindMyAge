package com.example.test3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        buFindAge.setOnClickListener {
//            val yearOfBirth:Int = birthyear.text.toString().toInt()
//            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
//            val currentage = currentYear - yearOfBirth
//            showAge.text = currentage.toString()
//        }
    }

    fun buAgeEvent(view:View){
        return try{
            val yearOfBirth: Int = birthyear.text.toString().toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            var currentage = currentYear - yearOfBirth
            if(currentage < 0){
                currentage*=-1
                showAge.text = "You will born after $currentage years"
            }
            else {
                showAge.text = "Your age is $currentage"
            }
        } catch(e: Exception){
            showAge.text = "Invalid Input".toString()
        }
    }
}
