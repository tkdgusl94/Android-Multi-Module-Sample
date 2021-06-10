package com.leveloper.repository.mapper

import com.leveloper.db.SampleEntity
import com.leveloper.model.data.Sample

fun SampleEntity.toModel(): Sample {
    return Sample(
        value = this.value
    )
}

fun Sample.toEntity(): SampleEntity {
    return SampleEntity(
        value = this.value
    )
}