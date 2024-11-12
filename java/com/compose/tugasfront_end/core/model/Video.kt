package com.compose.tugasfront_end.core.model

import androidx.annotation.DrawableRes

data class Video(
    val id: Int,
    val name: String = "",
    @DrawableRes
    val image: Int = 0,
    @DrawableRes
    val tone: Int = 0,
    val like: Int = 0,
    val description: String = "",
    val rate: Double = 0.0,
    val price: String = "",
    val totalLessons: Int = 0,
    val session: List<Session> = emptyList(),
    val owner: String = ""
)
