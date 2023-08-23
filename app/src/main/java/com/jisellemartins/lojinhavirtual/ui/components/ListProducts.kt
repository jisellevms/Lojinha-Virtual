package com.jisellemartins.lojinhavirtual.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jisellemartins.lojinhavirtual.R
import com.jisellemartins.lojinhavirtual.data.listCategories
import com.jisellemartins.lojinhavirtual.utils.quicksand

@Composable
fun ListProducts() {
    Column(Modifier.background(Color.White)) {
        Text(text = "Camas")
        Spacer(modifier = Modifier.height(20.dp))
        LazyRow() {
            items(listCategories) { item ->
                ProductItem()
            }
        }
    }
}

@Composable
fun ProductItem() {
    Column(
        modifier = Modifier
            .border(
                1.dp,
                color = colorResource(R.color.cinzinha),
                RoundedCornerShape(5.dp)
            )
            .background(Color.White)
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier.border(
                2.dp,
                color = colorResource(R.color.cinzinha),
                RoundedCornerShape(5.dp)
            )
        )
        ImageProductDetails(165, 55, 10)
        Text(
            text = "Cama Londres Azul - Chicxs",
            color = Color.Black,
            fontFamily = quicksand,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.height(15.dp))

        Column {
            Row {
                Text(
                    text = "De ", color = colorResource(id = R.color.cinzinha),
                    fontFamily = quicksand,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp
                )
                Text(
                    text = "R\$ 295,90", color = Color.Red,
                    fontFamily = quicksand,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    style = TextStyle(textDecoration = TextDecoration.LineThrough)
                )
            }
            Row {
                Text(
                    text = "Por ", color = colorResource(id = R.color.cinzinha),
                    fontFamily = quicksand,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp
                )
                Text(
                    text = "R\$ 266,31", color = Color.Black,
                    fontFamily = quicksand,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp
                )
            }
        }

    }
    Spacer(modifier = Modifier.width(10.dp))
}

@Preview(showBackground = true)
@Composable
fun ShowProductItem() {
    ProductItem()
}

@Preview
@Composable
fun ShowListProducts() {
    ListProducts()
}