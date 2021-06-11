package com.leveloper.sample

import androidx.lifecycle.viewModelScope
import com.leveloper.model.data.Sample
import com.leveloper.model.repository.SampleRepository
import com.leveloper.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val sampleRepository: SampleRepository
) : BaseViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            sampleRepository.getAllSamples().collect { list ->
                showToast("list size: ${list.size}")
            }
        }
    }

    fun addSample() {
        viewModelScope.launch {
            sampleRepository.insertSample(Sample(System.currentTimeMillis()))
        }
    }
}