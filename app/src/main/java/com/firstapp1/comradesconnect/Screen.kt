package com.firstapp1.comrades_connect

sealed class Screen( val route:String){
    object Splash:Screen(route = "home_screen")
    object GetStarted:Screen(route = "get_started_screen")
    object Option:Screen(route = "options_screen")
    object Signup:Screen(route = "signup_screen")
    object Signuptwo:Screen(route = "signup2_screen")
}
