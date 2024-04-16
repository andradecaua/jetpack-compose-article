package com.example.artigocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artigocompose.ui.theme.ArtigoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtigoComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App(modifier: Modifier = Modifier){
    Column() {
        ArtigoImage(modifier)
        Artigo(text = stringResource(R.string.titulo), fontSize = 24.sp, modifier = modifier.padding(16.dp))
        Artigo(text = stringResource(R.string.text_1), modifier = modifier.padding(start = 16.dp, end = 16.dp))
        Artigo(text = stringResource(R.string.text_2), modifier = modifier.padding(16.dp))
    }
}

@Composable
fun ArtigoImage(modifier: Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Image(painter = image, contentDescription = null, contentScale = ContentScale.FillWidth)
}

@Composable
fun Artigo(text: String, fontSize: TextUnit = 16.sp, modifier: Modifier = Modifier){
    Text(text = text, modifier = modifier, fontSize = fontSize, textAlign = TextAlign.Justify)
}

@Composable
@Preview(showBackground = true)
fun AppPreview(){
    App()
}