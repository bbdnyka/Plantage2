package app.src.main.java.entities

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [PlantProfileCards::class], version = 1)
abstract class DataBaseEnt: RoomDatabase() {
    abstract val plantProfileCardsDao: PlantProfileCardsDao
}
