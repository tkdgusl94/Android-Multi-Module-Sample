package com.leveloper.multimodule.di

import com.leveloper.model.repository.SampleRepository
import com.leveloper.repository.impl.SampleRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideSampleRepository(repository: SampleRepositoryImpl): SampleRepository {
        return repository
    }
}