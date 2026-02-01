package com.iesvirreymorcillo.myappdam1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.iesvirreymorcillo.myappdam1.ComponentesMaterial3.Text.MyTextField4M3
import com.iesvirreymorcillo.myappdam1.ui.theme.MyAppDam1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAppDam1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                 /*   Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )*/

                    //MyText1M3()
                    //MyText1M3(Modifier.padding(innerPadding).background(Color.Red))
                    //MyText1M3(Modifier.padding(innerPadding))
                    //MyText2M3(Modifier.padding(innerPadding))
                    //MyTextField0M3(Modifier.padding(innerPadding))
                   // MyTextField1M3(Modifier.padding(innerPadding))
                    //MyTextField2M3(Modifier.padding(innerPadding))
                    //MyTextField3M3(Modifier.padding(innerPadding))
                    MyTextField4M3(Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyAppDam1Theme {
        Greeting("Cristian")
    }
}