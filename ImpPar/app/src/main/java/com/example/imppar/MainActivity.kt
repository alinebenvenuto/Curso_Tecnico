package com.example.imppar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.imppar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

            val textnum = binding.edtTxtNum.text.toString().toInt()
            val botao = binding.bntVerificar


            botao.setOnClickListener{
                if (textnum % 2 == 0){
                    val npar = "PAR"
                    val mIntent = Intent(this,ResultadoActivity::class.java)
                    startActivity(mIntent)
                } else if(textnum % 2 == 1){
                    val npar = "IMPAR"
                    val mIntent = Intent(this,ResultadoActivity::class.java)
                    startActivity(mIntent)
                }

            }





            //AQUI É FEITA A VALIDAÇÃO DOS CAMPOS
            //SE ESTIVEREM PREENCHIDOS O ESCOPO DO ELSE É EXECUTADO

            /*if (textnum.isEmpty()) {
                binding.edtTxtNum.error = "Campo obrigatório"
                binding.edtTxtNum.requestFocus()
            }else{
                if (textnum % 2 == 0){
                    val mIntent = Intent(this,ResultadoActivity::class.java)
                    startActivity(mIntent)

                }*/


            }
        }

