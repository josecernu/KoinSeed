package com.josecernu.koinseed.mvvm.data.api

import com.josecernu.koinseed.mvvm.data.model.User
import retrofit2.Response

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(): Response<List<User>> = apiService.getUsers()

}