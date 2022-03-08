package com.vn.rogo.base.domain.mappers

interface DomainMapper<E, M> {
    fun toDomain(entity: E): M
    fun fromDomain(model: M): E
}