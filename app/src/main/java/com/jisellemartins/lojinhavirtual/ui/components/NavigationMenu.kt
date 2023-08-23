package com.jisellemartins.lojinhavirtual.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jisellemartins.lojinhavirtual.data.itemsNavBar
import com.jisellemartins.lojinhavirtual.ui.screens.import.HomeScreen

@Composable
fun NavigationMenu(selectedItem:Int){
    BottomNavigation(Modifier.height(65.dp),backgroundColor = Color.White) {
        itemsNavBar.forEachIndexed { index, item ->
            BottomNavigationItem(
                icon = { Column(Modifier.padding(8.dp)) {
                    Icon( painter = painterResource(item.icon), contentDescription = "")
                } },
                label = { Text(item.item) },
                selected = selectedItem == index,
                onClick = {  }
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 375)
@Composable
fun showNaviagtion() {
    NavigationMenu(selectedItem = 0)
}
