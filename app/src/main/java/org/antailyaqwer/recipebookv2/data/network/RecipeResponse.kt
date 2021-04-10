package org.antailyaqwer.recipebookv2.data.network

import com.google.gson.annotations.SerializedName
import org.antailyaqwer.recipebookv2.domain.enteties.Recipe

data class RecipeResponse(@SerializedName("recipes") var recipes: List<Recipe>)