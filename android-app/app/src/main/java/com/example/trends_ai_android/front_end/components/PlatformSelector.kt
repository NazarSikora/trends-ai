package com.example.trends_ai_androi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
@Composable

fun PlatformSelector() {

    var selected by remember { mutableStateOf("Instagram") }

    val platforms = listOf("Instagram", "TikTok", "Threads", "YouTube")



    Row {

        platforms.forEach {

            OutlinedButton(

                onClick = { selected = it },

                modifier = Modifier.padding(end = 4.dp)

            ) {

                Text(it)

            }

        }

    }

}