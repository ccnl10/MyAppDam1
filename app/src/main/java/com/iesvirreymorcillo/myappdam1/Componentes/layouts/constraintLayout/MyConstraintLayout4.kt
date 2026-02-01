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
// CONSTRAINTLAYOUT GuideLine (startGuide, endGuide, topGuide, bottomGuide)
fun MyConstraintLayout4(modifier: Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize().background(Color.Blue)) {
        val boxYellow = createRef()
        val boxMagenta = createRef()
        //val (boxYellow,boxMagenta) = createRefs()
        val topGuide = createGuidelineFromTop(0.1f)
        val startGuide = createGuidelineFromStart(0.1f)
        val endGuide = createGuidelineFromEnd(0.1f)
        val bottomGuide = createGuidelineFromBottom(0.1f)


        Box(modifier = Modifier.size(120.dp).background(Color.Yellow).constrainAs(boxYellow){
            top.linkTo(topGuide, margin = 10.dp)
            //bottom.linkTo(topGuide)
            //start.linkTo(startGuide)
           // bottom.linkTo(topGuide)
            //start.linkTo(startGuide)
           // start.linkTo(endGuide)
            start.linkTo(startGuide)
            })

        Box(modifier = Modifier.size(120.dp).background(Color.Magenta).constrainAs(boxMagenta){
            top.linkTo(boxYellow.top)
            end.linkTo(endGuide)
        })

    }
}

@Preview(showBackground = true)
@Composable
fun MyConstraintLayout4Preview() {
    MyConstraintLayout4(modifier = Modifier)
}