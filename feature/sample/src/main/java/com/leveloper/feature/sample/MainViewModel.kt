package com.leveloper.feature.sample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.leveloper.model.repository.GithubRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val githubRepository: GithubRepository
) : ViewModel() {

    init {
        viewModelScope.launch {
            githubRepository.getRepos("tkdgusl94").collect {
                it.forEach {
                    println(it)
                }
            }
        }
    }
}