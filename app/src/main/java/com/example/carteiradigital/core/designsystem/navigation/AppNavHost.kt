package com.example.carteiradigital.core.designsystem.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.carteiradigital.feature.auth.presentation.screen.LoginScreen
import com.example.carteiradigital.feature.carteirinha.presentation.screen.CarteirinhaScreen
import com.example.carteiradigital.feature.carteirinha.presentation.screen.HomeScreen
import com.example.carteiradigital.feature.unidadecurricular.presentation.screen.UnidadeCurricularScreen // Importação da tela de UCs

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Login.route
    ) {
        composable(Routes.Login.route) {
            LoginScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                navController = navController
            )
        }
        composable(Routes.Carteirinha.route) {
            CarteirinhaScreen(
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        composable(Routes.Home.route) {
            HomeScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                navController = navController
            )
        }
        // Nova rota implementada
        composable(Routes.UnidadesCurriculares.route) {
            UnidadeCurricularScreen(
                modifier = Modifier.fillMaxSize(),
                navController = navController // ISSO EVITA O CRASH!
            )
        }
    }
}