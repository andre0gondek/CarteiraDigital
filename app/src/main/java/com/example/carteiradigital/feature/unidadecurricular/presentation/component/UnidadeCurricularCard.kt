package com.example.carteiradigital.feature.unidadecurricular.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteiradigital.core.designsystem.theme.theme.CarteiraDigitalTheme
import com.example.carteiradigital.feature.unidadecurricular.presentation.domain.model.UnidadeCurricular

@Composable
fun UnidadeCurricularCard(
    modifier: Modifier = Modifier,
    unidadeCurricular: UnidadeCurricular
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = unidadeCurricular.nome,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )

            // Professor
            Text(
                text = "Professor: ${unidadeCurricular.professor}",
                style = MaterialTheme.typography.bodyMedium
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "N1: ${unidadeCurricular.nota1}",
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = "N2: ${unidadeCurricular.nota2}",
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = "Média: ${unidadeCurricular.media}",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold // Deixa a média em negrito para destacar
                )
            }

            Text(
                text = "Faltas: ${unidadeCurricular.faltas}",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun UnidadeCurricularPreview() {
    CarteiraDigitalTheme {
        UnidadeCurricularCard(
            unidadeCurricular = UnidadeCurricular(
                id = "1",
                nome = "Internet das Coisas",
                professor = "Lucas Felfoldi",
                nota1 = 10.0,
                nota2 = 7.0,
                media = 8.5, // Ajustei a média aqui no preview só pra fazer sentido matemático rs
                faltas = 5
            )
        )
    }
}