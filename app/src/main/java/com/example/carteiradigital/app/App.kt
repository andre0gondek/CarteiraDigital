package com.example.carteiradigital.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.carteiradigital.core.designsystem.navigation.AppNavHost
import com.example.carteiradigital.core.designsystem.theme.theme.CarteiraDigitalTheme

@Composable
fun App() {
    CarteiraDigitalTheme() {
        val navController = rememberNavController()
        AppNavHost(
            navController = navController,
        )
    }
}