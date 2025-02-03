package com.example.labandlecturehallreservationsystem

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.labandlecturehallreservationsystem.ui.screens.LoginScreen
import com.example.labandlecturehallreservationsystem.ui.screens.SplashScreen
import com.example.labandlecturehallreservationsystem.ui.screens.WelcomeScreen


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("welcome") { WelcomeScreen(navController) }
        composable("login") { LoginScreen(navController) }
        //composable("dashboard") { DashboardScreen(navController) }
    }
}
