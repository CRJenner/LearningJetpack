package com.example.learningjetpack

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetUpNavGraph(navController: NavHostController){
NavHost(navController = navController, startDestination = Screen.SelfieCamera.route){
    composable(
        route  = Screen.Home.route
    ){
        Home(navController = navController)
    }
    composable(
        route  = Screen.ImagePicker.route
    ){
        ImagePicker(navController = navController)
    }
    composable(
        route  = Screen.SelfieCamera.route
    ){
        CameraView(navController = navController)
    }
    composable(
        route = Screen.Verification.route
    ){
        Verification(navController = navController)
    }
        }
}
