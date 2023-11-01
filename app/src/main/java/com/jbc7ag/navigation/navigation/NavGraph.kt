package com.jbc7ag.navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jbc7ag.navigation.screens.detail.DetailScreen
import com.jbc7ag.navigation.screens.home.HomeScreen
import com.jbc7ag.navigation.screens.login.LoginScreen


@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.Login.route)
    {
/*      TODO add all screens to the NavHost using `composable`  */

    }
}