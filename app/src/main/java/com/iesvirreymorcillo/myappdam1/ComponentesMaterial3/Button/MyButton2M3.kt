package com.iesvirreymorcillo.myappdam1.ComponentesMaterial3.Button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/* OTROS BOTONES */
@Composable
fun MyButton2M3(modifier: Modifier) {

    Column(modifier = modifier.padding(16.dp)) {

        /* Button
         * Botón normal por defecto
        */
        Button(onClick = {})
        {Text("Button") }

       /* OutlinedButton: similar al OutlinedTextField,
        * es decir modificación de Google sobre el elemento Button para crear un botón con un estilo predeterminado
        */
        OutlinedButton(onClick = {},
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Green,
                containerColor = Color.Blue)
        ){
            Text("Outlined Button")
        }


        /* TextButton
         * Otro botón con cierta configuración por defecto.
         */
        TextButton(onClick = {})
        { Text("Text Button") }


        /* ElevatedButton
         * Otro botón personalizado incorporado por Google
         */
        ElevatedButton(onClick = {},
            elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 10.dp)
            )
        { Text("Elevated Button") }


        /* FilledTonalButton
        * Otro botón con color secundario más suave
        */
        FilledTonalButton(onClick = {})
        { Text("Filled Tonal Button") }

    }
}
