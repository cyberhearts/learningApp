package com.example.learningappproject.ui.data

import kotlinx.coroutines.flow.Flow

interface UserRepository {
    /**
     * Retrieve an User from the given data source that matches with the [id].
     */
    fun getUserStream(id: Int): Flow<User?>

    /**
     * Insert User in the data source
     */
    suspend fun insertUser(user: User)

    /**
     * Delete User from the data source
     */
    suspend fun deleteUser(user: User)

    /**
     * Update User in the data source
     */
    suspend fun updateUser(user: User)
}