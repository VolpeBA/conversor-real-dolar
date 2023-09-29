package com.volpe.conversorrealdolar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.volpe.conversorrealdolar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener{
            val real = binding.editReal.text.toString().toDouble()
            val dolar = String.format("%.2f",real * 0.2)

            binding.txtResultado.text = "$ $dolar"
            //teste
        }
    }
}