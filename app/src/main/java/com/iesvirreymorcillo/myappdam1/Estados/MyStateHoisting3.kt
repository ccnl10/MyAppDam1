package com.iesvirreymorcillo.myappdam1.Estados

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
// Estados
fun MyStateHoisting3(modifier: Modifier) {
    var numero1 by rememberSaveable() { mutableIntStateOf(10) }
    var numero2 by rememberSaveable() { mutableStateOf(5) }
    var resultado by rememberSaveable() { mutableIntStateOf(0) }
    Column(modifier = modifier){
        Text(text = "Numero 1: $numero1", fontSize = 32.sp)
        Text(text = "Numero 2: $numero2", fontSize = 32.sp)

        sumar(numero1, numero2, resultado) {resultado = numero1 + numero2}
        restar(numero1, numero2, resultado) {resultado = numero1 - numero2}

        imprimirResultado(resultado)
    }
}

@Composable
fun sumar(numero1: Int, numero2: Int, resultado: Int, onClick: () -> Unit) {
    Text(text = "Púlsame para sumar $numero1 y $numero2",
        fontSize = 32.sp,
        modifier = Modifier.clickable { onClick() })
}

@Composable
fun restar(numero1: Int, numero2: Int, resultado: Int, onClick: () -> Unit) {
    Text(text = "Púlsame para restar $numero1 y $numero2",
        fontSize = 32.sp,
        modifier = Modifier.clickable { onClick() })
}

@Composable
fun imprimirResultado(numero: Int) {
    Text(text = "El resultado es: $numero",
        fontSize = 32.sp)
}



@Preview(showBackground = true)
@Composable
fun MyStateHoisting3Preview() {
    MyStateHoisting3(modifier = Modifier.padding(top = 32.dp))
}
