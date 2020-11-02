package com.maxsch.samplegitapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun someSeriousFunction() {
        println("mm such serious")
    }

    fun myFeatureFun() {

    }

    fun asdas() {

    }

    fun sum() {
        println(2 + 2)
    }
}