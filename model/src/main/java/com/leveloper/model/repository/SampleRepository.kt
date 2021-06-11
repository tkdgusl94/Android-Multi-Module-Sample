package com.leveloper.model.repository

import com.leveloper.model.data.Sample
import kotlinx.coroutines.flow.Flow

interface SampleRepository {
    suspend fun insertSample(sample: Sample)
    suspend fun getAllSamples(): Flow<List<Sample>>
}