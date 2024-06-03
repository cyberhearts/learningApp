package com.example.learningappproject.ui.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val fullname: String,
    val email: String,
    val password: String,
    val photo: String, // for future use
)
