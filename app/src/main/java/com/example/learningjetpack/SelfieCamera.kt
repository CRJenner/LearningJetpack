package com.example.learningjetpack

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SelfieCamera(navController: NavController) {
    Button(onClick = {  navController.navigate(route = Screen.Home.route) },
        border = BorderStroke(3.dp, Color.Black),
        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Black),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row{
            Icon(
                Icons.Default.ArrowBack,
                contentDescription = null,
                modifier = Modifier.size(35.dp)
            )
            Text(text = " Back", fontSize = 18.sp)
        }
    }
}