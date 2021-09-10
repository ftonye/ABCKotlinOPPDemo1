package com.teccart.mb1.abckotlinoppdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stj1:StudentJ = StudentJ("toto",25,1.80)
        var stk1:StudentK = StudentK("tatou",20,1.60)
    }
}