package com.example.carteiradigital.feature.carteirinha.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.carteiradigital.R

@Composable
fun LogoSenai(
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(R.drawable.senailogo2),
        contentDescription = "logo_senai",
        modifier = Modifier
            .width(200.dp),
        contentScale = ContentScale.Fit
    )
}