package com.compose.tugasfront_end.core.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.compose.tugasfront_end.R
import kotlin.math.ceil
import kotlin.math.floor

@Composable
fun RatingBarCustom(
    rating: Float,
    modifier: Modifier = Modifier,
    maxRating: Int = 5,
    starColor: Color = Color.Yellow
) {
    Row(modifier = modifier) {
        val fullStars = floor(rating).toInt() // Bintang penuh
        val hasHalfStar = (rating - fullStars) >= 0.5 // Bintang setengah jika ada nilai desimal >= 0.5
        val emptyStars = maxRating - ceil(rating).toInt() // Sisa bintang kosong

        // Tambah bintang penuh
        repeat(fullStars) {
            Icon(
                imageVector = Icons.Filled.Star,
                contentDescription = "Full Star",
                tint = starColor,
                modifier = Modifier.padding(end = 2.dp).size(10.dp)
            )
        }

        // Tambah bintang setengah jika ada
        if (hasHalfStar) {
            Image(
                painter = painterResource(id = R.drawable.icon_half_star),
                contentDescription = "Half Star",
                modifier = Modifier.padding(end = 2.dp).size(10.dp)
            )
        }

        // Tambah bintang kosong
        repeat(emptyStars) {
            Icon(
                imageVector = Icons.Outlined.Star,
                contentDescription = "Empty Star",
                tint = starColor,
                modifier = Modifier.padding(end = 2.dp).size(10.dp)
            )
        }
    }
}