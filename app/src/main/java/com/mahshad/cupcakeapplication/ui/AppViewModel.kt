package com.mahshad.cupcakeapplication.ui

import androidx.lifecycle.ViewModel
import com.mahshad.cupcakeapplication.data.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class AppViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(UiState())
    val uiState = _uiState.asStateFlow()

    fun updateQuantity(quantity: Int) {
        _uiState.update { stateValue ->
            stateValue.copy(quantity = quantity)
        }
    }

    fun updatePrice() {
        _uiState.update { stateValue ->
            stateValue.copy(price = stateValue.quantity * 2)
        }
    }
}