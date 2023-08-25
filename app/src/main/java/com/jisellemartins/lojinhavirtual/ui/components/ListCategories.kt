package com.jisellemartins.lojinhavirtual.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.jisellemartins.lojinhavirtual.model.CategoryModel
import com.jisellemartins.lojinhavirtual.utils.quicksand

@Composable
fun ListCategories(category: CategoryModel, navController: NavController) {
    Column(Modifier.background(Color.White).padding(top = 15.dp, start = 15.dp)) {
        Text(
            text = category.category,
            color = Color.Black,
            fontFamily = quicksand,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        LazyRow() {
            items(category.products) { product ->
                ProductItem(product, navController)
            }
        }
    }
}

@Preview
@Composable
fun ShowListProducts() {
    //ListProducts()
}