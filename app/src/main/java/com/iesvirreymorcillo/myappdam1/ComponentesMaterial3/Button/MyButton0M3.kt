package com.iesvirreymorcillo.myappdam1.ComponentesMaterial3.Button

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun MyButton0M3(modifier: Modifier) {

    Column(modifier = modifier.padding(16.dp)) {
        Button(onClick = {}) {
            Text(text = "Pulsame")
        }

        /**
         * Log.i no cambia la pantalla, solo informa al programador.
         * Consultar el logCat del programador.
         */
        Button(
            onClick = { Log.i("2DAM_1", "Botón pulsado") },
            enabled = true,
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(3.dp, Color.Red),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Cyan,
                containerColor = Color.Gray)
        ){ Text("Pulsame")}


        Button(
            onClick = { Log.i("2DAM_2", "Botón pulsado") },
            enabled = true,
            shape = RoundedCornerShape(50.dp),
            border = BorderStroke(2.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.DarkGray)
        ){ Text("Pulsame")}


    }
}
