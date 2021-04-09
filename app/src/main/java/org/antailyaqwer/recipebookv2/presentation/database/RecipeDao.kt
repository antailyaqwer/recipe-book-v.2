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
    suspend fun getRecipe(uuid: UUID): Flow<Recipe?>

    @Query("SELECT * FROM recipe ORDER BY name ASC")
    suspend fun getAllRecipesOrderedByNameAscending(): Flow<List<Recipe>>

    @Query("SELECT * FROM recipe ORDER BY name DESC")
    suspend fun getAllRecipesOrderedByNameDescending(): Flow<List<Recipe>>

    @Query("SELECT * FROM recipe ORDER BY date ASC")
    suspend fun getAllRecipesOrderedByDateAscending(): Flow<List<Recipe>>

    @Query("SELECT * FROM recipe ORDER BY date DESC")
    suspend fun getAllRecipesOrderedByDateDescending(): Flow<List<Recipe>>

    @Update
    suspend fun updateRecipe(recipe: Recipe)

    @Insert
    suspend fun insertRecipe(recipe: Recipe)

    @Query("SELECT * FROM recipe WHERE name LIKE :query OR description LIKE :query OR instructions LIKE :query")
    suspend fun searchByNameOrDescriptionOrInstructions(query: String): Flow<List<Recipe>>
}
