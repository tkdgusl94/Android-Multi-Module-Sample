package com.leveloper.model.repository

import com.leveloper.model.data.Sample

interface SampleRepository {
    fun getSample(): Sample
}