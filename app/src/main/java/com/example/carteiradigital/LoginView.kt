package com.example.carteiradigital

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteiradigital.core.designsystem.theme.theme.CarteiraDigitalTheme

@Composable
fun LoginView(
    modifier: Modifier = Modifier
){
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 16.dp,
            alignment = Alignment.CenterVertically
        )
    ) {
        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text("Login")
            },
        )
        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text("Senha")
            },
        )
        ElevatedButton(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth(.6f),
            shape = RoundedCornerShape(size = 10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary
            ),
        ) {
            Text("Entrar")
        }

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun PreviewLoginClaro() {
    CarteiraDigitalTheme(darkTheme = false) {
        LoginView(
            modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun PreviewLoginEscuro() {
    CarteiraDigitalTheme(darkTheme = true) {
        LoginView(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )
    }
}