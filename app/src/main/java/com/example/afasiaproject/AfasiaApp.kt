package com.example.afasiaproject

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.afasiaproject.navegation.AppNavegation

@Composable
fun AfasiaApp() {
    val navController = rememberNavController()
    
    Scaffold(
        topBar = {
            AfasiaTopBar()
        }
    ) { innerPadding ->
        AppNavegation(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AfasiaTopBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Afasia Project"
            )
        }
    )
}
