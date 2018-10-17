package com.zoe.basisKotlinApplicatie.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.TypeAlias

@TypeAlias("player")
data class Player(@Id val handle: String,
                  val totalScore: Int = 0,
                  val history: List<ScoreEvent> = listOf()) {
    operator fun plus(score: Int) = Player(handle, totalScore + score, history + ScoreEvent(score))
}

