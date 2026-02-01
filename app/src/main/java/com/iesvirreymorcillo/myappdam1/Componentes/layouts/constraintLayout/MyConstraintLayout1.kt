package com.iesvirreymorcillo.myappdam1.Componentes.layouts.constraintLayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
// EJERCICIO 1 DE CONSTRAINTLAYOUT
fun MyConstraintLayout1(modifier: Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxRosa, boxBlack, boxCyan, boxYellow, boxBlue, boxGreen) = createRefs()
        Box(Modifier.size(75.dp).background(Color.Red).constrainAs(boxRed){
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
        })
        Box(Modifier.size(75.dp).background(Color.Cyan).constrainAs(boxCyan){
            top.linkTo(boxRed.bottom)
            start.linkTo(boxRed.end)
        })
        Box(Modifier.size(75.dp).background(Color(0xFFFF69B4)).constrainAs(boxRosa){
            top.linkTo(boxRed.bottom)
            end.linkTo(boxRed.start)
        })
        Box(Modifier.size(75.dp).background(Color.Black).constrainAs(boxBlack){
            top.linkTo(boxRosa.bottom)
            start.linkTo(boxRosa.end)
        })
        Box(Modifier.size(75.dp).background(Color.Yellow).constrainAs(boxYellow){
            bottom.linkTo(boxRed.top)
            start.linkTo(boxRed.end)
        })
        Box(Modifier.size(75.dp).background(Color.Blue).constrainAs(boxBlue){
            bottom.linkTo(boxRed.top)
            end.linkTo(boxRed.start)
        })
        Box(Modifier.size(75.dp).background(Color.Green).constrainAs(boxGreen){
            bottom.linkTo(boxBlue.top)
            start.linkTo(boxBlue.end)
        })
    }

}


