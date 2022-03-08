package com.vn.rogo.data.di

import com.vn.rogo.base.domain.repository.FileRepository
import com.vn.rogo.base.domain.use_case.file.*
import com.vn.rogo.data.data_source.cache.FileDao
import com.vn.rogo.data.data_source.mappers.FileEntityMapper
import com.vn.rogo.data.data_source.mappers.FolderEntityMapper
import com.vn.rogo.data.repository.FileRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideFileMapper(): FileEntityMapper = FileEntityMapper()

    @Provides
    @Singleton
    fun provideFolderMapper(): FolderEntityMapper = FolderEntityMapper()

    @Provides
    @Singleton
    fun provideRepository(
        fileDao: FileDao,
        fileEntityMapper: FileEntityMapper,
        folderEntityMapper: FolderEntityMapper,
    ): FileRepository = FileRepositoryImpl(
        fileDao,
        fileEntityMapper,
        folderEntityMapper
    )

    @Provides
    @Singleton
    fun provideUseCases(fileRepository: FileRepository): FileUseCases = FileUseCases(
        addFile = AddFile(fileRepository),
        updateFile = UpdateFile(fileRepository),
        removeFile = RemoveFile(fileRepository),
        getFileById = GetFileById(fileRepository),
        getFileByType = GetFileByType(fileRepository),
        clearData = ClearData(fileRepository),
        addFolder = AddFolder(fileRepository)
    )

}