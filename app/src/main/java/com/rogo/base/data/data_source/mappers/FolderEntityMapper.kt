package com.rogo.base.data.data_source.mappers

import com.rogo.base.data.data_source.model.FolderEntity
import com.rogo.base.domain.mappers.DomainMapper
import com.rogo.base.domain.model.Folder

class FolderEntityMapper : DomainMapper<FolderEntity, Folder> {

    fun toDomainList(list: List<FolderEntity>): List<Folder> = list.map {
        toDomain(it)
    }

    fun fromDomainList(list: List<Folder>): List<FolderEntity> = list.map {
        fromDomain(it)
    }

    override fun toDomain(entity: FolderEntity): Folder = Folder(
        idDatabase = entity.idDatabase,
        id = entity.id,
        name = entity.name,
        size = entity.size
    )

    override fun fromDomain(model: Folder): FolderEntity = FolderEntity(
        idDatabase = model.idDatabase,
        id = model.id,
        name = model.name,
        size = model.size
    )
}