package com.iesvirreymorcillo.myappdam1.Componentes.login

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! Pepito",
        modifier = modifier
    )
}

@Preview(
    widthDp = 50,
    heightDp = 50,
    showBackground = true
)
@Composable
fun ExamplePreview(){
    Example(a= "Navarro")
}

@Composable
fun Example(a: String) {
    Text(
        text = "Cristian $a",
        modifier = Modifier
            .padding(all = 100.dp)
            .background(Color.Red)
            .border(width = 3.dp, color = Color.Black) // 👈 grosor y color
            .padding(20.dp) // padding interno para que el texto no se pegue al borde
    )
}