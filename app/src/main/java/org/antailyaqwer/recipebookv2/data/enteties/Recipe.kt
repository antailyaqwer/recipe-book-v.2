package org.antailyaqwer.recipebookv2.data.enteties

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Recipe(
    @PrimaryKey private val uuid: UUID,
    private val name: String,
    private val images: List<String>,
    private var date: Date,
    private val description: String,
    private val instructions: String,
    private val difficulty: Int
)