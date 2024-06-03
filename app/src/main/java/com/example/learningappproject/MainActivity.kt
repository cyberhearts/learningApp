package com.example.learningappproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learningappproject.ui.screens.EnterScreen
import com.example.learningappproject.ui.screens.PreEnterScreen
import com.example.learningappproject.ui.screens.ProfileScreen
import com.example.learningappproject.ui.screens.SignInScreen
import com.example.learningappproject.ui.screens.SignUpScreen
import com.example.learningappproject.ui.screens.SignipScreen
import com.example.learningappproject.ui.screens.SignupScreen
import com.example.learningappproject.ui.theme.LearningAppProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningAppProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = EnterScreen) {
                        composable<EnterScreen> {
                            PreEnterScreen(navController = navController)
                        }
                        composable<SignInScreen> { SignipScreen() }
                        composable<SignUpScreen> { SignupScreen() }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearningAppProjectTheme {

    }
}