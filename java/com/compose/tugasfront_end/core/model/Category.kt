package com.compose.tugasfront_end.core.model

import androidx.annotation.DrawableRes

data class Category(
    val id: Int,
    @DrawableRes
    val image: Int = 0,
    val name: String = "",
    val totalLessons: Int = 0,
    val rate: Float = 0f,
    val review: Int = 0,
    val session: List<Session> = emptyList()
)
