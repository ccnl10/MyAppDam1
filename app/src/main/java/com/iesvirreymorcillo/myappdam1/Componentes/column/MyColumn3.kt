package com.iesvirreymorcillo.myappdam1.Componentes.column

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun EjemploColumn3(texto: String) {
    // 1. El Box principal actúa como contenedor
    Column (modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = texto, modifier = Modifier.background(Color.Red)) // hay que quitar el weight para que quede espacio entre el texto y lo pueda modificar verticalarragment
        Text(text = texto, modifier = Modifier.background(Color.Cyan))
        Text(text = texto, modifier = Modifier.background(Color.Yellow))
        Text(text = texto, modifier = Modifier.background(Color.LightGray))
    }
}

// Preview para ver el resultado
@Preview(showBackground = true)
@Composable
fun PreviewEjemploColumn3() {
    EjemploColumn3(texto = "Texto")
}