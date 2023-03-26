package com.lucases.adapter.persistence.repository

import com.lucases.adapter.persistence.model.HeroEntity
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface HeroRepository : CrudRepository<HeroEntity, Long>