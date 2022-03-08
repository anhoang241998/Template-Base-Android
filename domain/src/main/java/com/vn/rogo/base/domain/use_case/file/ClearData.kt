package com.vn.rogo.base.domain.use_case.file

import com.vn.rogo.base.domain.repository.FileRepository

data class ClearData(
    private val fileRepository: FileRepository
) {
    suspend operator fun invoke() = fileRepository.clearFile()

}