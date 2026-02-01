package com.iesvirreymorcillo.myappdam1.Componentes.box

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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

@Composable
fun EjemploBox99(texto: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size(120.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Red)
                .padding(16.dp)
                .clickable { println("Clicked!") },
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Hola Compose", color = Color.White)
        }
    }

}

// Preview para ver el resultado
@Preview(showBackground = true)
@Composable
fun PreviewEjemploBox99() {
    EjemploBox99("Texto del Box 7")
}