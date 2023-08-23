package com.jisellemartins.lojinhavirtual.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jisellemartins.lojinhavirtual.ui.components.BodyProductDetails
import com.jisellemartins.lojinhavirtual.ui.components.BottomAddProduct
import com.jisellemartins.lojinhavirtual.ui.components.ImageProductDetails
import com.jisellemartins.lojinhavirtual.ui.components.TitleProductDetails


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailScreen() {
    Column(
        Modifier.background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TitleProductDetails()
        Spacer(modifier = Modifier.size(20.dp))
        ImageProductDetails(345,75,15)
        BodyProductDetails()
        Divider()
        BottomAddProduct()

    }

}

@Preview
@Composable
fun ShowProductDetailScreen() {
    ProductDetailScreen()
}