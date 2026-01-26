package com.example.trends_ai_android.front_end.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

import com.example.trends_ai_android.R
import com.example.trends_ai_android.front_end.components.SocialButton
import com.example.trends_ai_android.front_end.utils.openSocial

@Composable
fun RecommendationsScreen() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Рекомендації",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Для початку\nОберіть платформу",
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(40.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            SocialButton(R.drawable.ic_instagram) {
                openSocial(context, "https://www.instagram.com/explore/reels/")
            }
            SocialButton(R.drawable.ic_tiktok) {
                openSocial(context, "https://www.tiktok.com/foryou")
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            SocialButton(R.drawable.ic_youtube) {
                openSocial(context, "https://www.youtube.com/shorts")
            }
            SocialButton(R.drawable.ic_threads) {
                openSocial(context, "https://www.threads.net")
            }
        }
    }
}


