package com.lucases.adapter.persistence.model

import com.lucases.domain.Hero
import javax.persistence.*

@Entity
@Table(name = "hero")
data class HeroEntity(

    @Id
    @GeneratedValue
    val id: Long = 0,

    @Column(name = "name")
    val name: String = "",

    @Column(name = "power")
    val power: Double = 0.0
) {
    companion object {
        fun fromDomain(hero: Hero) = HeroEntity(
            name = hero.name,
            power = hero.power
        )
    }
}