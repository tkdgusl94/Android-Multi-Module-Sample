package com.leveloper.db.intenal

import com.leveloper.db.LocalDataSource
import com.leveloper.db.entity.SampleEntity
import com.leveloper.db.intenal.dao.SampleDao
import javax.inject.Inject

internal class LocalDataSourceImpl @Inject constructor(
    private val sampleDao: SampleDao
) : LocalDataSource {

    override suspend fun insertSample(sampleEntity: SampleEntity) {
        sampleDao.insert(sampleEntity)
    }

    override suspend fun getAllSamples() = sampleDao.getAllSamples()
}