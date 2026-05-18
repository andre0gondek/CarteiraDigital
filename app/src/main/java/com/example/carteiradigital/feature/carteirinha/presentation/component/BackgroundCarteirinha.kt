package com.example.carteiradigital.feature.carteirinha.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.carteiradigital.R

@Composable
fun BackgroundCarteirinha(
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(R.drawable.wpp2),
        contentDescription = "background",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .alpha(0.7f)
    )
}