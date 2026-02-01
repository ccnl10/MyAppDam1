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
// CONSTRAINTLAYOUT centerTo,certerHorizontallyTo,centerVerticallyTo
fun MyConstraintLayout3(modifier: Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize().background(Color.Blue)) {
        val (boxMagenta, boxYellow) = createRefs()
        Box(modifier = Modifier.size(120.dp).background(Color.Yellow).constrainAs(boxYellow){
           /*top.linkTo(parent.top)
            end.linkTo(parent.end)
            start.linkTo(parent.start)
            bottom.linkTo(parent.bottom)
            */
            centerTo(parent)
            //centerVerticallyTo(parent)
            //centerHorizontallyTo(parent)

            })
        Box(modifier = Modifier.size(120.dp).background(Color.Magenta).constrainAs(boxMagenta){
            bottom.linkTo(boxYellow.top)
            end.linkTo(boxYellow.start)
        })
    }
}

@Preview(showBackground = true)
@Composable
fun MyConstraintLayout3Preview() {
    MyConstraintLayout3(modifier = Modifier)
}