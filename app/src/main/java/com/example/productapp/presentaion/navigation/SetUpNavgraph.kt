package com.example.productapp.presentaion.navigation

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun setUpNavGraph(navHostController: NavHostController){

    NavHost(navController = navHostController, startDestination = Screen.Login.destination){
        composable(route = Screen.Login.destination){
          //LoginScreen(navHostController)
        }

        composable(route = Screen.ProductList.destination){
            Text(text = "welcome to product list", fontSize = 40.sp)
        }
    }
}

sealed class Screen(val destination: String){
    object Login: Screen("login_dest")
    object ProductList: Screen("product_dest")

}

