package com.example.logutilexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Sleka.Builder()
            .cardNumber("1112-2514-1254-xxxx")
            .cardName("muhammed ibrahem")
            .callBack { result ->
                Log.i("MOHMD-TEST", result!!)
            }
            .start()
    }
}