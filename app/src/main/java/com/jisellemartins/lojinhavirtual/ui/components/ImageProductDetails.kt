package com.jisellemartins.lojinhavirtual.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jisellemartins.lojinhavirtual.R
import com.jisellemartins.lojinhavirtual.utils.quicksand

@Composable
fun ImageProductDetails(sizeImage:Int, sizeDiscount:Int, sizeFont:Int) {
    Box(modifier = Modifier.size(sizeImage.dp), contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.image_teste),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),

            )
        Box(
            modifier = Modifier
                .background(colorResource(id = R.color.gree))
                .width(sizeDiscount.dp)
                .height(25.dp)
                .align(Alignment.TopStart)
        ) {
            Text(
                text = "10% OFF",
                color = Color.White,
                modifier = Modifier.align(Alignment.Center),
                fontFamily = quicksand,
                fontWeight = FontWeight.Bold,
                fontSize = sizeFont.sp
            )
        }
    }
}

@Preview
@Composable
fun showImageProductDetailsLittle() {
    ImageProductDetails(165,55, 10)
}

@Preview
@Composable
fun showImageProductDetailsBig() {
    ImageProductDetails(345,75,15)
}