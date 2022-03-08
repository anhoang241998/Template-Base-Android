package com.vn.rogo.base.domain.use_case.file

import com.vn.rogo.base.domain.repository.FileRepository

class GetFileById(
    private val fileRepository: FileRepository
) {

    suspend operator fun invoke(id: Long) = fileRepository.getFileById(id)
}