package com.jisellemartins.lojinhavirtual

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.jisellemartins.lojinhavirtual.ui.screens.HomeScreen
import com.jisellemartins.lojinhavirtual.ui.theme.LojinhaVirtualTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    LojinhaVirtualTheme {
        Surface{
            HomeScreen()
        }
    }
}