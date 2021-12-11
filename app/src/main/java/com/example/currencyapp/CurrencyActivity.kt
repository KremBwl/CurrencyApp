package com.example.currencyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.TableRow
import android.widget.TextView
import androidx.core.widget.doOnTextChanged
import com.example.currencyapp.consts.Consts
import com.example.currencyapp.databinding.ActivityCurrencyBinding

class CurrencyActivity : AppCompatActivity() {

    lateinit var bind: ActivityCurrencyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityCurrencyBinding.inflate(layoutInflater)
        setContentView(bind.root)



        bind.apply {


            btnConvert.setOnClickListener{


            var a = etCurrData.text.toString().toDouble()

          textView2.text = (a * Consts.RUB).toString()
            }
        }
    }
}