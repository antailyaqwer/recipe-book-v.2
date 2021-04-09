package org.antailyaqwer.recipebookv2.presentation.network

import org.antailyaqwer.recipebookv2.data.enteties.Recipe
import retrofit2.Call
import retrofit2.http.GET

interface ParserApi {

    @GET("/recipes")
    suspend fun getRecipes(): Call<Recipe>
}