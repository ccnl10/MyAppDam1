package com.iesvirreymorcillo.myappdam1.ComponentesMaterial3.Text

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
fun MyText1M3(modifier: Modifier) {
    Column(
        modifier = modifier //combina el modificador interno y el que se le pasa como parámetro
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp) // espacio entre textos
    ) {
        // Color
        Text(
            text = "Ejemplo de texto con color rojo2",
            color = Color.Red
        )

        // Font size
        Text(
            text = "Ejemplo de texto grande",
            fontSize = 30.sp
        )

        // Font style
        Text(
            text = "Ejemplo de texto en cursiva",
            fontStyle = FontStyle.Italic
        )

        // Font weight
        Text(
            text = "Ejemplo de texto en negrita",
            fontWeight = FontWeight.Bold
        )

        // Font family
        Text(
            text = "Ejemplo de texto con fuente Serif",
            fontFamily = FontFamily.Serif
        )

        // Letter spacing
        Text(
            text = "Ejemplo de texto con espacio entre letras",
            letterSpacing = 4.sp
        )

        // Text decoration
        Text(
            text = "Ejemplo de texto subrayado",
            textDecoration = TextDecoration.Underline
        )

        // Text align (dentro de un Box para que se vea el efecto)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
        ) {
            Text(
                text = "Ejemplo de texto centrado",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }

        // Line height
        Text(
            text = "Ejemplo de texto con altura de línea\nSegunda línea\nTercera línea",
            lineHeight = 30.sp
        )

        // Overflow
        Text(
            text = "Ejemplo de texto muy largo para comprobar el overflow con puntos suspensivos que no caben en una sola línea",
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )

        // Soft wrap
        Text(
            text = "Ejemplo de texto sin salto automático de línea que seguirá en una sola línea aunque sea largo",
            softWrap = false
        )

        // Max lines
        Text(
            text = "Ejemplo de texto limitado a una sola línea aunque tenga más contenido\nOtra línea",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )

        // Min lines
        Text(
            text = "Ejemplo de texto con mínimo de 3 líneas",
            minLines = 3,
            modifier = Modifier
                .background(Color(0xFFE0E0E0))
                .padding(4.dp)
        )
    }
}


