package com.example.playzone_mobile.android

import GamesRepository
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import di.Inject.instance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val gamesRepository = instance<GamesRepository>()

        lifecycleScope.launch(Dispatchers.IO) {
            val games = gamesRepository.searchGame("sadsaf")

            withContext(Dispatchers.Main) {
                setContent {
                    MyApplicationTheme {
                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            color = MaterialTheme.colors.background
                        ) {
                            GreetingView(games.firstOrNull()?.title.orEmpty())
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun GreetingView(title: String) {
    Text(text = title)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}
