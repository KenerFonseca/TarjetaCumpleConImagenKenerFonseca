package com.example.tarjetacumpleconimagenkenerfonseca
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetacumpleconimagenkenerfonseca.ui.theme.TarjetaCumpleConImagenKenerFonsecaTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaCumpleConImagenKenerFonsecaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage( message ="Feliz Cumpleaños Kener!",  from ="atte: Jose")
                }
            }
        }
    }
}

@Composable
fun GreetingImage(message: String, from: String) {
    val image = painterResource(R.drawable.f)

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text = message,
                fontSize = 100.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                text = from,
                fontSize = 36.sp,
                textAlign = TextAlign.End,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
    }
}



@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    TarjetaCumpleConImagenKenerFonsecaTheme {
        GreetingImage(message = "Feliz Cumpleaños Kener", from ="Atte: Jose")

    }


}
