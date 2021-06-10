package com.leveloper.db.dao

import androidx.room.Dao
import androidx.room.Insert
import com.leveloper.db.entity.SampleEntity

@Dao
interface SampleDao {

    @Insert
    fun insert(obj: SampleEntity): Long
}