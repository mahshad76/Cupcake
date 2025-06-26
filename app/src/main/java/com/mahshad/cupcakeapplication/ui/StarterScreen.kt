package com.mahshad.cupcakeapplication.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.mahshad.cupcakeapplication.data.DataSource.quantityOptions

@Composable
fun StarterScreen(
    price: Int,
    quantity: Int,
    onClick: (Int) -> Unit
) {

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        quantityOptions.forEach { item ->
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { onClick(item.second) }
            ) {
                Text("${item.first}")
            }
        }
    }
}

//@Preview
//@Composable
//fun Show() {
//    StarterScreen()
//}
