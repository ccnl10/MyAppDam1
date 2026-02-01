package com.iesvirreymorcillo.myappdam1.Componentes.column

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MyColumn(){
    Column(Modifier.fillMaxSize()) {
        Text("Hola 1", modifier = Modifier.background(Color.Red).weight(2f))
        Text("Hola 2", modifier = Modifier.background(Color.Blue).weight(1f))
        Text("Hola 3", modifier = Modifier.background(Color.Yellow).weight(1f))
    }
}