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
import androidx.compose.ui.unit.sp

@Composable
// Estados
fun MyEstado3(modifier: Modifier) {
    //rememberSaveable para que recuerde el estado y no se pierda al girar la pantalla
    var numero = rememberSaveable() { mutableStateOf(0) }
    Column {
        Text(text = "Púlsame: ${numero.value}",
            fontSize = 32.sp,
            modifier = modifier.clickable { numero.value += 1 })
        Text(text = "Púlsame: ${numero.value}",
            fontSize = 32.sp,
            modifier = modifier.clickable{ numero.value +=1 })
    }
}

@Preview(showBackground = true)
@Composable
fun MyEstado3Preview() {
    MyEstado3(modifier = Modifier.padding(top = 32.dp))
}
