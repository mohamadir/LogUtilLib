package com.example.logutil

class Sleka private constructor(var cardNumber: String, var cardName: String) {


    var listener: (()->Unit)? = null


    data class Builder (var cardNumber: String? = null, var cardName: String? = null){
        fun cardNumber(cardNumber: String) = apply { this.cardNumber = cardNumber }
        fun cardName(cardName: String) = apply { this.cardName = cardName }
        fun start(myCallback: (result: String?) -> Unit) = run {
            myCallback.invoke("result from network")
            Sleka(cardNumber!!, cardName!!)
        }
    }

}