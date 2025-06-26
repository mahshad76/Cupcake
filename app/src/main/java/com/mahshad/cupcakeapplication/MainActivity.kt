package com.mahshad.cupcakeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mahshad.cupcakeapplication.ui.FlavorScreen
import com.mahshad.cupcakeapplication.ui.StarterScreen
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
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        NavHostController(context = this),
                        startDestination = Routes.Starter.name,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable(route = Routes.Starter.name) {
                            StarterScreen()
                        }

                        composable(route = Routes.Flavor.name) {
                            FlavorScreen()
                        }
                    }
                }
            }
        }
    }
}
