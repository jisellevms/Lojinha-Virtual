package com.jisellemartins.lojinhavirtual

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.gson.Gson
import com.jisellemartins.lojinhavirtual.model.CategoryModel
import com.jisellemartins.lojinhavirtual.model.Product
import com.jisellemartins.lojinhavirtual.ui.screens.ProductDetailScreen
import com.jisellemartins.lojinhavirtual.ui.screens.import.HomeScreen
import com.jisellemartins.lojinhavirtual.ui.theme.LojinhaVirtualTheme
import com.jisellemartins.lojinhavirtual.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.net.URLDecoder
import java.nio.charset.StandardCharsets

class MainActivity : ComponentActivity() {

    val viewModelMain: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModelMain.getCategoriesList()
        setContent {
            App(viewModelMain)
        }
    }

}

@Composable
fun ComposeNavigation(list: List<CategoryModel>, viewModelMain: MainViewModel) {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "HomeScreen") {
        composable(route = "HomeScreen") {
            HomeScreen(navController, categoriesList = list, viewModelMain = viewModelMain)
        }
        composable(route = "ProductDetailsScreen/{product}",
            arguments = listOf(navArgument("product") {
                type = NavType.StringType
            })
        ) { backStackEntry->
            backStackEntry?.arguments?.getString("product")?.let { json->
                val decode = URLDecoder.decode(json, StandardCharsets.UTF_8.toString())
                val product = Gson().fromJson(decode, Product::class.java)
                ProductDetailScreen(navController, product)
            }
        }
    }
}

@Composable
fun App(viewModelMain: MainViewModel) {
    val list by viewModelMain._liveData.observeAsState(listOf())

    LojinhaVirtualTheme {
        Surface {
            ComposeNavigation(list = list, viewModelMain)
        }
    }
}
