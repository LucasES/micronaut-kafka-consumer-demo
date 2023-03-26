package com.lucases.adapter.messaging.consumer

import com.lucases.Hero
import com.lucases.application.port.output.HeroRepository
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.Topic
import jakarta.inject.Singleton
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.*

@Singleton
@KafkaListener
class HeroConsumer (private val heroRepository: HeroRepository) {
    private val LOGGER: Logger = LoggerFactory.getLogger(HeroConsumer::class.java.name)

    @Topic("hero-topic")
    fun receive(@KafkaKey id: UUID, hero: Hero) {
        LOGGER.info("Received ID: $id")
        LOGGER.info("Received message: $hero")

        heroRepository.save(com.lucases.domain.Hero(
            hero.name.toString(),
            hero.power
        ))
    }
}