package com.leveloper.sample

import androidx.lifecycle.viewModelScope
import com.leveloper.model.data.Sample
import com.leveloper.model.repository.GithubRepository
import com.leveloper.model.repository.SampleRepository
import com.leveloper.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val sampleRepository: SampleRepository,
    private val githubRepository: GithubRepository
) : BaseViewModel() {

    init {
        viewModelScope.launch {
//            githubRepository.getRepos("tkdgusl94").collect {
//
//            }

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