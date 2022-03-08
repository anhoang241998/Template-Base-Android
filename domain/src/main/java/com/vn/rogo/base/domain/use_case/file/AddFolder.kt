package com.vn.rogo.base.domain.use_case.file

import com.vn.rogo.base.domain.model.Folder
import com.vn.rogo.base.domain.repository.FileRepository

class AddFolder(
    private val fileRepository: FileRepository
) {

    suspend operator fun invoke(folders: List<Folder>) = fileRepository.addAllFolder(folders)

}