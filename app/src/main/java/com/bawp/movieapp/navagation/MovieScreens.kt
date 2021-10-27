package com.bawp.movieapp.navagation

import java.lang.IllegalArgumentException

//www.google.com/sign_in
enum class MovieScreens {
    HomeScreen,
    DetailsScreen;
    companion object {
         fun fromRoute(route: String?): MovieScreens
          = when (route?.substringBefore("/")) {
               HomeScreen.name -> HomeScreen
               DetailsScreen.name -> DetailsScreen
             null -> HomeScreen
             else -> throw IllegalArgumentException("Route $route is not recognized")
          }
    }
}