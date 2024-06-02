package com.example.learningappproject.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.autofill.AutofillType
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SignupScreen() {
    Box(modifier = Modifier
        .padding(20.dp)
        .fillMaxSize(),
        ) {
        Column {
            Column(Modifier.padding(bottom = 20.dp)) {
                Text(text = "Регистрация", fontSize = 50.sp)
                Text(text = "Для начала обучения и сохранения результатов необходимо зарегестрироваться")
            }
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = "Имя",
                    onValueChange = {},
                    shape = RoundedCornerShape(50.dp),
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.padding(top = 10.dp))
                OutlinedTextField(
                    value = "Почта",
                    onValueChange = {},
                    shape = RoundedCornerShape(50.dp),
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.padding(top = 10.dp))
                OutlinedTextField(
                    value = "Пароль",
                    onValueChange = {},
                    shape = RoundedCornerShape(50.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.padding(top = 5.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        Color(0xff292b2d)
                    )
                ) {
                    Text(text = "Продолжить")

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    SignupScreen()
}