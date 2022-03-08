package com.vn.rogo.base.domain.use_case.file

import com.vn.rogo.base.domain.repository.FileRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext

class GetFileByType(
    private val fileRepository: FileRepository
) {

//    operator fun invoke(type: Int): Flow<DataState<DataLocal>> = flow {
//        emit(DataState.Loading())
//        val files =
//            fileRepository.getFileByType(type)
//        val folders = fileRepository.getFolder()
//
//        val dataLocal = DataLocal(
//            file = files.toMutableList(),
//            folder = folders.toMutableList(),
//            listDate = mutableListOf()
//        )
//
//        emit(DataState.Success(dataLocal))
//    }


    private suspend fun syncData(
        type: Int
    ) = withContext(Dispatchers.IO) {
        val promise = async {
            val files =
                fileRepository.getFileByType(type)
            if (!files.isNullOrEmpty()) {
                files.forEach { file ->
//                    val listFile = fileCacheDataSource.getFileByIdTransfer(transfer.idTransfer)
//                    if (!listFile.isNullOrEmpty()) {
//                        listFile.forEach {
//                            fileCacheDataSource.removeFile(it)
//                        }
//                    }
//                    transferFileCacheDataSource.removeTransferFile(transfer)
                }
            }
        }
        promise.await()
    }

}