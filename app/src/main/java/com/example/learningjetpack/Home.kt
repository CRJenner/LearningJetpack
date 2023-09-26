package com.example.learningjetpack

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun Home(navController: NavController)
{
    Column(modifier = Modifier) {
        Text(text = "Welcome, take a picture and scan your ID")
        Button(onClick = {
            navController.navigate(route = Screen.ImagePicker.route)
        }) {
            Text("Gallery/camera")

        }
        Button(onClick = {
            navController.navigate(route = Screen.SelfieCamera.route)
        }) {
            Text("go to Selfie")

        }
    }
}