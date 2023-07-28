package app.src.main.java.entities

import androidx.room.*

@Entity
data class PlantProfileCards(
    @ColumnInfo(name = "Plant_Name") var plant_name: String,
    @ColumnInfo(name = "Plant_Description") var plant_description: String,
    @PrimaryKey val id: Long? = null)

@Dao
interface PlantProfileCardsDao{
    @Query("select * from plantProfileCards")
    suspend fun getAll(): List<PlantProfileCards>

    @Insert
    suspend fun insert(plantProfileCards:PlantProfileCards)

    @Update
    suspend fun update(plantProfileCards: PlantProfileCards)

    @Delete
    suspend fun delete(plantProfileCards: PlantProfileCards)
}