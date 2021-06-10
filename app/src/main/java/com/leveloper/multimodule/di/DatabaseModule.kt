package com.leveloper.multimodule.di

import android.content.Context
import androidx.room.Room
import com.leveloper.db.SampleDatabase
import com.leveloper.db.dao.SampleDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    private const val DB_NAME = "sample.db"

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ): SampleDatabase {
        return Room.databaseBuilder(context, SampleDatabase::class.java, DB_NAME).build()
    }

    @Singleton
    @Provides
    fun provideTestDao(database: SampleDatabase): SampleDao {
        return database.sampleDao()
    }
}