package com.example.afasiaproject

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.afasiaproject.navegation.AppNavegation
import com.example.afasiaproject.ui.ElevatedWordPhrase
import com.example.afasiaproject.ui.HorizontalDivider
import com.example.afasiaproject.ui.theme.AfasiaProjectTheme

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
    Column {
        TopAppBar(
            modifier = Modifier.padding(horizontal = 32.dp),
            title = {
                Text(
                    text = "Afasia Project"
                )
            }
        )
        HorizontalDivider()

        ActualPhrase()

        HorizontalDivider()
    }
}

@Composable
fun ActualPhrase(
    modifier: Modifier = Modifier
) {
    Text(
        text = "Actual phrase",
        modifier = modifier.padding(vertical = 16.dp, horizontal = 32.dp)
    )
    ElevatedWordPhrase("word")
}

@Preview(showBackground = true)
@Composable
fun AfasiaAppPreview() {
    AfasiaProjectTheme {
        AfasiaApp()
    }
}
