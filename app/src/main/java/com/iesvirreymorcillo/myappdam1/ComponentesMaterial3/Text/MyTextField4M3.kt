package com.iesvirreymorcillo.myappdam1.ComponentesMaterial3.Text

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

/*
* OutlinedTextfield
* Modificación introducida por Google con diseños predefinidos ya incluidos,
* de manera que es mucho más fácil adaptar estos elementos que crearlo desde cero.
*/
@Composable
fun MyTextField4M3(modifier: Modifier) {
    var nombre by rememberSaveable() { mutableStateOf("") }

    Column(modifier = modifier) {
        MyOutlinedTextField (user = nombre) {nombre= it}
    }
}


@Composable
fun MyOutlinedTextField(user: String, onValueChange: (String) -> Unit) {
    OutlinedTextField(value = user, onValueChange = { onValueChange(it) },
        placeholder = { Text("Introduce tu nombre") },
        label = { Text("Nombre")
})
}