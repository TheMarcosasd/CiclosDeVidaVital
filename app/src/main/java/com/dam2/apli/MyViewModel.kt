package com.dam2.apli

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import java.util.Random

class MyViewModel() : ViewModel() {
    var nombre = mutableStateOf("")

    var aleatorio = mutableStateOf(0)

    var lista = mutableStateListOf<Int>()
    fun random(){
        aleatorio.value = ((0..10).random())
        Log.d("Estado",aleatorio.value.toString())
    }
    fun randomLista(){
        aleatorio.value = ((0..8).random())
        lista.add(aleatorio.value)
        Log.d("Estado","Nuemros Lista: "+aleatorio.value.toString())
    }

    fun getLista():List<Int>{
        return lista.toList()
    }
    fun getRandom():Int{
        return aleatorio.value
    }

    fun getNombre():String{
        return  nombre.value
    }

}