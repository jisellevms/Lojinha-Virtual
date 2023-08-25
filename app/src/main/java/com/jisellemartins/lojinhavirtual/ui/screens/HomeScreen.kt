package com.jisellemartins.lojinhavirtual.ui.screens

.import

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.jisellemartins.lojinhavirtual.R
import com.jisellemartins.lojinhavirtual.model.CategoryModel
import com.jisellemartins.lojinhavirtual.ui.components.ListCategories
import com.jisellemartins.lojinhavirtual.ui.components.ListCategoriesMenu
import com.jisellemartins.lojinhavirtual.ui.components.NavigationMenu
import com.jisellemartins.lojinhavirtual.ui.components.SearchProduct
import com.jisellemartins.lojinhavirtual.ui.components.ShowCart
import com.jisellemartins.lojinhavirtual.utils.quicksand
import com.jisellemartins.lojinhavirtual.viewmodel.MainViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun HomeScreen(
    navController: NavController,
    searchText: String = "",
    categoriesList: List<CategoryModel>,
    viewModelMain: MainViewModel
) {
    var text by remember { mutableStateOf(searchText) }
    var selectedItem by remember { mutableStateOf(0) }


    Scaffold(content = {
        Column(
            Modifier
                .fillMaxWidth()
        ) {

            Column(
                Modifier
                    .background(colorResource(id = R.color.purple))
                    .height(140.dp)
                    .fillMaxWidth()
                    .clickable { viewModelMain.getCategoriesList() },
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                val cleaned = true
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
                            .onKeyEvent {
                                if(it.key == Key.Backspace) {
                                    viewModelMain.stateInicial()
                                    true
                                }else false
                                
                            }
                    )


                }
            }
            Column(
                Modifier
                    .background(Color.White)
                    .align(CenterHorizontally)
                    .fillMaxWidth()
            ) {
                ListCategoriesMenu(viewModelMain.listCategoriesCache, viewModelMain)
                Spacer(Modifier.height(15.dp))
                Divider()
            }
            val list by viewModelMain._liveData.observeAsState(listOf())
            if (text.isBlank()) {
                LazyColumn(contentPadding = PaddingValues(bottom = 120.dp)) {
                    items(list) { category ->
                        Column() {
                            ListCategories(category, navController)
                        }
                    }

                }
            } else { viewModelMain.filterCategoryByName(text)

                LazyColumn(contentPadding = PaddingValues(bottom = 120.dp)) {
                    items(list) { category ->
                        Column() {
                            ListCategories(category, navController)
                        }
                    }

                }
            }

        }
    },
        bottomBar = {
            Column {
                ShowCart()
                NavigationMenu(selectedItem = selectedItem)
            }

        })


}


@Preview(showBackground = true, widthDp = 375)
@Composable
fun showHome() {
    //HomeScreen()
}