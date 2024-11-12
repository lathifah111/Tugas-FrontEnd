package com.compose.tugasfront_end.core.model

import androidx.annotation.DrawableRes

data class Course(
    val id: Int,
    val name: String = "",
    val description: String = "",
    val owner: String = "",
    val date: String = "",
    @DrawableRes
    val image: Int = 0,
    val rate: Double = 0.0,
    val reviewCount: Int = 0,
    val price: String = ""
)