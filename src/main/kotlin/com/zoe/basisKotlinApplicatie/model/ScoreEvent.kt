package com.zoe.basisKotlinApplicatie.model

import java.text.SimpleDateFormat
import java.util.Date


data class ScoreEvent(val time: String,
                      val points: Int) {
    constructor(points: Int) : this(dateFormat.format(Date()), points)

    companion object {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    }
}