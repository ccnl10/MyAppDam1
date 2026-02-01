package com.iesvirreymorcillo.myappdam1.Componentes.layouts.Barrier

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
// Ejercicio Barrier 1
fun MyBarrier2(modifier: Modifier) {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {

        // Referencias a las cajas
        val (cajaRed, cajaBlue, cajaGreen, cajaYellow) = createRefs()
        //creamos el barrier
        val barrier = createEndBarrier(cajaRed, cajaBlue)

        // Caja Roja
        Box(
            modifier = Modifier
                .size(150.dp)     //Modifica el tamaño de la caja
                .background(Color.Red)
                .constrainAs(cajaRed) {
                    top.linkTo(parent.top, 32.dp)
                    start.linkTo(parent.start, 32.dp)
                }
        )

        // Caja Azul
        Box(
            modifier = Modifier
                .background(Color.Blue)
                .padding(16.dp) //Modifica el tamaño del padding
                .constrainAs(cajaBlue) {
                    top.linkTo(cajaRed.bottom, 16.dp)
                    start.linkTo(cajaRed.start)
                }
        )


        // Caja Verde
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Green)
                .constrainAs(cajaGreen) {
                    start.linkTo(barrier, 16.dp)
                   // start.linkTo(cajaRed.end)
                    centerVerticallyTo(parent)
                }
        )

        // Caja Amarilla
        Box(
            modifier = Modifier
                .size(60.dp)
                .background(Color.Yellow)
                .constrainAs(cajaYellow) {
                    top.linkTo(cajaGreen.bottom, 16.dp)
                    start.linkTo(barrier, 16.dp)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MyBarrier2Preview() {
    MyBarrier2(modifier = Modifier)
}
