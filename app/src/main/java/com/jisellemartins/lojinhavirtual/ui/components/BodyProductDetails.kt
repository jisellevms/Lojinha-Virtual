package com.jisellemartins.lojinhavirtual.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jisellemartins.lojinhavirtual.R
import com.jisellemartins.lojinhavirtual.utils.quicksand
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import com.jisellemartins.lojinhavirtual.model.Product

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BodyProductDetails(product: Product) {
    Column {
        Column(Modifier.padding(start = 25.dp, end = 25.dp, top = 10.dp)) {
            Text(
                text = product.title, color = colorResource(id = R.color.purple),
                fontFamily = quicksand,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = product.description,
                fontFamily = quicksand,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.size(20.dp))
        Column(
            Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp, bottom = 10.dp)
        ) {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Observações:",
                    color = colorResource(id = R.color.purple),
                    fontFamily = quicksand,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp
                )
                Text(
                    text = "0/500",
                    color = Color.Gray,
                    fontFamily = quicksand,
                    fontWeight = FontWeight.Medium,
                    fontSize = 10.sp
                )
            }

            TextField(
                value = "", onValueChange = ({}), modifier = Modifier
                    .padding(0.dp)
                    .fillMaxWidth()
                    .border(1.dp, colorResource(id = R.color.cinzinha), RoundedCornerShape(5.dp))
                    .height(40.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                )
            )
        }
    }
}

@Preview
@Composable
fun ShowBodyProductDetails() {
    BodyProductDetails(productTest)
}