package com.example.logutil

import android.util.Log

class TestClass {
    init {
        testSleka()

    }

    private fun testSleka() {
        Sleka.Builder()
            .cardNumber("1112-2514-1254-xxxx")
            .cardName("muhammed ibrahem")
            .callBack { result ->
                Log.i("MOHMD-TEST", result!!)
            }
            .start()
    }
}