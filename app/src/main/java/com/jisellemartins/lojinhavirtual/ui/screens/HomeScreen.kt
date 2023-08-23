package com.jisellemartins.lojinhavirtual.ui.screens

.import

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jisellemartins.lojinhavirtual.R
import com.jisellemartins.lojinhavirtual.ui.components.CategoryList
import com.jisellemartins.lojinhavirtual.ui.components.NavigationMenu
import com.jisellemartins.lojinhavirtual.ui.components.SearchProduct
import com.jisellemartins.lojinhavirtual.ui.components.ShowCart
import com.jisellemartins.lojinhavirtual.utils.quicksand

@Composable
fun HomeScreen(
    searchText: String = ""
) {
    var text by remember { mutableStateOf(searchText) }
    var selectedItem by remember { mutableStateOf(0) }

    Column(
        Modifier
            .fillMaxWidth()
    ) {

        Column(
            Modifier
                .background(colorResource(id = R.color.purple))
                .height(140.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Column {
                Text(
                    "Pet Friends Acessories",
                    Modifier
                        .align(CenterHorizontally)
                        .padding(top = 20.dp, bottom = 20.dp),
                    Color.White,
                    fontFamily = quicksand,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                SearchProduct(
                    searchText = text,
                    onSearchChange = {
                        text = it

                    },
                    Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp)
                )
            }


        }
        Column(
            Modifier
                .background(Color.White)
                .align(CenterHorizontally)
                .fillMaxWidth()) {
            CategoryList()
            Spacer(Modifier.height(15.dp))
            Divider()
        }
        /*Lista de produtos aqui*/

        ShowCart()
        NavigationMenu(selectedItem = selectedItem)

    }
}




@Preview(showBackground = true, widthDp = 375)
@Composable
fun showHome() {
    HomeScreen()
}