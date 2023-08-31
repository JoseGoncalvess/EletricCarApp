package com.jgdev.eletriccarapp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.jgdev.eletriccarapp.R

class MainActivity : AppCompatActivity() {
    lateinit var precokwh: EditText;
    lateinit var kmpercorrido: EditText;
    lateinit var btCalc: Button;
    lateinit var result: TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTupView()
        serupListinner()

    }

    fun setTupView(){
        precokwh = findViewById(R.id.et_kwh)
        kmpercorrido = findViewById(R.id.et_kmp)
        btCalc = findViewById(R.id.btt)
        result = findViewById(R.id.tv_ress)

    }
    fun serupListinner(){
        btCalc.setOnClickListener {
           calcAuto()


        }

    }

   fun calcAuto(){
        val preco = precokwh.text.toString().toFloat()
        val kmp = kmpercorrido.text.toString().toFloat()
        val ress = preco / kmp

        result.text = ress.toString()
    }
}