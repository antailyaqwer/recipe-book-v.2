package org.antailyaqwer.recipebookv2.data.database

import androidx.room.TypeConverter
import com.google.gson.Gson
import java.util.*

class RecipeTypeConverter {

    @TypeConverter
    fun fromUUID(uuid: UUID): String = uuid.toString()

    @TypeConverter
    fun toUUID(uuid: String): UUID = UUID.fromString(uuid)

    @TypeConverter
    fun fromDate(date: Date): Long = date.time

    @TypeConverter
    fun toDate(date: Long): Date = Date(date)

    @TypeConverter
    fun fromImages(images: List<String>): String = Gson().toJson(images)

    @TypeConverter
    fun toImages(images: String): List<String> =
        Gson().fromJson(images, Array<String>::class.java).toList()
}