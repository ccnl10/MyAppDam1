package com.iesvirreymorcillo.myappdam1.Componentes.text

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview (showBackground = true)
@Composable
fun MyTestText3() {
    MyText3(text = "Hola programador desde MyTesText 3")
}

@Composable
fun MyText3(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .padding(20.dp)
            .size(200.dp)
            .clip(RoundedCornerShape(50.dp)) // Redondea los bordes
            .background(Color.Green)
            .padding(30.dp)
    )
}