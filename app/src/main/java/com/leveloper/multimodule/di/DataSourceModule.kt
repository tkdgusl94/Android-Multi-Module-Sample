package com.leveloper.multimodule.di

import com.leveloper.api.ApiDataSourceImpl
import com.leveloper.api.ApiDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Singleton
    @Provides
    fun provideApiDataSource(source: ApiDataSourceImpl): ApiDataSource {
        return source
    }
}