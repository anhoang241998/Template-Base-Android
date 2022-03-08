package com.rogo.base.domain.use_case.file

import com.rogo.base.domain.repository.FileRepository

class GetFileById(
    private val fileRepository: FileRepository
) {

    suspend operator fun invoke(id: Long) = fileRepository.getFileById(id)
}