package com.iesvirreymorcillo.myappdam1.Estados

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
// Estados
fun MyEstado1(modifier: Modifier) {
    //Cada vez que rotamos la pantalla se pierde el estado porque la vista "muere" o termina
    //rememberSaveable para que recuerde el estado y no se pierda al girar la pantalla
    var numero = rememberSaveable() { mutableStateOf(0) }
    Column {
        Text(text = "Púlsame: ${numero.value}", modifier = modifier.clickable { numero.value += 1 })
        Text(text = "Púlsame: ${numero.value}", modifier = modifier.clickable{ numero.value +=1 })
    }
    //Hay que tener en cuenta que cada vez que cambiamos se recompone la vista
    //Cada vez que se actualiza un estado, se produce una recomposición
}

@Preview(showBackground = true)
@Composable
fun MyEstado1Preview() {
    MyEstado1(modifier = Modifier.padding(top = 32.dp))
}
