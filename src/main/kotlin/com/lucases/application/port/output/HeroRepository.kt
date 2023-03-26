package com.lucases.application.port.output

import com.lucases.domain.Hero

interface HeroRepository {

    fun save(hero: Hero)
}