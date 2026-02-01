package com.iesvirreymorcillo.myappdam1.Componentes.column

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun EjemploColumn4(texto: String) {
    // 1. El Box principal actúa como contenedor
    Column (modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top  // Midificar las propiedades de Arrangement para cambiar la alineación
        //verticalArrangement = Arrangement.Bottom
        //verticalArrangement = Arrangement.Center
        // verticalArrangement = Arrangement.SpaceBetween
       //verticalArrangement = Arrangement.SpaceAround //El espacio exterior es la mitad del interior
       // verticalArrangement = Arrangement.SpaceEvenly //Todo el espacio se reparte por igual, incluidos los extremos
    ) {
        Text(text = texto, modifier = Modifier.padding(top = 8.dp).background(Color.Red).padding(20.dp)) // hay que quitar el weight para que quede espacio entre el texto y lo pueda modificar verticalarragment
        Text(text = texto, modifier = Modifier.padding(top = 8.dp).background(Color.Cyan).padding(20.dp))
        Text(text = texto, modifier = Modifier.padding(16.dp).background(Color.Yellow).padding(20.dp))
        Text(text = texto, modifier = Modifier.padding(16.dp).background(Color.LightGray).padding(20.dp))
    }
}

// Preview para ver el resultado
@Preview(showBackground = true)
@Composable
fun PreviewEjemploColumn4() {
    EjemploColumn4(texto = "Texto")
}