package com.example.trends_ai_android.front_end.recommendations
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable

fun RecommendationsScreen() {

    LazyColumn {

        items(6) {

            Card(

                modifier = Modifier

                    .fillMaxWidth()

                    .padding(8.dp)

            ) {

                Row(

                    Modifier.padding(16.dp),

                    verticalAlignment = Alignment.CenterVertically

                ) {

                    Text("Top video #$it")

                    Spacer(Modifier.weight(1f))

                    Icon(Icons.Default.FavoriteBorder, contentDescription = null)

                }

            }

        }

    }

}

