package com.example.carteiradigital.feature.unidadecurricular.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteiradigital.core.designsystem.theme.theme.CarteiraDigitalTheme
import com.example.carteiradigital.feature.unidadecurricular.presentation.component.UnidadeCurricularCard
import com.example.carteiradigital.feature.unidadecurricular.presentation.domain.model.UnidadeCurricular

@Composable
fun UnidadeCurricularContent(
    modifier: Modifier = Modifier,
    unidadesCurriculares: List<UnidadeCurricular>
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(unidadesCurriculares) { uc ->
            UnidadeCurricularCard(unidadeCurricular = uc)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun UnidadeCurricularContentPreview() {
    CarteiraDigitalTheme {
        UnidadeCurricularContent(
            unidadesCurriculares = listOf(
                UnidadeCurricular("1", "Programação Mobile", "Rafael Costa", 8.5, 9.0, 8.75, 2),
                UnidadeCurricular("2", "Banco de Dados", "Tércio Ribeiro", 7.5, 8.0, 7.75, 1)
            )
        )
    }
}