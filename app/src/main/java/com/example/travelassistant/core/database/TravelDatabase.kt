package com.example.travelassistant.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.travelassistant.core.database.DatabaseConst.DATABASE_VERSION
import com.example.travelassistant.core.database.dao.PortDao
import com.example.travelassistant.core.database.dao.CityDao
import com.example.travelassistant.core.database.dao.PersonalItemDao
import com.example.travelassistant.core.domain.entity.Port
import com.example.travelassistant.core.domain.entity.City
import com.example.travelassistant.core.domain.entity.PersonalItem

/**
 * Travel database - объявление базы данных
 *
 * @author Marianne Sabanchieva
 */

@Database(
    entities = [City::class, Port::class, PersonalItem::class],
    version = DATABASE_VERSION,
    exportSchema = false
)
abstract class TravelDatabase : RoomDatabase() {
    abstract fun city(): CityDao
    abstract fun port(): PortDao
    abstract fun item(): PersonalItemDao
}