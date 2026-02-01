package com.iesvirreymorcillo.myappdam1.Componentes.row

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
//Añadimos modificadores  width y el scroll horizontal
fun MyRow1(modifier: Modifier = Modifier){
    Row( modifier = modifier
        .fillMaxSize()
        .horizontalScroll(rememberScrollState())) {
        Text(text = "Hola", modifier = Modifier.background(Color.Red).width(150.dp).fillMaxHeight())
        Text(text = "Hola", modifier = Modifier.background(Color.Cyan).width(150.dp).fillMaxHeight())
        Text(text = "Hola", modifier = Modifier.background(Color.Yellow).width(150.dp).fillMaxHeight())
        Text(text = "Hola", modifier = Modifier.background(Color.Blue).width(150.dp).fillMaxHeight())
    }
}