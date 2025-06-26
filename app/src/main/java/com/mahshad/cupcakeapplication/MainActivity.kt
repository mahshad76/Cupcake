package com.mahshad.cupcakeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import com.mahshad.cupcakeapplication.ui.CupcakeApp
import com.mahshad.cupcakeapplication.ui.theme.CupcakeApplicationTheme

enum class Routes {
    Starter,
    Flavor,
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CupcakeApplicationTheme {
                CupcakeApp(NavHostController(this))
            }
        }
    }
}
