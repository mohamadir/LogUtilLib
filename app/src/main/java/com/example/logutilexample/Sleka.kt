package com.example.logutilexample

import android.os.Handler
import android.os.Looper

class Sleka private constructor(var cardNumber: String, var cardName: String,
                                var myCallback: (result: String?) -> Unit? ) {

    init {
        startNetworking()
    }

    private fun startNetworking() {
        Handler(Looper.getMainLooper()).postDelayed({
            myCallback.invoke("network result")
        }, 3000)
    }

    data class Builder(
        var cardNumber: String? = null, var cardName: String? = null,
        var myCallback: ((result: String?) -> Unit?)? = null
    ){
        fun cardNumber(cardNumber: String) = apply { this.cardNumber = cardNumber }
        fun cardName(cardName: String) = apply { this.cardName = cardName }
        fun callBack(myCallback: (result: String?) -> Unit) = apply { this.myCallback = myCallback }
        fun start() = run {
            Sleka(cardNumber!!, cardName!!, myCallback!!)

        }
    }

}