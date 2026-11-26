package com.example.afasiaproject.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
public fun HorizontalDivider() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 32.dp),
            thickness = 2.dp
        )
    }
}

@Composable
fun ElevatedWordPhrase(
    word: String

) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
    ) {
        Text(
            text = word,
            modifier = Modifier
                .padding(8.dp),
            textAlign = TextAlign.Center,
        )
    }
}