package com.iesvirreymorcillo.myappdam1.Componentes.row

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MyRow0(modifier: Modifier = Modifier){
    Row( modifier = modifier.fillMaxSize()) {
        Text(text = "Hola", modifier = Modifier.background(Color.Red).weight(1f).fillMaxHeight())
        Text(text = "Hola", modifier = Modifier.background(Color.Cyan).weight(1f).fillMaxHeight())
        Text(text = "Hola", modifier = Modifier.background(Color.Yellow).weight(2f).fillMaxHeight())
        Text(text = "Hola", modifier = Modifier.background(Color.Blue).weight(1f).fillMaxHeight())
    }
}