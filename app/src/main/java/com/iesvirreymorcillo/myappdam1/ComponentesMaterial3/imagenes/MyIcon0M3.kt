package com.iesvirreymorcillo.myappdam1.ComponentesMaterial3.imagenes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iesvirreymorcillo.myappdam1.R

//imágenes de internet. Probando todavía
@Preview
@Composable
fun MyIcon0M3() {
    Column (modifier = Modifier.padding(20.dp).fillMaxSize()) {
        Icon(
            painter = painterResource(R.drawable.ic_cafetera),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp),
            tint = Color.Red
        )
    }
}