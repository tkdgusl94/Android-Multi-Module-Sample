package com.leveloper.repository.mapper

import com.leveloper.db.entity.SampleEntity
import com.leveloper.model.data.Sample

internal object SampleEntityMapper : Mapper<SampleEntity, Sample>() {
    override fun from(from: SampleEntity): Sample {
        return Sample(
            value = from.name
        )
    }

    override fun to(to: Sample): SampleEntity {
        return SampleEntity(
            name = to.value
        )
    }
}