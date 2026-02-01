package com.iesvirreymorcillo.myappdam1.Estados

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
// Estados
fun MyEstado2(modifier: Modifier) {
    //con el by se puede simplificar la variable
    var numero by rememberSaveable() { mutableStateOf(0) }
    Column {
        Text(text = "Púlsame: $numero",
            fontSize = 32.sp,
            modifier = modifier.clickable { numero += 1 })
        Text(text = "Púlsame: $numero",
            fontSize = 32.sp,
            modifier = modifier.clickable{ numero +=1 })
    }
}

@Preview(showBackground = true)
@Composable
fun MyEstado2Preview() {
    MyEstado2(modifier = Modifier.padding(top = 32.dp))
}
