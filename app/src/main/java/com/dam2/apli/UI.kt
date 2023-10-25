package com.dam2.apli

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource

open class UI{

}
@Composable
fun nombreFile(nombre: String, modifier: Modifier) {
    Row {
        Text(
            text = "LidierMaximo",
            modifier = modifier,
            fontSize = 25.sp,
            lineHeight = 90.sp,
            color = Color.Red,
            textAlign = TextAlign.Center
        )
    }
    /**
    Row(modifier = Modifier.padding(0.dp, 10.dp)) {
    Image(
    painter = painterResource(id = R.drawable.),
    contentDescription = "icono de android",
    modifier = Modifier
    .padding(30.dp, 0.dp)
    )
    }
     */
}


@Composable
fun fButton(miViewModel: MyViewModel) {
    Row {
        Text(
            text = "Lista: ${miViewModel.getLista()}"
            //text = "Numeros: ${miViewModel.getNumero()}"
        )
    }
    Row(modifier = Modifier.padding(0.dp, 10.dp)) {
        Button(
            onClick = {
                //miViewModel.crearRandom()
                miViewModel.crearListaRandom()
                Log.d("Funciones", "tralala, apretada")
            },
            modifier = Modifier
                .height(100.dp)
                .width(230.dp)
                .padding(30.dp, 0.dp),
            colors = ButtonDefaults.buttonColors(Color.Yellow)
        ) { // es un metodo que puede recibir el boton, al ser el último lo podemos poner fuera de los paréntesis

            Text(
                text = "tocame!", textAlign = TextAlign.Center,
                color = Color.Red
            )
        }
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun etiquetaRellenarPalabras(miViewModel: MyViewModel) {
    Row {
        // campo de texto para rellenar
        OutlinedTextField(
            value = miViewModel.getNombre(),
            onValueChange = {
                miViewModel.nombreIdentificador.value = it //variable string
            },
            label = {
                Text(
                    text = "Introduzca un nombre",
                    color = Color.Red
                )
            }
        )
    }
    Row {
        if (miViewModel.getNombre().length > 3) {
            Text(
                text = "Hola: ${miViewModel.getNombre()}!"
            )
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UsuarioLoVe(miViewModel: MyViewModel) {
    @Composable
    fun InterfazUsuario(miViewModel: MyViewModel, name: String, modifier: Modifier = Modifier) {


        Column {
            // están separado por filas
            nombreFile( nombre = name, modifier = modifier)

            fButton(miViewModel = miViewModel)

            etiquetaRellenarPalabras(miViewModel = miViewModel)
        }
    }

    @Composable
    fun GreetingPreview() {
        ApliTheme {
            InterfazUsuario(miViewModel = MyViewModel(), "prueba")
        }
    }

    @Composable
    fun textoQueSeMuestra(texto: String) {
        //texto descriptivo
        Text(text = texto)
    }
}