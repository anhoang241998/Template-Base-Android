package com.vn.rogo.data.data_source.mappers

import com.vn.rogo.base.domain.mappers.DomainMapper
import com.vn.rogo.base.domain.model.Dummy
import com.vn.rogo.data.data_source.model.DummiesEntity
import javax.inject.Inject

class DummiesEntityMapper
@Inject
constructor() : DomainMapper<DummiesEntity, Dummy> {

    override fun toDomain(entity: DummiesEntity): Dummy {
        return Dummy(
            entity.id,
            entity.name,
            entity.desc
        )
    }

    override fun fromDomain(model: Dummy): DummiesEntity {
        return DummiesEntity(
            model.id,
            model.name,
            model.desc
        )
    }

    fun toDomainList(list: List<DummiesEntity>): List<Dummy> = list.map {
        toDomain(it)
    }

    fun fromDomainList(list: List<Dummy>): List<DummiesEntity> = list.map {
        fromDomain(it)
    }

}