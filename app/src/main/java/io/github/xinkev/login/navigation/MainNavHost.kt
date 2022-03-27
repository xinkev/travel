package io.github.xinkev.login.navigation

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.github.xinkev.login.ui.screens.onboarding.OnBoardingScreen

@Composable
fun MainNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "/welcome") {
        composable(route = "/welcome") {
            OnBoardingScreen(
                goToSignUp = { navController.navigate("/signup") }
            )
        }
        composable("/signup") {
            Text(text = "Signup")
        }
    }
}