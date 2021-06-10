package com.leveloper.feature.sample

import androidx.lifecycle.ViewModel
import com.leveloper.model.repository.SampleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val sampleRepository: SampleRepository
) : ViewModel() {

    init {
        println(sampleRepository.getSample())
    }
}