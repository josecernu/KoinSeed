package com.josecernu.koinseed.mvvm.data.repository

import com.josecernu.koinseed.mvvm.data.api.ApiHelper

class MainRepository (private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()

}