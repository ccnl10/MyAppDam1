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
fun EjemploColumn5(texto: String) {
    // 1. El Box principal actúa como contenedor
    Column (modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
        //horizontalAlignment = Alignment.CenterHorizontally
        //horizontalAlignment = Alignment.End

    ) {
        //Si añadimos .fillMaxWidth() horizontalAligment no tiene sentido
        Text(text = texto, modifier = Modifier.padding(vertical = 8.dp).background(Color.Red).padding(20.dp))
        Text(text = texto, modifier = Modifier.padding(vertical = 8.dp).background(Color.Cyan).padding(20.dp))
        Text(text = texto, modifier = Modifier.padding(vertical = 8.dp).background(Color.Yellow).padding(20.dp))
        Text(text = texto, modifier = Modifier.padding(vertical = 8.dp).background(Color.LightGray).padding(20.dp))
    }
}

// Preview para ver el resultado
@Preview(showBackground = true)
@Composable
fun PreviewEjemploColumn5() {
    EjemploColumn5(texto = "Texto")
}