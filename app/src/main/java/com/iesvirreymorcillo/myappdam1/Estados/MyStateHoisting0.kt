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

fun MyStateHoisting0(modifier: Modifier) {
    Column(modifier = modifier){
        StateExample1()
        StateExample2()
    }
}

@Composable
fun StateExample1() {
    var numero by rememberSaveable() { mutableStateOf(0) }
    Text(text = "Púlsame: $numero",
        fontSize = 32.sp,
        modifier = Modifier.clickable { numero++ })
}

@Composable
fun StateExample2() {
    var numero by rememberSaveable() { mutableStateOf(0) }
    Text(text = "Púlsame: $numero",
        fontSize = 32.sp,
        modifier = Modifier.clickable { numero++ })
}




@Preview(showBackground = true)
@Composable
fun MyStateHoisting0Preview() {
    MyStateHoisting0(modifier = Modifier.padding(top = 50.dp))
}
