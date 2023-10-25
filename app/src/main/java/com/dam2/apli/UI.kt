package com.dam2.apli

import android.util.Log
import android.widget.Button
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun buttons(MyViewModel :MyViewModel){
    Column {
        Row {
            FilledTonalButton(onClick = { MyViewModel.randomLista()}) {
                Text(text = "Tonal_List")
            }
            Spacer(modifier = Modifier.height(50.dp)) // Espacio de 50.dp

            //Trabajamos con este boton
            OutlinedButton(onClick = {MyViewModel.random()}) {
                Modifier.border(3.dp, Color.Black)//Por ue coño no funciona
                Text(text = "outlined_Random")

            }


            Spacer(modifier = Modifier.height(50.dp)) // Espacio de 50.dp
            ElevatedButton(onClick = { /*TODO*/ }) {
                Text(text = "Elevated Button")
            }
        }
        Row {
            Spacer(modifier = Modifier.height(50.dp))
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Text Button")
            }
            Spacer(modifier = Modifier.height(50.dp))
            //TextField(value = , onValueChange = )
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Boton normal")
            }




        }



    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Textos(MyViewModel: MyViewModel){
    Row {
        Text(
            fontSize = 40.sp,
            text =MyViewModel.getRandom().toString()

        )

        Column {
            OutlinedTextField(
                value = MyViewModel.getNombre(),
                onValueChange ={MyViewModel.nombre.value = it} )

            Spacer(modifier = Modifier.height(25.dp))
            Text(text = "Result:  "+ MyViewModel.getNombre())

            Text(

                text =MyViewModel.getLista().toString(),
                fontSize = 20.sp


            )

        }
    }

}





@Composable
fun Greeting(MyViewModel:MyViewModel) {
    Column {
        buttons(MyViewModel = MyViewModel )
        Spacer(modifier = Modifier.height(50.dp))
        Textos(MyViewModel = MyViewModel)
    }





}

@PreviewParameter(showBackground = true)
@Composable
fun GreetingPreview(MyViewModel: MyViewModel) {
    ApliTheme {
        Greeting(MyViewModel = MyViewModel)
    }
}