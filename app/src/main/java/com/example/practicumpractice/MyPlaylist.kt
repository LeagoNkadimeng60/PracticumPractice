package com.example.practicumpractice

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.practicumpractice.ui.theme.PracticumPracticeTheme

class MyPlaylist : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticumPracticeTheme {
                Column() {
                    Text("Enter song details")
                    var songTitle by remember { mutableStateOf("") }
                    OutlinedTextField(
                        value = songTitle
                                onValueChange ={ songTitle = it },
                        label = { Text("song Title ") },
                        placeholder = { Text("song Title") }

                    )
                    var artistName by remember { mutableStateOf("") }
                    OutlinedTextField(
                        value = artistName
                                onValueChange ={ artistName = it },
                        label = { Text("Artist Name") },
                        placeholder = { Text("Artist Name") }
                    )
                    var rating by remember {mutableStateOf("")}
                    OutlinedTextField(
                        value=rating,
                        onValueChange = {rating = it },
                        label = {Text("Rating (1-5)")},
                    )
                    var comments by remember { mutableStateOf("") }
                    OutlinedTextField(
                        Value = comments,
                        onValueChange = { comments = it },
                        label = { Text("Comments") },
                        placeholder = { Text("Comments") }
                    )
                    Row() {
                        Button(
                            onClick = {
                                val intent = Intent(this@MyPlaylist, MainActivity::class.java)
                                startActivity(intent)
                            }
                        ) {
                            Text("Home")
                        }
                    }


                }
            }
        }
    }
}
