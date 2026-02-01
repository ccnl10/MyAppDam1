package com.iesvirreymorcillo.myappdam1.Componentes.layouts.Barrier

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
// Ejercicio Barrier 1
fun MyBarrier1(modifier: Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (boxRed, boxGreen, boxYellow) = createRefs()
        //val endBarrier = createEndBarrier(boxRed, boxGreen)
        //val startBarrie = createStartBarrier(boxRed, boxGreen)
        //val topBarrier = createTopBarrier(boxRed, boxGreen)
        val bottomBarrier = createBottomBarrier(boxRed, boxGreen)


        Box(Modifier.size(125.dp).background(Color.Green).constrainAs(boxGreen){
            start.linkTo(parent.start, margin = 45.dp)
        })

        Box(Modifier.size(235.dp).background(Color.Red).constrainAs(boxRed){
            top.linkTo(boxGreen.bottom)
            start.linkTo(parent.start, margin = 32.dp)
            
        })


        Box(modifier = Modifier.size(50.dp).background(Color.Yellow).constrainAs(boxYellow){
           top.linkTo(bottomBarrier)
        })

    }
}

@Preview(showBackground = true)
@Composable
fun MyBarrier1Preview() {
    MyBarrier1(modifier = Modifier)
}
