package com.mahshad.cupcakeapplication.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mahshad.cupcakeapplication.data.DataSource.quantityOptions

@Composable
fun QuantityButtons() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        quantityOptions.forEach { item ->
            Button(
                modifier = Modifier.fillMaxWidth(),
                ///when the click happens, move to another page,
                // update the quantity and update the price
                onClick = {}
            ) {
                Text("${item.first}")
            }
        }
    }
}

@Preview
@Composable
fun show() {
    QuantityButtons()
}
