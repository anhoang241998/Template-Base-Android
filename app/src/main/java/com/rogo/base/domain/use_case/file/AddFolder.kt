package com.rogo.base.domain.use_case.file

import com.rogo.base.domain.model.Folder
import com.rogo.base.domain.repository.FileRepository

class AddFolder(
    private val fileRepository: FileRepository
) {

    suspend operator fun invoke(folders: List<Folder>) = fileRepository.addAllFolder(folders)

}