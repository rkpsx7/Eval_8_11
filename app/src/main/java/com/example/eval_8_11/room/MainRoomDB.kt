package com.example.eval_8_11.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [ArticleEntity::class], version = 1)
@TypeConverters(RoomTypeConvertors::class)
abstract class MainRoomDB : RoomDatabase() {

    abstract fun getDao(): Dao

    companion object {
        private var Instance: MainRoomDB? = null
    }

    fun getMainRoomDb(context: Context): MainRoomDB {
        return if (Instance == null) {
            val builder = Room.databaseBuilder(
                context.applicationContext,
                MainRoomDB::class.java,
                "NewsDataBase"
            )

            builder.fallbackToDestructiveMigration()
            Instance = builder.build()
            Instance!!
        } else Instance!!
    }

}