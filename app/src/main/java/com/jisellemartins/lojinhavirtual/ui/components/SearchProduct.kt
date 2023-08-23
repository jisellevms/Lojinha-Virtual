package com.jisellemartins.lojinhavirtual.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jisellemartins.lojinhavirtual.R
import com.jisellemartins.lojinhavirtual.ui.theme.LojinhaVirtualTheme
import com.jisellemartins.lojinhavirtual.utils.quicksand

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchProduct(
    searchText: String,
    onSearchChange: (String) -> Unit,
    modifier: Modifier
) {
    TextField(
        value = searchText,
        modifier = modifier,
        onValueChange = { newValue ->
            onSearchChange(newValue)
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White,
        ),

        label = {
            Text(text = "O que você procura?")
        },
        trailingIcon = {
            Icon(Icons.Default.Search, contentDescription = "ícone de lupa")
        },
        textStyle = androidx.compose.ui.text.TextStyle(
            fontSize = 14.sp,
            fontFamily = quicksand,
            fontWeight = FontWeight.Light
        ))

}

@Preview(showBackground = true)
@Composable
fun SearchTextFieldPreview() {
    LojinhaVirtualTheme {
        Surface {
            SearchProduct(
                "",
                onSearchChange = {},
                Modifier
                    .background(colorResource(id = R.color.purple))
                    .padding(start = 10.dp, end = 10.dp)
            )
        }
    }
}