package com.zoe.basisKotlinApplicatie.service

import com.zoe.basisKotlinApplicatie.model.Player
import com.zoe.basisKotlinApplicatie.repository.PlayerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service("playerService")
class PlayerService : IPlayerService {
    @Autowired
    // Lateinit allows the var to be unassigned. But to use the var it does need to be initialized later on.
    lateinit var playerRepository: PlayerRepository

    override fun leaders(): List<Player> =
            playerRepository.findTop3ByOrderByTotalScoreDesc()

    override fun score(handle: String, points: Int) : Int {
        val player = playerRepository
                .findById(handle).orElse(Player(handle))
                .plus(points)

        playerRepository.save(player)
        return player.totalScore
    }
}