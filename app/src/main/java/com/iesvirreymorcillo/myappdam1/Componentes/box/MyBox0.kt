package com.iesvirreymorcillo.myappdam1.Componentes.box

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun EjemploBox0(texto: String) {
    // 1. El Box principal actúa como contenedor
    Box(
        modifier = Modifier
            .padding(top = 20.dp, start = 10.dp, end = 10.dp)
            //.fillMaxWidth() //comprobar con .size(420.dp)
            .clip(RoundedCornerShape(20.dp)) // Redondea los bordes con RoundedCornerShape(20.dp)
            .size(120.dp) // Tamaño fijo de 200x200 dp
            .background(Color.Blue) // Fondo del Box principal (la primera capa)
    )
}

// Preview para ver el resultado
@Preview(showBackground = true)
@Composable
fun PreviewEjemploBox0() {
    EjemploBox0("Texto del Box 0") //<-- Parámetro pasado por posición
}