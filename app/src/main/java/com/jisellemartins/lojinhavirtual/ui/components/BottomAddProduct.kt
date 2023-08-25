package com.jisellemartins.lojinhavirtual.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jisellemartins.lojinhavirtual.R
import com.jisellemartins.lojinhavirtual.model.Product
import com.jisellemartins.lojinhavirtual.utils.discountCalc
import com.jisellemartins.lojinhavirtual.utils.quicksand

@Composable
fun BottomAddProduct(product: Product) {
    BottomNavigation(backgroundColor = Color.White, modifier = Modifier.height(70.dp)) {
        Row(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(start = 25.dp, end = 25.dp, top = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                Modifier
                    .background(Color.White)
                    .border(
                        1.dp,
                        colorResource(id = R.color.cinzinha),
                        RoundedCornerShape(5.dp)
                    )
                    .width(100.dp)
                    .height(38.dp)
                    .align(alignment = Alignment.CenterVertically),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                var count = 1
                Box(Modifier.padding(0.dp)) {
                    Icon(
                        painterResource(id = R.drawable.vector__4_),
                        contentDescription = "",
                        tint = colorResource(id = R.color.purple),

                        )
                }
                Text(
                    text = count.toString(),
                    modifier = Modifier.padding(start = 15.dp, end = 15.dp),
                    color = Color.Black,
                    fontFamily = quicksand,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center
                )

                Box(Modifier.padding(0.dp).clickable{ count++})
                {
                    Icon(
                        Icons.Default.Add,
                        contentDescription = "",
                        tint = colorResource(id = R.color.purple),

                        )
                }
            }
            Row(
                Modifier.align(alignment = Alignment.CenterVertically),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.width(189.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(
                            id = R.color.purple
                        )
                    )
                ) {
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(
                            text = "Adicionar", color = Color.White,
                            fontFamily = quicksand,
                            fontWeight = FontWeight.Medium,
                            fontSize = 14.sp
                        )
                        Text(
                            text = "R$" + discountCalc(
                                product.discount,
                                product.price,
                                product.percentDiscount
                            ),
                            color = Color.White,
                            fontFamily = quicksand,
                            fontWeight = FontWeight.Medium,
                            fontSize = 14.sp
                        )
                    }

                }
            }


        }
    }
}

@Preview
@Composable
fun ShowBottomAddProduct() {
    BottomAddProduct(productTest)
}