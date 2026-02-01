package com.iesvirreymorcillo.myappdam1.Estados

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
// Estados
fun MyEstado0(modifier: Modifier) {
    /* Puedo crear variables de diferentes tipos int(0) float(0f) string("0") */
    //var numero:String = "0"  //con esta variable no puedo modificar el valor. Necesito un mutableStateOf
    //var numero = mutableStateOf(0)
    //var numero = mutableStateOf("0")
    //remember para que recuerde el estado. Si no se pone cada vez que se recomponga la vista la pone a 0
    var numero = remember { mutableStateOf(0) }
    //var numero = remember { mutableStateOf("0") }
    Column {
        Text(text = "Púlsame: ${numero.value}", modifier = modifier.clickable { numero.value += 1 })
        Text(text = "Púlsame: ",  modifier = modifier.clickable{ numero.value +=1 })
        Text(text = "Púlsame: ",  modifier = modifier.clickable{ numero.value +=1 })
        Text(text = "Púlsame: ${numero.value}", modifier = modifier.clickable{ numero.value +=1 })
        Text(text = "Púlsame: ",  modifier = modifier.clickable{ numero.value +=1 })
    }
    //Hay que tener en cuenta que cada vez que cambiamos se recompone la vista
    //Cada vez que se actualiza un estado, se produce una recomposición
}

@Preview(showBackground = true)
@Composable
fun MyEstado0Preview() {
    MyEstado0(modifier = Modifier.padding(top = 32.dp))
}
