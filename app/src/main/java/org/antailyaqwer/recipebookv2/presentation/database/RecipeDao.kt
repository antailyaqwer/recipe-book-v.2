package org.antailyaqwer.recipebookv2.presentation.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import org.antailyaqwer.recipebookv2.data.enteties.Recipe
import java.util.*

@Dao
interface RecipeDao {

    @Query("SELECT * FROM recipe WHERE uuid=:uuid")
    fun getRecipe(uuid: UUID): Flow<Recipe?>

    @Query("SELECT * FROM recipe ORDER BY name ASC")
    fun getAllRecipesOrderedByNameAscending(): Flow<List<Recipe>>

    @Query("SELECT * FROM recipe ORDER BY name DESC")
    fun getAllRecipesOrderedByNameDescending(): Flow<List<Recipe>>

    @Query("SELECT * FROM recipe ORDER BY date ASC")
    fun getAllRecipesOrderedByDateAscending(): Flow<List<Recipe>>

    @Query("SELECT * FROM recipe ORDER BY date DESC")
    fun getAllRecipesOrderedByDateDescending(): Flow<List<Recipe>>

    @Update
    fun updateRecipe(recipe: Recipe)

    @Insert
    fun insertRecipe(recipe: Recipe)

    @Query("SELECT * FROM recipe WHERE name LIKE :query OR description LIKE :query OR instructions LIKE :query")
    fun searchByNameOrDescriptionOrInstructions(query: String): Flow<List<Recipe>>
}
