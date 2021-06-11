package com.leveloper.repository.di

import com.leveloper.model.repository.GithubRepository
import com.leveloper.model.repository.SampleRepository
import com.leveloper.repository.internal.impl.GithubRepositoryImpl
import com.leveloper.repository.internal.impl.SampleRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object RepositoryModule {

    @Singleton
    @Provides
    fun provideGithubRepository(repository: GithubRepositoryImpl): GithubRepository {
        return repository
    }

    @Singleton
    @Provides
    fun providesSampleRepository(repository: SampleRepositoryImpl): SampleRepository {
        return repository
    }
}