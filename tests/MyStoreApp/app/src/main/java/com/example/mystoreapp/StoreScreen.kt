package com.example.mystoreapp

import android.telecom.Call
import android.transition.CircularPropagation
import android.widget.Scroller
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter

@Composable
fun StoreScreen(modifier: Modifier = Modifier) {
    val viewStore: MainViewModel = viewModel()
    val productState by viewStore.productState

    Box(modifier = modifier.fillMaxSize()) {
        when {
            productState.loading -> {
                CircularProgressIndicator(modifier.align(Alignment.Center))
            }

            productState.error != null -> {
                Text(
                    text = "ERROR ${productState.error}",
                    modifier.align(Alignment.Center),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Green
                    )
                )
            }

            else -> ProductsScreen(products = productState.list)
        }
    }
}

@Composable
fun ProductsScreen(products: List<Product>) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Gray)) {
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 40.dp, bottom = 20.dp)

        ) {
            Text(
                text = "Loja",
                style = TextStyle(
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp))
                .background(Color.White)
        ) {


            LazyVerticalGrid(GridCells.Fixed(2), modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)) {
                items(products) {
                        product ->
                    ProductItem(product)
                }
            }
        }
    }
}

@Composable
fun ProductItem(product: Product) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = rememberAsyncImagePainter(product.image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .aspectRatio(1f)
        )

        Text(
            text = product.title,
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = Color.Black
            )
        )

        Text(
            text = "R$ ${product.price}",
            style = TextStyle(
                fontStyle = FontStyle.Italic,
                fontSize = 12.sp,
                color = Color.Gray
            )
        )
    }
}