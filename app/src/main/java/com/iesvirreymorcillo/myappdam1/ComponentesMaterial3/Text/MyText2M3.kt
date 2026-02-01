package com.iesvirreymorcillo.myappdam1.ComponentesMaterial3.Text

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MyText2M3(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp) // espacio entre textos
    ) {

        /*    El operador + llama internamente a TextDecoration.combine()
              El resultado final es el mismo objeto TextDecoration
              Se renderizan igual en pantalla
        */
        Text(
            text = "TextDecoration 1",
            textDecoration = TextDecoration.combine(
                listOf(
                    TextDecoration.LineThrough,
                    TextDecoration.Underline
                )
            ),
            color = Color.Red,
            fontSize = 32.sp
        )

        Text(
            text = "TextDecoration 2",
            textDecoration =  TextDecoration.LineThrough + TextDecoration.Underline,
            color = Color.Red,
            fontSize = 32.sp
        )

        Text(
            text = "Esto es un enlace",
            textDecoration = TextDecoration.Underline,
            color = Color.Blue,
            fontSize = 32.sp,
            modifier = Modifier.clickable{}
        )

        /*
         Da igual funcionalmente, pero la convención recomendada es poner modifier al principio.
         Kotlin no obliga a ningún orden, pero:
         1 modifier define el “contenedor”
                Tamaño, padding, alineación… es lo primero que quieres ver.
         2 Mejora la legibilidad
                Cuando escaneas código Compose, tus ojos buscan antes el Modifier.
         3 Es consistente con la documentación oficial
                 Google y los ejemplos de Jetpack Compose lo hacen así.

         Regla práctica
               modifier → primero
               Contenido principal (text, value, onClick) → después
               Estilo (color, fontSize, textAlign, etc.) → al final
         */

        Text(
            modifier = Modifier.fillMaxWidth().background(Color.Yellow),
            //Cuidado con .fillMaxSize() en este tipo de componentes
            text = "CentrDFDFDo",
            textAlign = TextAlign.Center
        )

        Text(
            modifier = Modifier.fillMaxWidth().background(Color.Yellow),
            text = "CentroSSS",
            textAlign = TextAlign.Start
        )

    }
}


