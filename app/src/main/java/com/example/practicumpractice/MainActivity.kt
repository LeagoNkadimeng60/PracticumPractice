package com.example.practicumpractice

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat
import com.example.practicumpractice.ui.theme.PracticumPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticumPracticeTheme {
                Text("Hello Welcome To My App")
                Column() {
                    Button(
                        onClick = {}
                    ) {
                        Text("Add To Playlist")
                    }
                    Button(
                        onClick = {
                            val intent = Intent(this@MainActivity, MainActivity2::class.java)
                            startActivity(intent)
                        }
                    ) {
                        Text("Add to playlist")
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {}
                    ) {
                        Text("Detail View")
                    }
                    Button(
                        onClick = {
                            finishAffinity()
                        }
                    ) {
                        Text("Exit")
                    }
                }
            }
        }
    }
}