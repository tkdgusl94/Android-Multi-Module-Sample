package com.leveloper.db.intenal.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.leveloper.db.entity.SampleEntity
import kotlinx.coroutines.flow.Flow

@Dao
internal interface SampleDao {

    @Insert
    suspend fun insert(obj: SampleEntity): Long

    @Query("SELECT * FROM sample")
    fun getAllSamples(): Flow<List<SampleEntity>>
}