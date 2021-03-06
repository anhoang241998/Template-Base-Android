package com.vn.rogo.data.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.vn.rogo.data.data_source.cache.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {
    @Volatile
    private var INSTANCE: AppDatabase? = null

    @Provides
    fun provideDatabase(application: Application): AppDatabase {
        return INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                application,
                AppDatabase::class.java,
                AppDatabase.DB_NAME
            )
                .fallbackToDestructiveMigration()
                .enableMultiInstanceInvalidation()
                .setJournalMode(RoomDatabase.JournalMode.AUTOMATIC)
                .build()

            INSTANCE = instance
            instance
        }
    }

    @Provides
    @Singleton
    fun provideFileDao(appDatabase: AppDatabase) = appDatabase.fileDao

}