package com.josecernu.koinseed.mvvm.data.api

import com.josecernu.koinseed.mvvm.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>

}