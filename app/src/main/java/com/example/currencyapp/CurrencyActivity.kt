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

            var a : Double = 0.0

            etCurrData.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(p0: Editable?) {
                   // TODO("Not yet implemented")
                }

                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                   // TODO("Not yet implemented")
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                    a = if(!p0.toString().isEmpty()) p0.toString().toDouble()
                    else 0.0


                    textView2.text = (a * Consts.RUB).toString()
                }
            })

        }
    }
}
