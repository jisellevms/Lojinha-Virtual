package com.jisellemartins.lojinhavirtual.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.jisellemartins.lojinhavirtual.R
import com.jisellemartins.lojinhavirtual.data.listCategories
import com.jisellemartins.lojinhavirtual.model.CategoryModel
import com.jisellemartins.lojinhavirtual.utils.quicksand
import com.jisellemartins.lojinhavirtual.viewmodel.MainViewModel

@Composable
fun ListCategoriesMenu(categoriesList: List<CategoryModel>, viewModelMain: MainViewModel) {

    LazyRow(Modifier.padding(top = 10.dp)) {
        items(categoriesList) { category ->
            Category(category, viewModelMain)
        }
    }
}
@Composable
fun Category(category: CategoryModel, viewModelMain: MainViewModel) {
    val context = LocalContext.current
    val s = category.icon.replace("R.drawable.", "")
    val drawableId = remember(s) {
        context.resources.getIdentifier(
            s,
            "drawable",
            context.packageName
        )
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.clickable {viewModelMain.filterCategory(category.id)}) {
        Box(
            Modifier
                .background(Transparent, CircleShape)
                .padding(horizontal = 18.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.circle),
                modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
                    .padding(5.dp)
                    .border(BorderStroke(1.dp, colorResource(id = R.color.purple)), CircleShape)
                    .padding(4.dp)
                    .clickable { viewModelMain.filterCategory(category.id) },
                contentDescription = "",
                colorFilter = ColorFilter.tint(colorResource(id = R.color.purple))
            )
            Icon(
                painter = painterResource(drawableId),
                contentDescription = "",
                Modifier
                    .width(25.dp)
                    .height(25.dp),
                tint = White,

                )

        }
        Text(
            text = category.category,
            color = colorResource(id = R.color.purple),
            fontWeight = FontWeight.Bold, fontFamily = quicksand,
        )


    }
}

@Preview(showBackground = true)
@Composable
fun showListCategories() {
    //ListCategoriesMenu(listCategories)

}

@Preview(showBackground = true)
@Composable
fun showCategory() {
    //Category(CategoryModel("Cama", "", 0, emptyList()))

}