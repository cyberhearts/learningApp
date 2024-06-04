package com.example.learningappproject.ui.data

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.example.learningappproject.MainActivity

data class Credentials(
    val email: String = "",
    val pwd: String = "",

) {
    fun isNotEmpty(): Boolean {
        return email.isNotEmpty() && pwd.isNotEmpty()
    }

    fun checkCredentials(creds: Credentials, context: Context): Boolean {
        if (creds.isNotEmpty() && creds.email == "admin") {
            context.startActivity(Intent(context, MainActivity::class.java))
            (context as Activity).finish()
            return true
        } else {
            Toast.makeText(context, "Wrong Credentials", Toast.LENGTH_SHORT).show()
            return false
        }
    }
}
