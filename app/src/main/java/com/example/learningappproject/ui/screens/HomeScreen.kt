package com.example.learningappproject.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(bottom = 10.dp, start = 15.dp, end = 15.dp, top = 10.dp)) {
        Column {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "",
                    modifier = Modifier
                        .size(60.dp)
                        .padding(end = 5.dp),

                )
                Text(text = "Hello, Name", fontSize = 20.sp, modifier = Modifier.weight(1 / 3f))
                Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
            }
            Text(text = "Курс", fontSize = 36.sp)
            LazyRow {
                items(1){
                    CourseTitle("Math", "238 Hours", "4.7")
                }
            }
        }

        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {
            NavBar()
        }
    }
}

@Composable
fun CourseTitle(title: String, hours: String, rating: String) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(200.dp)

    ) {
        Box(Modifier.padding(10.dp)) {
            Column(Modifier.fillMaxSize()) {
                Text(text = title, fontSize = 28.sp)
                Row(
                    verticalAlignment = Alignment.Bottom,
                    modifier = Modifier.fillMaxSize()
                ) {
                    DesignCard(text = hours)
                    DesignCard(text = rating)
                }
            }
        }
    }
}

@Composable
fun DesignCard(text: String) {
    Card(
        colors = CardDefaults.cardColors(Color(0xff292b2d)),
        modifier = Modifier.padding(end = 4.dp),
        shape = RoundedCornerShape(50.dp)
    ) {
        Text(
            text = text,
            color = Color.White,
            modifier = Modifier.padding(start = 8.dp, end = 8.dp),
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    HomeScreen()
}