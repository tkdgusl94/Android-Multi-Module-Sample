package com.leveloper.db

import com.leveloper.db.entity.SampleEntity
import com.leveloper.db.dao.SampleDao
import javax.inject.Inject

internal class LocalDataSourceImpl @Inject constructor(
    private val sampleDao: SampleDao
) : LocalDataSource {

    override suspend fun insertSample(sample: SampleEntity) {
        sampleDao.insert(sample)
    }

    override suspend fun getAllSamples() = sampleDao.getAllSamples()
}