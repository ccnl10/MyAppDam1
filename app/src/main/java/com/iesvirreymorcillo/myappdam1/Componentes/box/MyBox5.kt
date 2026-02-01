package com.iesvirreymorcillo.myappdam1.Componentes.box

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EjemploBox5(texto: String) {
    // 1. El Box principal actúa como contenedor principal que ocupa toda la pantalla
    Box(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
            .background(Color.Green)
           // .padding(20.dp)
    ){
    Box(
        modifier = Modifier

            //.padding(20.dp)
            .clip(RoundedCornerShape(20.dp)) // Redondea los bordes con RoundedCornerShape(20.dp)
            .size(150.dp) // Tamaño fijo de 200x200 dp
            .background(Color.Red) // Fondo del Box principal (la primera capa)
            .align(Alignment.BottomStart)
    ) {
        Text(
            text = texto,
            color = Color.White,
            fontSize = 25.sp,
            modifier = Modifier
                .align(Alignment.Center) // Alineación individual: centrado
                .border(5.dp, Color.Red, RoundedCornerShape(20.dp))
                .padding(18.dp)
        )

    }
        }
}

// Preview para ver el resultado
@Preview(showBackground = true)
@Composable
fun PreviewEjemploBox5() {
    EjemploBox5("Box 5") //<-- Parámetro pasado por posición
}