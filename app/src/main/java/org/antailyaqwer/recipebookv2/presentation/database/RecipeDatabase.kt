package org.antailyaqwer.recipebookv2.presentation.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import org.antailyaqwer.recipebookv2.data.enteties.Recipe

@Database(entities = [Recipe::class], version = 1, exportSchema = false)
@TypeConverters(RecipeTypeConverter::class)
abstract class RecipeDatabase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao
}