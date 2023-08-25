package com.jisellemartins.lojinhavirtual.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.gson.Gson
import com.jisellemartins.lojinhavirtual.R
import com.jisellemartins.lojinhavirtual.model.Product
import com.jisellemartins.lojinhavirtual.ui.screens.ProductDetailScreen
import com.jisellemartins.lojinhavirtual.utils.discountCalc
import com.jisellemartins.lojinhavirtual.utils.quicksand
import com.jisellemartins.lojinhavirtual.viewmodel.MainViewModel
import java.net.URLDecoder
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@Composable
fun ProductItem(product: Product, navController: NavController) {

    fun navigateToProductDetail(product: Product) {
        val productJson = Gson().toJson(product)

        var encode = URLEncoder.encode(productJson, StandardCharsets.UTF_8.toString())



        navController.navigate("ProductDetailsScreen/$encode")
    }

    Column(
        modifier = Modifier
            .border(
                1.dp,
                color = colorResource(R.color.cinzinha),
                RoundedCornerShape(5.dp)
            )
            .background(Color.White)
            .padding(10.dp)
            .width(193.dp)
            .height(280.dp)
            .clickable(onClick = { navigateToProductDetail(product)
            }),
        verticalArrangement = Arrangement.Center

    ) {
        Box(
            modifier = Modifier
                .border(
                    1.dp,
                    color = colorResource(R.color.cinzinha)
                )
                .fillMaxWidth(), contentAlignment = Alignment.Center
        ) {
            ImageProductDetails(200, 55, 10, product)
        }

        Text(
            text = product.title,
            color = Color.Black,
            fontFamily = quicksand,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp
        )
        Spacer(
            modifier = Modifier
                .height(15.dp)
                .background(Color.Black)
        )

        Column(
            Modifier
                .background(Color.White)
                .fillMaxWidth()
        ) {
            if (product.discount) {
                Row(
                    Modifier
                        .fillMaxWidth()
                ) {

                    Text(
                        text = "De ", color = colorResource(id = R.color.cinzinha),
                        fontFamily = quicksand,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp
                    )
                    Text(
                        text = "R\$" + product.price,
                        color = Color.Red,
                        fontFamily = quicksand,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        style = TextStyle(textDecoration = TextDecoration.LineThrough)
                    )
                }
            }

            Row(
                Modifier
                    .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row {
                    if (product.discount) {
                        Text(
                            text = "Por ", color = colorResource(id = R.color.cinzinha),
                            fontFamily = quicksand,
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp
                        )
                    }

                    Text(
                        text = "R\$" + discountCalc(
                            product.discount,
                            product.price,
                            product.percentDiscount
                        ),
                        color = Color.Black,
                        fontFamily = quicksand,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                }
                Icon(
                    painter = painterResource(id = R.drawable.vector__5_),
                    contentDescription = "",
                    tint = colorResource(
                        id = R.color.purple
                    )
                )

            }
        }

    }
    Spacer(modifier = Modifier.width(10.dp))
}


@Preview(showBackground = true)
@Composable
fun ShowProductItem() {
    /*ProductItem(
        Product(
            "1",
            "camas",
            "Cama Londres Azul - Chicxs",
            "",
            130.0F,
            false,
            0,
            "https://static1.efacil.com.br/wcsstore/ExtendedSitesCatalogAssetStore/Imagens/360/2665-00026_01.jpg"
        )
    )*/
}