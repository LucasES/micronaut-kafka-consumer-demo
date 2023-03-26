package com.lucases.adapter.persistence.model

import com.lucases.domain.Hero
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@MappedEntity("heroes")
data class HeroEntity(
    val name: String = "",

    val power: Double = 0.0
) {
    @GeneratedValue
    @Id
    var id: Long? = null

    companion object {
        fun fromDomain(hero: Hero) = HeroEntity(name = hero.name, power = hero.power)
    }
}