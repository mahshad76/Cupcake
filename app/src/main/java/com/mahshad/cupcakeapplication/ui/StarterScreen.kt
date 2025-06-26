package com.mahshad.cupcakeapplication.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mahshad.cupcakeapplication.data.DataSource.quantityOptions

@Composable
fun StarterScreen(viewModel: AppViewModel = AppViewModel()) {
    val state = viewModel.uiState.collectAsState()

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        quantityOptions.forEach { item ->
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    viewModel.updateQuantity(item.second)
                    viewModel.updatePrice()
                    ///navigation
                }
            ) {
                Text("${item.first}")
            }
        }
    }
}

@Preview
@Composable
fun Show() {
    StarterScreen()
}
