package com.example.trends_ai_android.front_end.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable

fun AuthScreen(onSuccess: () -> Unit) {

    var email by remember { mutableStateOf("") }

    var password by remember { mutableStateOf("") }



    Column(

        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),

        verticalArrangement = Arrangement.Center

    ) {

        Text("Trends AI", fontSize = 32.sp, fontWeight = FontWeight.Bold)



        Spacer(Modifier.height(20.dp))



        OutlinedTextField(email, {
            email = it
        }, label = { Text("Email") })

        Spacer(Modifier.height(8.dp))

        OutlinedTextField(

            password,

            {
                password = it
            },

            label = { Text("Password") },

            visualTransformation = PasswordVisualTransformation()

        )



        Spacer(Modifier.height(16.dp))



        Button(onClick = onSuccess, modifier = Modifier.fillMaxWidth()) {

            Text("Register / Login")

        }



        TextButton(onClick = onSuccess) {

            Text("Continue as Incognito")

        }

    }

}


