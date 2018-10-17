package com.zoe.basisKotlinApplicatie.service

import com.zoe.basisKotlinApplicatie.model.Player

interface IPlayerService {
    fun leaders() : List<Player>
    fun score(handle: String, points: Int) : Int
}