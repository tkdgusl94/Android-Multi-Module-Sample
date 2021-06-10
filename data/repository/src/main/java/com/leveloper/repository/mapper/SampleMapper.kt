package com.leveloper.repository.mapper

import com.leveloper.db.entity.SampleEntity
import com.leveloper.model.data.Sample

internal fun SampleEntity.toModel(): Sample {
    return Sample(
        value = this.value
    )
}

internal fun Sample.toEntity(): SampleEntity {
    return SampleEntity(
        value = this.value
    )
}