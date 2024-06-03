package com.example.learningappproject.ui.data

import android.content.Context

interface AppContainer {
    val userRepository : UserRepository
}

class AppDataContainer(private val context: Context) : AppContainer {
    override val userRepository: UserRepository by lazy {
        OfflineUsersRepository(UserDataBase.getDatabase(context).userDao())
    }
}