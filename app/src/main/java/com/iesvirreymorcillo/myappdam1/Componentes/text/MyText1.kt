package com.iesvirreymorcillo.myappdam1.Componentes.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Preview (showBackground = true)
@Composable
fun MyTestText1() {
    MyText1(text = "Hola programador desde MyTesText1")
}

@Composable
fun MyText1(text: String) {
    Text(text = text )
}