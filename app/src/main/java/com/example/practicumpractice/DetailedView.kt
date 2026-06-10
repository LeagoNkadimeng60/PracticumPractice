package com.example.practicumpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.practicumpractice.ui.theme.PracticumPracticeTheme

class DetailedView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticumPracticeTheme {
                


                }
            }
        }
    }
