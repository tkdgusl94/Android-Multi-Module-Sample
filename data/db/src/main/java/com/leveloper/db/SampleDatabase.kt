package com.leveloper.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.leveloper.db.dao.SampleDao
import com.leveloper.db.entity.SampleEntity

@Database(
    entities = [SampleEntity::class],
    version = 1,
    exportSchema = false
)
abstract class SampleDatabase : RoomDatabase() {
    abstract fun sampleDao(): SampleDao
}