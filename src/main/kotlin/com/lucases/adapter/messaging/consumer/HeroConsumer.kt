package com.lucases.adapter.messaging.consumer

import com.lucases.Hero
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.Topic
import io.micronaut.messaging.annotation.MessageBody
import jakarta.inject.Singleton
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.*

@Singleton
@KafkaListener
class HeroConsumer {
    private val LOGGER: Logger = LoggerFactory.getLogger(HeroConsumer::class.java.name)

    @Topic("hero-topic")
    fun receive(@KafkaKey id: UUID, hero: Hero) {
        LOGGER.info("Received ID: $id")
        LOGGER.info("Received message: $hero")
    }
}