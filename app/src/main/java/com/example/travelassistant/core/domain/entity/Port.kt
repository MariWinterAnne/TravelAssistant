package com.example.travelassistant.core.domain.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.travelassistant.core.Constants.EMPTY_STRING

/**
 * Port - сущность базы данных
 *
 * @property id - идентификатор аэропорта
 * @property name - наименование аэропорта
 * @property address - адрес
 * @property phone - телефон
 * @property URL - ссылка на сайт
 * @property subway - ближайшая станция метро
 * @property location - текстовый идентификатор города
 * @property slug - тип порта (аэропорт, ж/д станция)
 *
 * @author Marianne Sabanchieva
 */

@Entity(tableName = Port.Schema.TABLE_NAME)
data class Port(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Schema.ID) val id: Long = 0,
    @ColumnInfo(name = Schema.NAME) val name: String = EMPTY_STRING,
    @ColumnInfo(name = Schema.ADDRESS) val address: String? = EMPTY_STRING,
    @ColumnInfo(name = Schema.PHONE) val phone: String? = EMPTY_STRING,
    @ColumnInfo(name = Schema.URL) val URL: String? = EMPTY_STRING,
    @ColumnInfo(name = Schema.SUBWAY) val subway: String? = EMPTY_STRING,
    @ColumnInfo(name = Schema.LOCATION) val location: Long? = 0,
    @ColumnInfo(name = Schema.SLUG) val slug: String? = EMPTY_STRING
) {
    object Schema {
        const val TABLE_NAME = "airportsrailway"
        const val ID = "id"
        const val NAME = "name"
        const val ADDRESS = "address"
        const val PHONE = "phone"
        const val URL = "site_url"
        const val SUBWAY = "subway"
        const val LOCATION = "location"
        const val SLUG = "slug"
    }
}