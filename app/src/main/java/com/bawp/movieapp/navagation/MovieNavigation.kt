package com.bawp.movieapp.navagation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bawp.movieapp.screens.home.HomeScreen
import com.bawp.movieapp.screens.details.DetailsScreen

@Composable
fun MovieNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = MovieScreens.HomeScreen.name ) {

        composable(MovieScreens.HomeScreen.name){
            //here we pass where this should lead us to
            HomeScreen(navController = navController)
        }

        composable(MovieScreens.DetailsScreen.name) {
            DetailsScreen(navController = navController)
        }


    }

}