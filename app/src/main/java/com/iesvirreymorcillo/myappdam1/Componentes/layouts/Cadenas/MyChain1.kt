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
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyChain1(modifier: Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxGreen, boxYellow) = createRefs()
        createHorizontalChain(boxRed, boxGreen, boxYellow, chainStyle = ChainStyle.Spread)

        Box(Modifier.size(75.dp).background(Color.Red).constrainAs(boxRed){
             //bottom.linkTo(parent.bottom)
        })

        Box(Modifier.size(75.dp).background(Color.Green).constrainAs(boxGreen){
          // bottom.linkTo(parent.bottom)
            //top.linkTo(parent.top)
        })

        Box(Modifier.size(75.dp).background(Color.Yellow).constrainAs(boxYellow){

        })
    }

    }

@Preview(showBackground = true)
@Composable
fun MyChains1Preview() {
    MyChain1(modifier = Modifier)
}