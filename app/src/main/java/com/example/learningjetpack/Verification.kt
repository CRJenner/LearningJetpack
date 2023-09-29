package com.example.learningjetpack

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Verification(navController: NavController){

    Button(onClick = { navController.navigate(Screen.FaceMatch.route) }) {
        Text(text = "Back")
        
    }
}