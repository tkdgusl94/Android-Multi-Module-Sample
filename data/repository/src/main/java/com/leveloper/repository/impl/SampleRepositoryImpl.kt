package com.leveloper.repository.impl

import com.leveloper.db.entity.SampleEntity
import com.leveloper.model.data.Sample
import com.leveloper.model.repository.SampleRepository
import com.leveloper.repository.mapper.toModel
import javax.inject.Inject

class SampleRepositoryImpl @Inject constructor() : SampleRepository {
    override fun getSample(): Sample {
        return SampleEntity(value = "sample").toModel()
    }
}