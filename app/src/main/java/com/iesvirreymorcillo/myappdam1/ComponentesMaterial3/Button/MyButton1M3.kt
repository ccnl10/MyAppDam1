package com.iesvirreymorcillo.myappdam1.ComponentesMaterial3.Button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Botones que modifican estados y los muestran
@Composable
fun MyButton1M3(modifier: Modifier) {
    var contador1 by rememberSaveable() { mutableIntStateOf(0) }
    var contador2 by rememberSaveable() { mutableIntStateOf(0) }

    Column(modifier = modifier.padding(16.dp)) {

        Button(onClick = { contador1++ })
        { Text("Pulsado $contador1 veces") }


        Button(onClick = { contador2++ })
            { Text("Botón 2") }

        Text("Botón 2 Pulsado $contador2 veces")

    }
}
