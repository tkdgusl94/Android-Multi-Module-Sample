package com.leveloper.repository.internal.impl

import com.leveloper.db.LocalDataSource
import com.leveloper.model.data.Sample
import com.leveloper.model.repository.SampleRepository
import com.leveloper.repository.internal.mapper.toEntity
import com.leveloper.repository.internal.mapper.toModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

internal class SampleRepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource
) : SampleRepository {

    override suspend fun insertSample(sample: Sample) {
        localDataSource.insertSample(sample.toEntity())
    }

    override suspend fun getAllSamples(): Flow<List<Sample>> {
        println("sampleRepository getAllSamples")
        return localDataSource.getAllSamples().map { list ->
            list.map { it.toModel() }
        }
    }
}