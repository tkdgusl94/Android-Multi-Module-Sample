package com.leveloper.db

import com.leveloper.db.entity.SampleEntity
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {
    suspend fun insertSample(sampleEntity: SampleEntity)
    suspend fun getAllSamples(): Flow<List<SampleEntity>>
}