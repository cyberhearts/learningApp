package com.example.learningappproject.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(bottom = 10.dp, start = 15.dp, end = 15.dp, top = 20.dp)
    ) {
        Column(
            Modifier.fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Профиль", fontSize = 40.sp)
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "",
                    modifier = Modifier.size(100.dp)
                )
                Row() {
                    Text(text = "никнейм", fontSize = 20.sp)
                    Icon(imageVector = Icons.Default.Edit, contentDescription = "")
                }
            }

            TextField(
                value = "info about",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                singleLine = false
            )

            Text(text = "Change password")
        }



        Box(contentAlignment = Alignment.BottomEnd, modifier = Modifier.fillMaxSize()) {
            NavBar()
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    ProfileScreen()
}