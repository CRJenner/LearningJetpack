package com.example.learningjetpack

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetUpNavGraph(navController: NavHostController){
NavHost(navController = navController, startDestination = Screen.FaceMatch.route){
    composable(
        route  = Screen.ImagePicker.route
    ){
        ImagePicker(navController = navController)
    }
    composable(
        route  = Screen.FaceMatch.route
    ){
        FaceMatch(navController = navController)
    }
    composable(
        route = Screen.Verification.route
    ){
        Verification(navController = navController)
    }
    composable(
        route = Screen.IDCamera.route
    ){
        IDCamera(navController = navController)
    }
}
}
