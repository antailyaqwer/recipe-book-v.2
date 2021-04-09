package org.antailyaqwer.recipebookv2.presentation.network

import com.google.gson.annotations.SerializedName
import org.antailyaqwer.recipebookv2.data.enteties.Recipe

data class RecipeResponse(@SerializedName("recipes") var recipes: List<Recipe>)