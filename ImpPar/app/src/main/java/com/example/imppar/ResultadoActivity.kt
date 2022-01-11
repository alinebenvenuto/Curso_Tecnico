package com.example.imppar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imppar.databinding.ActivityMainBinding
import com.example.imppar.databinding.ActivityResultadoBinding

class ResultadoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultadoBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val par = binding.txtResultado.txt

        if (textnum % 2 == 0){
            val npar = "PAR"

        } else if(textnum % 2 == 1){
            val npar = "IMPAR"
        
        }

    }



    }
}