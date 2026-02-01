package com.iesvirreymorcillo.myappdam1.Componentes.box

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
fun EjemploBox7(texto: String) {
    // 1. El B6x principal actúa como contenedor principal que ocupa toda la pantalla
    Box(modifier = Modifier
        //.fillMaxSize()
        .fillMaxWidth()
        .height(600.dp)
        .padding(20.dp)
        .background(Color.Red)
        ,contentAlignment = Alignment.Center){
    // Box superior derecho
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp)) // Redondea los bordes con RoundedCornerShape(20.dp)
            .size(180.dp) // Tamaño fijo de 200x200 dp
            .background(Color.Blue) // Fondo del Box principal (la primera capa)
            .align(Alignment.TopStart)
    ) {
        Text(
            text = "TopStart",
            color = Color.White,
            fontSize = 25.sp,
            modifier = Modifier
                .align(Alignment.Center) // Alineación individual: centrado
                .border(5.dp, Color.Red, RoundedCornerShape(20.dp))
                .padding(30.dp)
        )

    }
        // Box superior izquierdo
        Box(
            modifier = Modifier

                //.padding(20.dp)
                .clip(RoundedCornerShape(20.dp)) // Redondea los bordes con RoundedCornerShape(20.dp)
                .size(180.dp) // Tamaño fijo de 200x200 dp
                .background(Color.Blue) // Fondo del Box principal (la primera capa)
                .align(Alignment.TopEnd)
        ) {
            Text(
                text = "TopEnd",
                color = Color.White,
                fontSize = 25.sp,
                modifier = Modifier
                    .align(Alignment.Center) // Alineación individual: centrado
                    .border(5.dp, Color.Red, RoundedCornerShape(20.dp))
                    .padding(18.dp)
            )

        }
        // Box inferior derecho
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp)) // Redondea los bordes con RoundedCornerShape(20.dp)
                .size(180.dp) // Tamaño fijo de 200x200 dp
                .background(Color.Blue) // Fondo del Box principal (la primera capa)
                .align(Alignment.BottomStart)
        ) {
            Text(
                text = "BottomStart",
                color = Color.White,
                fontSize = 25.sp,
                modifier = Modifier
                    .align(Alignment.Center) // Alineación individual: centrado
                    .border(5.dp, Color.Red, RoundedCornerShape(20.dp))
                    .padding(18.dp)
            )

        }
        // Box inferior izquierdo
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp)) // Redondea los bordes con RoundedCornerShape(20.dp)
                .size(180.dp) // Tamaño fijo de 200x200 dp
                .background(Color.Blue) // Fondo del Box principal (la primera capa)
                .align(Alignment.BottomEnd)
        ) {
            Text(
                text = "BottomEnd",
                color = Color.White,
                fontSize = 25.sp,
                modifier = Modifier
                    .align(Alignment.Center) // Alineación individual: centrado
                    .border(5.dp, Color.Red, RoundedCornerShape(20.dp))
                    .padding(18.dp)
            )
        }
        // Box central
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp)) // Redondea los bordes con RoundedCornerShape(20.dp)
                //.size(220.dp) // Tamaño fijo de 200x200 dp
                .width(300.dp)
                .height(120.dp)
                .background(Color.Black) // Fondo del Box principal (la primera capa)
                .align(Alignment.Center)
                .border(5.dp, Color.Red, RoundedCornerShape(20.dp))
        ) {
            Text(
                text = texto,
                color = Color.Yellow,
                fontSize = 32.sp,
                modifier = Modifier
                    .align(Alignment.Center) // Alineación individual: centrado
                    .padding(18.dp)
            )
        }
        }
    Box( modifier = Modifier
        .fillMaxWidth()
        .height(200.dp)
        .background(Color.Blue))
   /* Box(modifier = Modifier
        //.fillMaxSize()
        .fillMaxWidth()
        .height(600.dp)
        .padding(20.dp)
        .background(Color.Red)
        ,contentAlignment = Alignment.Center)*/

}

// Preview para ver el resultado
@Preview(showBackground = true)
@Composable
fun PreviewEjemploBox7() {
    EjemploBox7("Texto del Box 7") //<-- Parámetro pasado por posición
}