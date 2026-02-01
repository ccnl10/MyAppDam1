package com.iesvirreymorcillo.myappdam1.Componentes.layouts.Spacer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MySpacer1(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        // Caja superior
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color.Red)
        )

        // Espacio entre la caja y el Row
        Spacer(modifier = Modifier.height(16.dp))

        // Row inferior
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color.LightGray),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color.Blue)
            )
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color.Green)
            )
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color.Yellow)
            )
        }
    }
}
