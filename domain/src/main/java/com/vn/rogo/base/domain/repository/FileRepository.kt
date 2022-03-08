package com.vn.rogo.base.domain.repository

import com.vn.rogo.base.domain.model.FileModel
import com.vn.rogo.base.domain.model.Folder

interface FileRepository {
    suspend fun getFile(): List<FileModel>

    suspend fun getFileById(id: Long): FileModel?

    suspend fun getFileByType(type: Int): List<FileModel>

    suspend fun updateFile(fileModel: FileModel)

    suspend fun addFile(fileModel: FileModel)

    suspend fun removeFile(fileModel: FileModel)

    suspend fun clearFile()

    suspend fun getFolder(): List<Folder>

    suspend fun addAllFile(files: List<FileModel>)

    suspend fun addAllFolder(folders: List<Folder>)

}