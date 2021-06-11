package com.leveloper.db.intenal

import androidx.room.Database
import androidx.room.RoomDatabase
import com.leveloper.db.entity.SampleEntity
import com.leveloper.db.intenal.dao.SampleDao

@Database(
    entities = [SampleEntity::class],
    version = 1,
    exportSchema = false
)
internal abstract class SampleDatabase : RoomDatabase() {
    abstract fun sampleDao(): SampleDao
}