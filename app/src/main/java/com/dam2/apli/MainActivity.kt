package com.dam2.apli

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.dam2.apli.ui.theme.ApliTheme

val miViewModel: MyViewModel = MyViewModel()
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ApliTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(MyViewModel = MyViewModel)
                }
            }
        }
    }
    //funciones On que deben ir dentro de la main activity
    val TAG: String = "Estado"
    var tiempoInicio: Long = 0
    var tiempoFin : Long = 0

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Funcion on start")
        tiempoInicio = System.currentTimeMillis()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Funcion on Pause")
        tiempoFin = System.currentTimeMillis()
        tiempoFin -= tiempoInicio
        tiempoFin = tiempoFin /1000
        Log.d(TAG,"Tiempo transcurrido es de: " + tiempoFin + " s")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Funcion on resume")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Funcion on STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Funcion on Destroy")
    }
}