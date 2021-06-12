package com.leveloper.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.leveloper.db.entity.SampleEntity
import com.leveloper.db.dao.SampleDao

@Database(
    entities = [SampleEntity::class],
    version = 1,
    exportSchema = false
)
internal abstract class SampleDatabase : RoomDatabase() {
    abstract fun sampleDao(): SampleDao
}