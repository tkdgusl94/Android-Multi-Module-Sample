package com.leveloper.multimodule.di

import com.leveloper.model.repository.GithubRepository
import com.leveloper.repository.impl.GithubRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideGithubRepository(repository: GithubRepositoryImpl): GithubRepository {
        return repository
    }
}