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
fun MyStateHoisting1(modifier: Modifier) {
    //mutableStateOf() es genérico, si sé que es un entero puedo usar mutableIntStateOf()
    var numero1 by rememberSaveable() { mutableIntStateOf(0) }
    var numero2 by rememberSaveable() { mutableStateOf(0) }
    Column(modifier = modifier){
        // Una función lambda es una función que se pasa como parámetro de otra función. Es una función sin nombre
        // Una función lambda hace el código más limpio y reutilizable.
        // la función lanbda la ejecuto al pulsar el botón. La ejecuta el padre.
        StateExample1(numero1, onClick = {numero1++})  //este es un modo de hacerlo
        StateExample2(numero2) {numero2++}            // este es otro modo de hacerlo
        // De esta segunda parte podemos ver que cuando ponemos un box(){} las llaves están ejecutando una función lambda
    }
}

@Composable
fun StateExample1(numero: Int, onClick: () -> Unit) {
    Text(text = "Púlsame: $numero",
        fontSize = 32.sp,
        modifier = Modifier.clickable { onClick() })
}

@Composable
fun StateExample2(numero: Int, onClick: () -> Unit) {
    Text(text = "Púlsame: $numero",
        fontSize = 32.sp,
        modifier = Modifier.clickable { onClick() })
}




@Preview(showBackground = true)
@Composable
fun MyStateHoisting1Preview() {
    MyStateHoisting1(modifier = Modifier.padding(top = 32.dp))
}
