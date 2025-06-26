package com.mahshad.cupcakeapplication.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mahshad.cupcakeapplication.Routes

@Composable

fun CupcakeApp(
    navController: NavHostController,
    viewModel: AppViewModel = AppViewModel()
) {
    var uiState = viewModel.uiState.collectAsState()

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        NavHost(
            navController,
            startDestination = Routes.Starter.name,
            modifier = Modifier.padding(innerPadding),
        ) {
            composable(route = Routes.Starter.name) {
                StarterScreen(
                    uiState.value.quantity,
                    uiState.value.price,
                    onClick = { quantity: Int ->
                        viewModel.updateQuantity(quantity)
                        viewModel.updatePrice()
                    },
                )
            }

            composable(route = Routes.Flavor.name) {
                FlavorScreen()
            }
        }
    }
}