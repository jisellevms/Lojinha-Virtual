package com.jisellemartins.lojinhavirtual.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jisellemartins.lojinhavirtual.R
import com.jisellemartins.lojinhavirtual.ui.screens.import.HomeScreen

@Composable
fun ShowCart(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(45.dp)
        .background(colorResource(id = R.color.purple)),
        horizontalArrangement = Arrangement.SpaceBetween) {
        Icon(modifier = Modifier.padding(10.dp), painter = painterResource(id = R.drawable.vector__3_), contentDescription = "", tint = Color.White)
        Text(modifier = Modifier.padding(10.dp), text = "Ver Carrinho", color = Color.White)
        Text(modifier = Modifier.padding(10.dp), text = "R$ 450,00", color = Color.White)
    }
}

@Preview(showBackground = true, widthDp = 375)
@Composable
fun showCartPreview() {
    ShowCart()
}