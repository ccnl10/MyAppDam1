package com.iesvirreymorcillo.myappdam1.ComponentesMaterial3.Text

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


// Este composable muestra ejemplos de todos los parámetros de Text
// en Jetpack Compose, cada Text cambia solo un parámetro.
@Composable
fun MyText0M3(modifier: Modifier) {
    Column(modifier = modifier.padding(16.dp)) {

        // text
        Text(text = "Ejemplo de texto")

        // color
        Text(text = "Ejemplo de texto con color rojo", color = Color.Red)

        // fontSize
        Text(text = "Ejemplo de texto con tamaño grande", fontSize = 24.sp)

        // fontStyle
        Text(text = "Ejemplo de texto en cursiva", fontStyle = FontStyle.Italic)

        // fontWeight
        Text(text = "Ejemplo de texto en negrita", fontWeight = FontWeight.Bold)

        // fontFamily
        Text(text = "Ejemplo de texto con fuente Serif", fontFamily = FontFamily.Serif)

        // letterSpacing
        Text(text = "Ejemplo de texto con espacio entre letras", letterSpacing = 2.sp)

        // textDecoration
        Text(text = "Ejemplo de texto subrayado", textDecoration = TextDecoration.Underline)

        // textAlign
        Text(text = "Ejemplo de texto alineado al centro", textAlign = TextAlign.Center)

        // lineHeight
        Text(text = "Ejemplo de texto con altura de línea mayor", lineHeight = 30.sp)

        // overflow, utilizado junto con maxLines
        Text(
            text = "Ejemplo de texto muy largo para comprobar el overflow con puntos suspensivos",
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )

        // softWrap
        Text(text = "Ejemplo de texto sin salto automático de línea", softWrap = false)

        // maxLines
        Text(text = "Ejemplo de texto limitado a una sola línea", maxLines = 1)

        // minLines
        Text(text = "Ejemplo de texto con mínimo de líneas", minLines = 2)
    }
}

