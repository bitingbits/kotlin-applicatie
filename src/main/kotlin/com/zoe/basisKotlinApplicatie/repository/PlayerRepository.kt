package com.zoe.basisKotlinApplicatie.repository

import com.zoe.basisKotlinApplicatie.model.Player
import org.springframework.data.repository.CrudRepository

interface PlayerRepository : CrudRepository<Player, String> {
    fun findTop3ByOrderByTotalScoreDesc() : List<Player>
}