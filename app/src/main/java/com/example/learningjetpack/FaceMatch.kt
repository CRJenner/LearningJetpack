package com.example.learningjetpack

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun FaceMatch(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 24.dp)
        .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(
            text = "Who are you?",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))

        ImagePicker(navController)
        IDCamera(navController)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate(Screen.Verification.route)
        }) {
            Text(text = "Verify")
        }
    }
}