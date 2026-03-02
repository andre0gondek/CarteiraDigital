package com.example.carteiradigital

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Label
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carteiradigital.ui.theme.CarteiraDigitalTheme
import com.rafaelcosta.myapplication.QrCode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteiraDigitalTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CarteiraDigitalApp(
                        modifier = Modifier
                            .padding(paddingValues = innerPadding)
                            .fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
fun CarteiraDigitalApp(modifier: Modifier = Modifier) {
    Box {
        Image(
            painterResource(id = R.drawable.wp),
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

            Button(
                onClick = {   }
            ) {
                Text("aperte aqui")
            }

            TextField(
                value = "32132432541",
                onValueChange = {   },
                label = {
                    Text("Número de Matrícula")
                }
            )

            OutlinedTextField(
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

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun PreviewCarteirinhaClaro() {
    CarteiraDigitalTheme(darkTheme = false) {
        CarteiraDigitalApp(modifier = Modifier.padding(16.dp))
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun PreviewCarteirinhaEscuro() {
    CarteiraDigitalTheme(darkTheme = true) {
        CarteiraDigitalApp(modifier = Modifier.padding(16.dp))
    }
}