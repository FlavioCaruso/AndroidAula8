package com.example.calcularimc

import org.junit.Assert.*
import org.junit.Test

class UtilTest {
    @Test
    //Rodando um teste com sobrepeso
    fun testGetImcResult_90_180_sobrepeso() {
        val result = getImcResult("90", "1.80")
        assertEquals(result.result, Result.SOBREPESO)
    }
    //Rodando umt teste sem passar a altura
    @Test
    fun testGetImcResult_sem_altura() {
        val result = getImcResult("90", "")
        assertEquals(result.result, Result.BLANK)
    }
    //Rodando um teste sem passar o peso
    @Test
    fun testGetImcResult__sem_peso() {
        val result = getImcResult("", "1.80")
        assertEquals(result.result, Result.BLANK)
    }
}