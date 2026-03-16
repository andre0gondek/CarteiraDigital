package com.example.carteiradigital.feature.carteirinha.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.carteiradigital.core.designsystem.navigation.Routes

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        HomeContent(
            onButtonClick = {
                navController.navigate(Routes.Carteirinha.route)
            },
            modifier = modifier
        )
    }
}