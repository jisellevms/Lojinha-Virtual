@file:OptIn(ExperimentalMaterial3Api::class)

package com.jisellemartins.lojinhavirtual.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.jisellemartins.lojinhavirtual.R
import com.jisellemartins.lojinhavirtual.model.Product
import com.jisellemartins.lojinhavirtual.ui.components.BodyProductDetails
import com.jisellemartins.lojinhavirtual.ui.components.BottomAddProduct
import com.jisellemartins.lojinhavirtual.ui.components.ImageProductDetails
import com.jisellemartins.lojinhavirtual.ui.components.TitleProductDetails
import com.jisellemartins.lojinhavirtual.viewmodel.ShoppingCartViewModel



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailScreen(navController: NavController, product: Product) {



    Scaffold(content = {
        Column(
            Modifier.background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TitleProductDetails()
            Spacer(modifier = Modifier.size(20.dp))
            ImageProductDetails(345, 75, 15, product)
            BodyProductDetails(product)


        }
    },
        bottomBar = {
            Divider(color = (colorResource(R.color.cinzinha)), thickness = 1.dp)
            BottomAddProduct(product)
        })


}

@Preview
@Composable
fun ShowProductDetailScreen() {
    //ProductDetailScreen()
}