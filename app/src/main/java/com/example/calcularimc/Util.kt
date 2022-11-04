package com.example.calcularimc

internal fun getImcResult(pesoTxt: String, alturaTxt: String): IMCResult {
    //Verificando se algum dos campos esta vindo vazio
    if(pesoTxt.isEmpty() || alturaTxt.isEmpty()){
        return IMCResult(Result.BLANK)
    }
    //transformando text para float
    val peso = pesoTxt.toFloat()
    //transformando text para float
    val altura = alturaTxt.toFloat()
    //Calculando o IMC
    val imc = peso / (altura * altura)

    //Validando os IMC e retornando o valor de acordo com o resultado
    if (imc < 16){
        return IMCResult(Result.MAGREZA_III)
    } else if (imc < 17){
        return IMCResult(Result.MAGREZA_II)
    } else if (imc < 18.5){
        return IMCResult(Result.MAGREZA_I)
    } else if (imc < 25){
        return IMCResult(Result.OK)
    } else if (imc < 30){
        return IMCResult(Result.SOBREPESO)
    } else if (imc < 35){
        return IMCResult(Result.OBESIDADE_I)
    } else if (imc < 40){
        return IMCResult(Result.OBESIDADE_II)
    } else {
        return IMCResult(Result.OBESIDADE_III)
    }
}
data class IMCResult(val result: Result)
enum class Result(val label: String) {
    MAGREZA_III("Magreza Severa"),
    MAGREZA_II("Magreza moderada"),
    MAGREZA_I("Magreza leve"),
    OK("Saudável"),
    SOBREPESO("Sobrepeso"),
    OBESIDADE_I("Obesidade Grau I"),
    OBESIDADE_II("Obesidade GHrau II (severa)"),
    OBESIDADE_III("Obesidade GHrau III (mórbida)"),
    BLANK("Insira os valores de altura e peso corretamente")
}