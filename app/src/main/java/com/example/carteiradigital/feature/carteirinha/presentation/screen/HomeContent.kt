package com.example.carteiradigital.feature.carteirinha.presentation.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carteiradigital.core.designsystem.theme.theme.CarteiraDigitalTheme // Ajuste se necessário de acordo com seu projeto

@Composable
fun HomeContent (
    modifier: Modifier = Modifier,
    onButtonClick: () -> Unit = {}
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Bem-vindo(a)!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = onButtonClick,
            modifier = Modifier.fillMaxWidth(0.6f),
            shape = RoundedCornerShape(size = 9.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondary
            ),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colorScheme.secondary
            )
        ) {
            Text("Ir para Carteirinha")
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomeContentPreviewClaro() {
    CarteiraDigitalTheme(darkTheme = false) {
        HomeContent()
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun HomeContentPreviewEscuro() {
    CarteiraDigitalTheme(darkTheme = true) {
        HomeContent()
    }
}