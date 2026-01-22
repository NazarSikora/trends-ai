package com.example.trends_ai_android.front_end.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun MainScreen() {
    var selectedTab by remember { mutableStateOf(0) }

    val screens = listOf("Chat", "Recommendations", "Profile")

    Scaffold(
        bottomBar = {
            NavigationBar {
                screens.forEachIndexed { index, title ->
                    NavigationBarItem(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        label = { Text(title) },
                        icon = {
                            Icon(
                                when (index) {
                                    0 -> Icons.Default.Chat
                                    1 -> Icons.Default.PlayArrow
                                    else -> Icons.Default.Person
                                },
                                contentDescription = title
                            )
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        Surface(modifier = Modifier.padding(innerPadding)) {
            when (selectedTab) {
                0 -> ChatScreen()
                1 -> RecommendationsScreen()
                2 -> ProfileScreen()
            }
        }
    }
}

/* ===== ЕКРАНИ ===== */

@Composable
fun ChatScreen() {
    Text("💬 Чат з AI")
}

@Composable
fun RecommendationsScreen() {
    Text("Тут будуть рекомендації")
}

@Composable
fun ProfileScreen() {
    Text("Ваш профіль")
}
