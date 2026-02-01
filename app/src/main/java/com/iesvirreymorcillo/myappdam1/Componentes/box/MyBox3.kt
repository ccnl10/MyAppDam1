package com.iesvirreymorcillo.myappdam1.Componentes.box

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EjemploBox3(textoDown: String, textoUP: String) {
    // 1. El Box principal actúa como contenedor
    Box(
        modifier = Modifier
            .padding(top = 20.dp, start = 10.dp)
            .size(300.dp) // Tamaño fijo de 200x200 dp
            .background(Color.Red) // Fondo del Box principal (la primera capa)
    ) {
        // 2. Elemento 1: Un Box azul más pequeño.
        // Se coloca en la capa superior del fondo rojo.
        Box(
            modifier = Modifier
                .width(250.dp)
                .height(50.dp)
                .background(Color.Blue)
                .align(Alignment.Center) // Alineación individual: centrado
        ){
            Text(
                text = "EJEMPLO BOX 3",
                color = Color.White,
                fontSize = 55.sp,
                modifier = Modifier
                    .align(Alignment.Center) // Alineación individual: inferior derecha
                    .padding(8.dp) // Un pequeño relleno para que no toque el borde
            )

        }

        // 3. Elemento 2: Un texto
        // Se coloca en la capa superior del Box azul.
        Text(
            text = textoDown,
            color = Color.White,
            fontSize = 25.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter) // Alineación individual: inferior derecha
                .padding(8.dp) // Un pequeño relleno para que no toque el borde
        )

        Text(
            text = textoUP,
            color = Color.White,
            fontSize = 25.sp,
            modifier = Modifier
                .align(Alignment.TopCenter) // Alineación individual: inferior derecha
                .padding(8.dp) // Un pequeño relleno para que no toque el borde
        )
    }
}

// Preview para ver el resultado
@Preview(showBackground = true)
@Composable
fun PreviewEjemploBox3() {
    EjemploBox3(textoDown = "TEXTO INFERIOR", textoUP = "TEXTO SUPERIOR")
}