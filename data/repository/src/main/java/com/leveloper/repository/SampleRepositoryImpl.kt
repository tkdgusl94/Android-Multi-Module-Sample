package com.leveloper.repository

import com.leveloper.db.LocalDataSource
import com.leveloper.model.data.Sample
import com.leveloper.model.repository.SampleRepository
import com.leveloper.repository.mapper.SampleEntityMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

internal class SampleRepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource
) : SampleRepository {

    override suspend fun insertSample(sample: Sample) {
        val entity = SampleEntityMapper.to(sample)
        localDataSource.insertSample(entity)
    }

    override suspend fun getAllSamples(): Flow<List<Sample>> {
        return localDataSource.getAllSamples().map { list ->
            list.map { SampleEntityMapper.from(it) }
        }
    }
}