package com.example.currencyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.currencyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btnEnter.setOnClickListener {

        }
    }
}