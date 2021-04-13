package org.antailyaqwer.recipebookv2.domain.enteties

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Recipe(
    @PrimaryKey val uuid: UUID,
    val name: String,
    val images: List<String>,
    var date: Date,
    val description: String,
    val instructions: String,
    val difficulty: Int
)