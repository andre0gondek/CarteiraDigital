package com.example.carteiradigital.feature.carteirinha.presentation.screen

import android.R.attr.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.carteiradigital.R
import com.example.carteiradigital.core.designsystem.theme.theme.CarteiraDigitalTheme
import com.example.carteiradigital.feature.carteirinha.presentation.component.PerfilAluno
import com.example.carteiradigital.feature.carteirinha.presentation.component.QrCode

@Composable
fun CarteirinhaContent(
    qrCodeContent: String = "numero de matricula do aluno",
    modifier: Modifier = Modifier
) {
    // 1. Detecta se o sistema está no modo escuro
    val isDarkTheme = isSystemInDarkTheme()

    // 2. Define o alpha baseado no tema (ex: 0.7f para claro, 0.4f para escuro)
    val backgroundAlpha = if (isDarkTheme) 0.1f else 0.7f

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Image(
            painter = painterResource(R.drawable.wpp2),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .alpha(backgroundAlpha)
        )

        Column(
            modifier = Modifier
                .safeDrawingPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                painter = painterResource(R.drawable.senailogo2),
                contentDescription = "Logo do SENAI São Paulo",
                modifier = Modifier.fillMaxWidth(0.6f)
            )

            PerfilAluno(
                modifier = Modifier.fillMaxWidth(0.9f)
            )

            QrCode(
                conteudo = qrCodeContent,
                modifier = Modifier.fillMaxWidth(0.6f)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CarteirinhaContentPreviewClaro() {
    CarteiraDigitalTheme(darkTheme = false) {
        CarteirinhaContent()
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CarteirinhaContentPreviewEscuro() {
    CarteiraDigitalTheme(darkTheme = true) {
        CarteirinhaContent()
    }
}