package com.example.trends_ai_android.front_end.auth

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AuthScreen(onSuccess: () -> Unit) {

    var isLogin by remember { mutableStateOf(true) }

    var nickname by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var error by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Trends AI",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(16.dp))

        /* ===== Перемикач Login / Register ===== */
        Row {
            TextButton(onClick = { isLogin = true }) {
                Text(
                    "Login",
                    fontWeight = if (isLogin) FontWeight.Bold else FontWeight.Normal
                )
            }
            TextButton(onClick = { isLogin = false }) {
                Text(
                    "Register",
                    fontWeight = if (!isLogin) FontWeight.Bold else FontWeight.Normal
                )
            }
        }

        Spacer(Modifier.height(16.dp))

        /* ===== Поля для Register ===== */
        if (!isLogin) {
            OutlinedTextField(
                value = nickname,
                onValueChange = { nickname = it },
                label = { Text("Nickname") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(Modifier.height(8.dp))
        }

        /* ===== Email ===== */
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(8.dp))

        /* ===== Password ===== */
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = {
                Text(
                    if (isLogin) "Password"
                    else "Password (min 8 chars)"
                )
            },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(12.dp))

        /* ===== Помилки ===== */
        if (error.isNotEmpty()) {
            Text(error, color = Color.Red)
            Spacer(Modifier.height(8.dp))
        }

        /* ===== Кнопка ===== */
        Button(
            onClick = {
                error = when {
                    !email.contains("@") ->
                        "Email повинен містити @"

                    !isLogin && nickname.isBlank() ->
                        "Введіть нікнейм"

                    !isLogin && password.length < 8 ->
                        "Пароль мінімум 8 символів"

                    isLogin && password.isBlank() ->
                        "Введіть пароль"

                    else -> {
                        onSuccess()
                        ""
                    }
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(if (isLogin) "Login" else "Register")
        }

        Spacer(Modifier.height(8.dp))

        /* ===== Incognito ===== */
        TextButton(onClick = onSuccess) {
            Text("Continue as Incognito")
        }
    }
}
