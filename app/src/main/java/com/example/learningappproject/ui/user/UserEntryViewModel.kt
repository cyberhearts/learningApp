package com.example.learningappproject.ui.user

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.learningappproject.ui.data.User
import com.example.learningappproject.ui.data.UserRepository

class UserEntryViewModel(private val userRepository: UserRepository) : ViewModel() {
    var userUiState by mutableStateOf(UserUiState())
        private set

    fun updateUiState(userDetails: UserDetails) {
        userUiState =
            UserUiState(userDetails = userDetails, isEntryValid = validateInput(userDetails))
    }

    suspend fun saveItem() {
        if (validateInput()) {
            userRepository.insertUser(userUiState.userDetails.toUser())
        }
    }

    private fun validateInput(uiState: UserDetails = userUiState.userDetails): Boolean {
        return with(uiState) {
            fullname.isNotBlank() && email.isNotBlank() && password.isNotBlank()
        }
    }
}


data class UserUiState(
    val userDetails: UserDetails = UserDetails(),
    val isEntryValid: Boolean = false
)

data class UserDetails(
    val id: Int = 0,
    val fullname: String = "",
    val email: String = "",
    val password: String = ""
)

fun UserDetails.toUser(): User = User(
    id = id,
    fullname = fullname,
    email = email,
    password = password
)

fun User.toUserUiState(isEntryValid: Boolean = false): UserUiState = UserUiState(
    userDetails = this.toUserDetails(),
    isEntryValid = isEntryValid
)

fun User.toUserDetails(): UserDetails = UserDetails(
    id = id,
    fullname = fullname,
    email = email,
    password = password
)
