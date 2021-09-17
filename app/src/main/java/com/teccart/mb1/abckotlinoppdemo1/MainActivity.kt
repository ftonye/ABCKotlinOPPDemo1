package com.teccart.mb1.abckotlinoppdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var  pw:EditText
    private lateinit var  btn1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //this.pw = (EditText)findViewById(R.id.txt1);    code java
        // this.pw = findViewById(R.id.txt1) as EditText;  code kotlin legacy
       this.pw = findViewById<EditText>(R.id.txt1)

        this.btn1 = findViewById<Button>(R.id.btnExit)
        this.btn1.setOnClickListener(View.OnClickListener
        {
            this.pw.setText("Hello ")
        })

    }

    fun Login(view: View) {
        Toast.makeText(applicationContext,"tutu",Toast.LENGTH_LONG).show()
    }
}