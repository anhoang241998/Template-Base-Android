package com.rogo.base.domain.use_case.file

import com.rogo.base.domain.model.FileModel
import com.rogo.base.domain.repository.FileRepository

class RemoveFile(
    private val fileRepository: FileRepository
) {

    suspend operator fun invoke(fileModel: FileModel) = fileRepository.removeFile(fileModel)
}