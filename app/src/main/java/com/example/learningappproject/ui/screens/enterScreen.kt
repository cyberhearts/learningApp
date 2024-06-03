package com.example.learningappproject.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun PreEnterScreen(navController : NavHostController) {
    Box(Modifier.fillMaxSize().padding(20.dp), contentAlignment = Alignment.CenterStart){
        Text(text = "Название приложения", fontSize = 50.sp)
        Box(
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 100.dp)
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    ) {
                Button(
                    onClick = { navController.navigate(SignInScreen) },
                    colors = ButtonDefaults.buttonColors(Color(0xff292b2d)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Вход")
                }
                Button(
                    onClick = { navController.navigate(SignUpScreen) },
                    colors = ButtonDefaults.buttonColors(Color.White),
                    border = BorderStroke(0.5.dp, Color(0xff292b2d)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Регистрация", color = Color(0xff292b2d))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    PreEnterScreen(navController = rememberNavController())
}