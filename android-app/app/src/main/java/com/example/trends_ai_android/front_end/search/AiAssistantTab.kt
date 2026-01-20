package com.example.trends_ai_android.front_end.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AiAssistantTab(query: String) {
    Column(Modifier.padding(16.dp)) {
        // Заголовок з роботом
        Text(
            text = "🤖 TrendBot",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(12.dp))

        // Основні поради бота
        Text("Best format: Video")
        Text("Description length: 50–70 words")
        Text("Hashtags: #trend #ai #content")
        Text("Best time to post: 18:00–21:00")

        Spacer(Modifier.height(16.dp))

        // Підказка, на основі чого згенеровано результат
        Text(
            text = "Based on query: \"$query\"",
            color = Color.Gray,
            fontSize = 14.sp
        )
    }
}

