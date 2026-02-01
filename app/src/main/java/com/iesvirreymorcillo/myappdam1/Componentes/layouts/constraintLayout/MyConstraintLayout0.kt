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
fun MyConstraintLayout0(modifier: Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        //En sustitución de los IDs vamos a crear referencias, para ello hacemos uso de la función createRefs().
        val (boxRed, boxGrey, boxYellow, boxMagenta, boxGreen)= createRefs()
        //A continuación esas referencias las asignamos a cada uno de los elementos Box. Usamos el modificador y la propiedad constrainAs.

        Box(modifier = Modifier.size(150.dp).background(Color.Red).constrainAs (boxRed){
            top.linkTo(boxYellow.bottom)
            start.linkTo(boxYellow.end)
        })

        Box(modifier = Modifier.size(150.dp).background(Color.Gray).constrainAs(boxGrey){
            top.linkTo(boxYellow.bottom)
            end.linkTo(boxYellow.start)
        })

        Box(modifier = Modifier.size(150.dp).background(Color.Green).constrainAs(boxGreen){
            bottom.linkTo(boxYellow.top)
            start.linkTo(boxYellow.end)
        })

        Box(modifier = Modifier.size(150.dp).background(Color.Magenta).constrainAs (boxMagenta) {
            bottom.linkTo(boxYellow.top)
            end.linkTo(boxYellow.start)
        })

        Box(modifier = Modifier.size(150.dp).background(Color.Yellow).constrainAs(boxYellow){
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
                start.linkTo(parent.start)
                top.linkTo(parent.top)
            })

    }
}