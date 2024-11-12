package com.compose.tugasfront_end.core.presentation.component

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TagComponent(modifier: Modifier = Modifier, tagName: String, color: Color) {
    Card(
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors().copy(containerColor = color)
    ) {
        Text(
            text = tagName,
            style = MaterialTheme.typography.titleSmall.copy(
                fontSize = 10.sp,
                color = Color.White,
                fontWeight = FontWeight.SemiBold
            ),
            modifier = Modifier
                .padding(horizontal = 6.dp, vertical = 5.dp)
        )
    }
}