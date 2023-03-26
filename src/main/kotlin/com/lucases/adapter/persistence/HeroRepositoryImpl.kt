package com.lucases.adapter.persistence

import com.lucases.adapter.persistence.model.HeroEntity
import com.lucases.application.port.output.HeroRepository
import com.lucases.domain.Hero
import jakarta.inject.Singleton
import com.lucases.adapter.persistence.repository.HeroRepository as DBHeroRepository

@Singleton
class HeroRepositoryImpl(private val heroRepository: DBHeroRepository) : HeroRepository {
    override fun save(hero: Hero) {
        heroRepository.save(HeroEntity.fromDomain(hero))
    }

}