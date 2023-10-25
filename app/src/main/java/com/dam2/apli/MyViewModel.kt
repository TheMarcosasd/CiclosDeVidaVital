package com.dam2.apli

import android.util.Log
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class MyViewModel() : ViewModel() {
    private val TAG_LOG: String = "Mensaje V"

    var numeroCambiable = mutableStateOf(0)

    var nombreIdentificador = mutableStateOf("Yo")
    val listaNumerosAleatorios = mutableStateListOf<Int>()

    init {
        Log.d(TAG_LOG, "init del V")
    }

    fun crearRandom() : Int{
        numeroCambiable.value = (0..10).random()
        Log.d(TAG_LOG,"creamos num random ${numeroCambiable.value}")
        return numeroCambiable.value
    }

    fun getNumero():Int{
        return numeroCambiable.value
    }

    fun getNombre(): String{
        return nombreIdentificador.value
    }

    fun crearListaRandom() : List <Int>{
        listaNumerosAleatorios.add((0..3).random())
        Log.d(TAG_LOG, "creamos random ${listaNumerosAleatorios}")
        return  listaNumerosAleatorios
    }

    fun getLista():List<Int>{
        return listaNumerosAleatorios.toList()
    }
}