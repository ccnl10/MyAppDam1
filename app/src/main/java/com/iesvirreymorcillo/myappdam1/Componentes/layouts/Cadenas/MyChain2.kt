package com.iesvirreymorcillo.myappdam1.Componentes.layouts.Cadenas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyChain2(modifier: Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxGreen, boxYellow) = createRefs()
        val topGuide = createGuidelineFromTop(0.3f)

        createHorizontalChain(boxRed, boxGreen, boxYellow, chainStyle = ChainStyle.SpreadInside)

        Box(Modifier.height(300.dp).width(75.dp).background(Color.Red).constrainAs(boxRed){
           top.linkTo(topGuide)
        })

        Box(Modifier.height(150.dp).width(75.dp).background(Color.Green).constrainAs(boxGreen){
            top.linkTo(topGuide)
        })

        Box(Modifier.size(75.dp).background(Color.Yellow).constrainAs(boxYellow){
            top.linkTo(topGuide)

        })
    }

    }

@Preview(showBackground = true)
@Composable
fun MyChain2Preview() {
    MyChain2(modifier = Modifier)
}