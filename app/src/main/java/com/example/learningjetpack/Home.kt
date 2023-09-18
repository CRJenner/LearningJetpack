package com.example.learningjetpack

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Home(){
    Box(modifier = Modifier) {
        Text(text = "Welcome, take a pitcure and scan your ID")
        Button(onClick = {
        }) {
            Text("Select an image")

        }
    }
}