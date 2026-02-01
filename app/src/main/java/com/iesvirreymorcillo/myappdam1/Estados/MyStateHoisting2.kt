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
fun MyStateHoisting2(modifier: Modifier) {
    var numero1 by rememberSaveable() { mutableIntStateOf(0) }
    var numero2 by rememberSaveable() { mutableStateOf(0) }
    Column(modifier = modifier){
        StateExample10(numero1, onClick = {numero1++})
        StateExample20(numero2) {numero2+=10}
    }
}

@Composable
fun StateExample10(numero: Int, onClick: () -> Unit) {
    Text(text = "Púlsame: $numero",
        fontSize = 32.sp,
        modifier = Modifier.clickable { onClick() })
}

@Composable
fun StateExample20(numero: Int, onClick: () -> Unit) {
    Text(text = "Púlsame: $numero",
        fontSize = 32.sp,
        modifier = Modifier.clickable { onClick() })
}




@Preview(showBackground = true)
@Composable
fun MyStateHoisting2Preview() {
    MyStateHoisting2(modifier = Modifier.padding(top = 32.dp))
}
