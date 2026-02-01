package com.iesvirreymorcillo.myappdam1.Componentes.box

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EjemploBox1(texto: String) {
    // 1. El Box principal actúa como contenedor
    Box(
        modifier = Modifier
            .padding(2.dp)
            .fillMaxSize()
            .background(Color.Blue) // Fondo del Box principal (la primera capa)
    ) {
        Text(
            text = texto,
            color = Color.White,
            fontSize = 25.sp, //sp (scale-independent pixels).
            modifier = Modifier
                .align(Alignment.Center) // Alineación individual: central
                .border(2.dp, Color.Red) // Borde rojo de 2dp
                .padding(20.dp) // Un pequeño relleno para que no toque el borde
        )

    }
}

// Preview para ver el resultado
@Preview(showBackground = true)
@Composable
fun PreviewEjemploBox1() {
    EjemploBox1("Texto del Box 3") //<-- Parámetro pasado por posición
}