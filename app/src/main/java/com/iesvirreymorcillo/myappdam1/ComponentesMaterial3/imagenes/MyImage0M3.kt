package com.iesvirreymorcillo.myappdam1.ComponentesMaterial3.imagenes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iesvirreymorcillo.myappdam1.R

@Preview
@Composable
fun MyImage0M3() {
    Column (modifier = Modifier.padding(20.dp).fillMaxSize().background(Color.Yellow)) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "avatar image profile",
            modifier = Modifier.width(80.dp).height(200.dp).background(Color.Black),
            contentScale = ContentScale.FillHeight
        )


        Image(
            painter = painterResource(R.drawable.gatito),
            contentDescription = "avatar image profile",
            modifier = Modifier.padding(top = 50.dp, start = 50.dp).width(200.dp).height(500.dp).background(Color.Black),
            contentScale = ContentScale.FillWidth
        )

    }


}