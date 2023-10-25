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
                    Saludo("Hola")
                }
            }
        }
    }
    @Composable
    private fun InterfazUsuario(){
        login()
        texto_descriptivo("fun")
        chat()
    }
    @Composable
    fun login(){
        //texto y boton para logear
        texto_descriptivo(texto="Fallo de login")
    }
    @Composable
    fun texto_descriptivo(texto: String){
        Text(text=texto)
    }
    fun chat(){
        TODO("Not yet implemented")
    }
}

@Composable
fun Saludo(name: String, modifier: Modifier = Modifier) {
    var _numbers = remember { mutableStateOf(0) }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ApliTheme {
        Saludo("Android")
    }
}