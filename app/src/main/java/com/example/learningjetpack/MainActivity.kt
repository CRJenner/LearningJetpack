package com.example.learningjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.example.learningjetpack.ui.theme.LearningJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningJetpackTheme {
                ImagePicker()
            }
        }
    }
}