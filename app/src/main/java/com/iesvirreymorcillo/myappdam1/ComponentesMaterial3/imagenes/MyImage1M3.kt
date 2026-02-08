package com.iesvirreymorcillo.myappdam1.ComponentesMaterial3.imagenes

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iesvirreymorcillo.myappdam1.R

@Preview
@Composable
fun MyImage1M3() {
    Column (modifier = Modifier.padding(20.dp).fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.gatito),
            contentDescription = "avatar image profile",
            modifier = Modifier
                .padding(8.dp)
                .size(150.dp)
                .border(width = 5.dp, color = Color.Red),
            contentScale = ContentScale.FillBounds
        )

        Image(
            painter = painterResource(R.drawable.gatito),
            contentDescription = "avatar image profile",
            modifier = Modifier
                .padding(8.dp)
                .size(150.dp)
                .border(width = 5.dp, color = Color.Red)
                .clip (RoundedCornerShape(50)),
            contentScale = ContentScale.FillBounds
        )

        Image(
            painter = painterResource(R.drawable.gatito),
            contentDescription = "avatar image profile",
            modifier = Modifier
                .padding(8.dp)
                .size(150.dp)
                .clip (RoundedCornerShape(50))
                .border(width = 5.dp, color = Color.Red),
            contentScale = ContentScale.FillBounds
        )

        Image(
            painter = painterResource(R.drawable.gatito),
            contentDescription = "avatar image profile",
            modifier = Modifier
                .padding(8.dp)
                .size(150.dp)
                .clip (RoundedCornerShape(50))
                .border(width = 5.dp, color = Color.Red, shape = CircleShape),
            contentScale = ContentScale.FillBounds
        )

        Image(
            painter = painterResource(R.drawable.gatito),
            contentDescription = "avatar image profile",
            modifier = Modifier
                .padding(8.dp)
                .size(150.dp)
                .clip (RoundedCornerShape(50))
                .border(width = 5.dp, shape = CircleShape,
                    brush = Brush.linearGradient(colors = listOf(Color.Red, Color.Blue, Color.Yellow))),
            contentScale = ContentScale.FillBounds
        )

    }


}