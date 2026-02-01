package com.iesvirreymorcillo.myappdam1.Componentes.layouts.constraintLayout

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
// CONSTRAINTLAYOUT AVANZADO (añadir margin entre cajas)
fun MyConstraintLayout5(modifier: Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxCyan) = createRefs()
        Box(Modifier.size(100.dp).background(Color.Red).constrainAs(boxRed){
            start.linkTo(boxYellow.start)
            bottom.linkTo(boxYellow.top, margin = 32.dp)
        })

        Box(Modifier.size(100.dp).background(Color.Yellow).constrainAs(boxYellow){
            centerTo(parent)
        })

        Box(Modifier.size(100.dp).background(Color.Cyan).constrainAs(boxCyan){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(boxYellow.bottom, margin = 32.dp)
            //bottom.linkTo(parent.bottom)
        })

    }

}

@Preview(showBackground = true)
@Composable
fun MyConstraintLayout5Preview() {
    MyConstraintLayout5(modifier = Modifier)
}
