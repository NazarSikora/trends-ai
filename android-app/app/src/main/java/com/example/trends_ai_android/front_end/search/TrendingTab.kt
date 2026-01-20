package com.example.trends_ai_android.front_end.search
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
@Composable

fun TrendingTab(query: String) {

    LazyColumn {

        items(5) {

            Card(

                modifier = Modifier

                    .fillMaxWidth()

                    .padding(8.dp)

            ) {

                Column(Modifier.padding(16.dp)) {

                    Text("Trending content for \"$query\"")

                    Text("#trend #viral #2026", color = Color.Gray)

                }

            }

        }

    }

}

