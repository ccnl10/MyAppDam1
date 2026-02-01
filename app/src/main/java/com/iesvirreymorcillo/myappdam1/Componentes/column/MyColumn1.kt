package com.iesvirreymorcillo.myappdam1.Componentes.column

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun EjemploColumn1(texto: String) {
    // 1. El Box principal actúa como contenedor
    Column {
        Text(text = texto, modifier = Modifier.background(Color.Red).fillMaxWidth().weight(2f))
        Text(text = texto, modifier = Modifier.background(Color.Cyan).fillMaxWidth().weight(1f))
        Text(text = texto, modifier = Modifier.background(Color.Yellow).fillMaxWidth().weight(1f))
        Text(text = texto, modifier = Modifier.background(Color.Blue).fillMaxWidth().weight(1f))
    }
}

// Preview para ver el resultado
@Preview(showBackground = true)
@Composable
fun PreviewEjemploColumn1() {
    EjemploColumn1("Texto") //<-- Parámetro pasado por posición
}