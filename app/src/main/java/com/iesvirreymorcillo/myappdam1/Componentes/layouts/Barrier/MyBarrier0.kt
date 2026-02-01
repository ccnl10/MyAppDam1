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
// ConstraintLayout Barrier
fun MyBarrier0(modifier: Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (boxRed, boxGreen, boxYellow) = createRefs()
        val barrier = createEndBarrier(boxRed, boxGreen)


        Box(Modifier.size(125.dp).background(Color.Green).constrainAs(boxGreen){
            start.linkTo(parent.start, margin = 16.dp)
        })

        Box(Modifier.size(200.dp).background(Color.Red).constrainAs(boxRed){
            top.linkTo(boxGreen.bottom)
            start.linkTo(parent.start, 32.dp)
            end.linkTo(barrier)
        })


        Box(modifier = Modifier.size(50.dp).background(Color.Yellow).constrainAs(boxYellow){
            start.linkTo(barrier)
            //end.linkTo(barrier)
        })

}
}

@Preview(showBackground = true)
@Composable
fun MyBarrier0Preview() {
    MyBarrier0(modifier = Modifier)
}
