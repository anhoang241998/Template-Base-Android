package com.rogo.base.domain.use_case.file

import com.rogo.base.domain.model.FileModel
import com.rogo.base.domain.repository.FileRepository

class AddFile(
    private val fileRepository: FileRepository
) {

    suspend operator fun invoke(fileModel: FileModel) = fileRepository.addFile(fileModel)

    suspend operator fun invoke(files: List<FileModel>) = fileRepository.addAllFile(files)

}