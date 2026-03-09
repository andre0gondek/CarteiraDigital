package com.example.carteiradigital

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.rafaelcosta.myapplication.QrCode

@Composable
fun CarteiraDigitalView(modifier: Modifier = Modifier) {
    Box {
        Image(
            painterResource(id = R.drawable.wpp2),
            contentDescription = "Wallpaper",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painterResource(id = R.drawable.senailogo2),
                contentDescription = "Logo do SENAI",
                modifier = Modifier
                    .weight(.5f)

            )


            Image(
                painterResource(id = R.drawable.semfoto),
                contentDescription = "Imagem de perfil",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .weight(2f)
                    .size(200.dp)
                    .clip(CircleShape)
                    .aspectRatio(1f)
                    .fillMaxWidth(.6f)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth(.9f)
                    .weight(.3f),
                verticalAlignment = Alignment.CenterVertically
            ) {
                LabelText(
                    "Nome: ",

                    )
                ValueText(
                    "André Mendes",
                    modifier = Modifier.weight(1f)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth(.9f)
                    .weight(.5f),
                verticalAlignment = Alignment.CenterVertically
            ) {
                LabelText(
                    "Curso: ",

                    )
                ValueText(
                    value = "Desenvolvimento de Sistemas",
                    modifier = Modifier.weight(1f)
                )

            }
            TextField(
                value = "32132432541",
                onValueChange = {   },
                label = {
                    Text("Número de Matrícula")
                }
            )

            QrCode(
                conteudo = "90000000001416893976",
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth(.6f)
                    .clip(RoundedCornerShape(5.dp))
            )
        }
    }
}

