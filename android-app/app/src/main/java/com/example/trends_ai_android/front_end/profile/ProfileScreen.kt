package com.example.trends_ai_android.front_end.profile // Перевірте, щоб шлях був такий як у папках

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    // Додаємо Modifier.padding(top = 32.dp), щоб текст не "злипався" з верхнім краєм екрана
    Column(Modifier.padding(16.dp)) {
        Text("Profile", fontSize = 24.sp, fontWeight = FontWeight.Bold)

        Spacer(Modifier.height(12.dp))

        Text("Mode: Incognito")
        Spacer(Modifier.height(8.dp)) // Невеликий відступ для краси

        Text("Search history:", fontWeight = FontWeight.SemiBold)
        Text("- fashion")
        Text("- coffee shop")
        Text("- online business")
    }
}




