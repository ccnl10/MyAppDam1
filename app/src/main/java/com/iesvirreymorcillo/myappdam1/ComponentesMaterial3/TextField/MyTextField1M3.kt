package com.iesvirreymorcillo.myappdam1.ComponentesMaterial3.TextField

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MyTextField1M3(modifier: Modifier) {
    var nombre by rememberSaveable() { mutableStateOf("") }
    var apellido1 by rememberSaveable() { mutableStateOf("") }
    var apellido2 by rememberSaveable() { mutableStateOf("") }

    Column(modifier = modifier) {
        MyTextFieldNombre(user = nombre) {nombre= it}
        MyTextFieldApellido1(user = apellido1) {apellido1 = it}
        MyTextFieldApellido2(user = apellido2) {apellido2 = it}
    }
}


@Composable
fun MyTextFieldNombre(user: String, onUserChange: (String) -> Unit) {
    TextField(value = user, onValueChange = { onUserChange(it) },
        placeholder = { Text("Introduce tu nombre") })
}

@Composable
fun MyTextFieldApellido1(user: String, onUserChange: (String) -> Unit) {
    TextField(value = user, onValueChange = { onUserChange(it) },
        placeholder = { Text("Introduce tu primer apellido") })
}

@Composable
fun MyTextFieldApellido2(user: String, onUserChange: (String) -> Unit) {
    TextField(value = user, onValueChange = { onUserChange(it) },
        placeholder = { Text("Introduce tu segundo apellido") },
        label = { Text("Apellido 2") } )
}