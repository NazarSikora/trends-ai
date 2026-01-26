package com.example.trends_ai_android.front_end.utils

import android.content.Context
import android.content.Intent
import android.net.Uri

fun openSocial(context: Context, url: String) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    context.startActivity(intent)
}

