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
// Ejercicio 3 de ConstraintLayout
fun MyConstraintLayout7(modifier: Modifier) {

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {

        // Guías
        val startGuide = createGuidelineFromStart(0.1f)
        val endGuide = createGuidelineFromEnd(0.1f)
        val topGuide = createGuidelineFromTop(0.1f)
        val bottomGuide = createGuidelineFromBottom(0.1f)

        // Referencias
        val (caja1, caja2, caja3, caja4, caja5, caja6) = createRefs()

        // Caja 1 - Arriba izquierda
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Red)
                .constrainAs(caja1) {
                    start.linkTo(startGuide, margin = 8.dp)
                    top.linkTo(topGuide, margin = 8.dp)
                }
        )

        // Caja 2 - Arriba derecha
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Blue)
                .constrainAs(caja2) {
                    end.linkTo(endGuide, margin = 8.dp)
                    top.linkTo(topGuide, margin = 8.dp)
                }
        )

        // Caja 3 - Centro horizontal usando guías
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Green)
                .constrainAs(caja3) {
                    start.linkTo(startGuide)
                    end.linkTo(endGuide)
                    top.linkTo(caja1.bottom, margin = 16.dp)
                }
        )

        // Caja 4 - Debajo de caja 1
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Yellow)
                .constrainAs(caja4) {
                    start.linkTo(caja1.start)
                    top.linkTo(caja1.bottom, margin = 16.dp)
                }
        )

        // Caja 5 - Debajo de caja 2
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Magenta)
                .constrainAs(caja5) {
                    end.linkTo(caja2.end)
                    top.linkTo(caja2.bottom, margin = 16.dp)
                }
        )

        // Caja 6 - Abajo centrada
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Cyan)
                .constrainAs(caja6) {
                    start.linkTo(startGuide)
                    end.linkTo(endGuide)
                    bottom.linkTo(bottomGuide, margin = 8.dp)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MyConstraintLayout7Preview() {
    MyConstraintLayout7(modifier = Modifier)
}
