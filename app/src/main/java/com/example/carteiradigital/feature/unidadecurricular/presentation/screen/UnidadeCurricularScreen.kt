package com.example.carteiradigital.feature.unidadecurricular.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.carteiradigital.feature.unidadecurricular.presentation.UnidadeCurricularViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UnidadeCurricularScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    viewModel: UnidadeCurricularViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Unidades Curriculares") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Voltar"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            // Mostra a bolinha girando enquanto carrega (seus 1800ms de delay)
            if (uiState.isLoading) {
                CircularProgressIndicator()
            } else {
                UnidadeCurricularContent(
                    unidadesCurriculares = uiState.unidadesCurriculares,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}