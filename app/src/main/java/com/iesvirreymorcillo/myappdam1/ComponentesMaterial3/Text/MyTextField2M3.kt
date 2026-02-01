package com.iesvirreymorcillo.myappdam1.ComponentesMaterial3.Text

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
fun MyTextField2M3(modifier: Modifier) {
    var nombre by rememberSaveable() { mutableStateOf("") }


    Column(modifier = modifier) {
        MyAdvanceTextField(value = nombre) {nombre= it}
    }
}


@Composable
fun MyAdvanceTextField(value: String, onValueChange: (String) -> Unit) {
    TextField(value, onValueChange={
        if (it.contains("a")){
            onValueChange(it.replace("a",""))
            }else{
            onValueChange(it)
        }
    },
        placeholder = { Text("Introduce tu nombre") },
        label = { Text("Nombre") })
}