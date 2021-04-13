package org.antailyaqwer.recipebookv2.data.repositories.impl

import android.content.Context
import androidx.room.Room
import org.antailyaqwer.recipebookv2.data.database.RecipeDatabase
import org.antailyaqwer.recipebookv2.data.repositories.DatabaseRepository

private const val DATABASE_NAME = "recipe-database"
class DatabaseRepositoryImpl(context:Context) : DatabaseRepository{

    private val database:RecipeDatabase = Room.databaseBuilder(
        context.applicationContext,
        RecipeDatabase::class.java,
        DATABASE_NAME
    ).build()
    private val recipeDao = database.recipeDao()
}