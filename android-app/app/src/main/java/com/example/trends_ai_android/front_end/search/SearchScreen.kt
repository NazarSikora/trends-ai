package com.example.trends_ai_android.front_end.search

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.trends_ai_androi.PlatformSelector

@Composable
fun SearchScreen() {
    // Додаємо імпорти для 'by', щоб не було помилок з 'it'
    var query by remember { mutableStateOf("") }
    var tabIndex by remember { mutableStateOf(0) }

    Column(Modifier.padding(16.dp)) {

        PlatformSelector()

        Spacer(Modifier.height(8.dp))

        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            label = { Text("Enter niche or idea (2–3 words)") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(16.dp))

        // Перемикач між трендами та ШІ-помічником
        TabRow(selectedTabIndex = tabIndex) {
            Tab(selected = tabIndex == 0, onClick = { tabIndex = 0 }) {
                Text("Trending", Modifier.padding(8.dp))
            }
            Tab(selected = tabIndex == 1, onClick = { tabIndex = 1 }) {
                Text("AI Assistant", Modifier.padding(8.dp))
            }
        }

        Spacer(Modifier.height(16.dp))

        // Відображення вибраної вкладки
        when (tabIndex) {
            0 -> TrendingTab(query)
            1 -> AiAssistantTab(query)
        }
    }
}

