package com.example.mystoreapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val _productsState = mutableStateOf(ProductState())

    val productState: State<ProductState> = _productsState

    init {
        fetchProduct()
    }

    private fun fetchProduct() {
        viewModelScope.launch {
            try {
                val response = storeService.getProducts()
                _productsState.value = _productsState.value.copy(
                    loading = false,
                    list = response,
                    error = null
                )
            } catch (e: Exception) {
                _productsState.value = _productsState.value.copy(
                    loading = false,
                    error = "Error fetching ${e.message}",
                    list = emptyList()
                )
            } finally {
                println(_productsState.value.error)
            }
        }
    }

    data class ProductState(
        val loading: Boolean = true,
        val error: String? = null,
        val list: List<Product> = emptyList()
    )
}

