package com.iesvirreymorcillo.myappdam1.Componentes.column

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun EjemploColumn2(texto: String) {
    // 1. El Box principal actúa como contenedor
    Column (modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center // Centra los elementos verticalmente
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
fun PreviewEjemploColumn2() {
    EjemploColumn2(texto = "Texto")
}