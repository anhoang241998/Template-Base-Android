package com.rogo.base.domain.use_case.file

import com.rogo.base.domain.repository.FileRepository

data class ClearData(
    private val fileRepository: FileRepository
) {
    suspend operator fun invoke() = fileRepository.clearFile()

}