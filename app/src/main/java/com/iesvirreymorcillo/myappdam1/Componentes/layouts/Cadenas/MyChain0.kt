package com.iesvirreymorcillo.myappdam1.Componentes.layouts.Cadenas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyChain0(modifier: Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxGreen, boxYellow) = createRefs()
        Box(Modifier.size(75.dp).background(Color.Red).constrainAs(boxRed){
            start.linkTo(boxGreen.end)
            end.linkTo(boxYellow.start)
        })

        Box(Modifier.size(75.dp).background(Color.Green).constrainAs(boxGreen){
            start.linkTo(parent.start)
            end.linkTo(boxRed.start)
        })

        Box(Modifier.size(75.dp).background(Color.Yellow).constrainAs(boxYellow){
            start.linkTo(boxRed.end)
            end.linkTo(parent.end)
        })
    }

    }

@Preview(showBackground = true)
@Composable
fun MyChains0Preview() {
    MyChain0(modifier = Modifier)
}