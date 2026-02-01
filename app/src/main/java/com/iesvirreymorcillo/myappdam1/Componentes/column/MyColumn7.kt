package com.iesvirreymorcillo.myappdam1.Componentes.column

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun EjemploColumn7(texto: String) {
    // 1. El Box principal actúa como contenedor
    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()), // Scroll de pantalla
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center  // Midificar las propiedades de Arrangement para cambiar la alineación
    ) {
        //Añadimos más textos o ampliamos el alto de cada elemento para poder usar el scroll
        Text(text = texto, textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.Red).padding(20.dp))
        Text(text = texto,  textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.Cyan).padding(20.dp))
        Text(text = texto, textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.Yellow).padding(20.dp))
        Text(text = texto, textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.LightGray).padding(20.dp))
        Text(text = texto, textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.Red).padding(20.dp))
        Text(text = texto,  textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.Cyan).padding(20.dp))
        Text(text = texto, textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.Yellow).padding(20.dp))
        Text(text = texto, textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.LightGray).padding(20.dp))
        Text(text = texto, textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.Red).padding(20.dp))
        Text(text = texto,  textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.Cyan).padding(20.dp))
        Text(text = texto, textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.Yellow).padding(20.dp))
        Text(text = texto, textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.LightGray).padding(20.dp))
        Text(text = texto, textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.Red).padding(20.dp))
        Text(text = texto,  textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.Cyan).padding(20.dp))
        Text(text = texto, textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.Yellow).padding(20.dp))
        Text(text = texto, textAlign = TextAlign.Center, modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().background(Color.LightGray).padding(20.dp))
    }
}

// Preview para ver el resultado
@Preview(showBackground = true)
@Composable
fun PreviewEjemploColumn7() {
    EjemploColumn7(texto = "Texto")
}