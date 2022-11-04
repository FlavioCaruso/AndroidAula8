package com.example.calcularimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Validando o clique do botão
        btn_make_calc.setOnClickListener {
            //Declarando as variaveis
            val pesoTxt = edt_peso.text.toString()
            val alturaTxt = edt_altura.text.toString()

            //recebendo o resultado do calculo do IMC
            val imcResult = getImcResult(pesoTxt, alturaTxt)
            //passando o valor do texto para o campo de texto
            txt_result_imc.text = imcResult.result.label
        }

    }
}