package com.leveloper.api.di

import com.leveloper.api.ApiDataSource
import com.leveloper.api.internal.ApiDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DataSourceModule {

    @Singleton
    @Provides
    fun provideApiDataSource(source: ApiDataSourceImpl): ApiDataSource {
        return source
    }
}