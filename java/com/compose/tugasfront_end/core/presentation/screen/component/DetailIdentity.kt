package com.compose.tugasfront_end.core.presentation.screen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.tugasfront_end.R


@Composable
fun DetailIdentity(modifier: Modifier = Modifier, name: String, lessons: Int) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Outlined.Person,
                contentDescription = "Person",
                tint = Color.Gray,
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = name,
                style = MaterialTheme.typography.titleSmall.copy(
                    color = Color.Gray,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                )
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.icon_play_outline),
                contentDescription = "Lessons",
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = "$lessons Lesson",
                style = MaterialTheme.typography.titleSmall.copy(
                    color = Color.Gray,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                )
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.icon_play_certificate),
                contentDescription = "Leason",
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = "Certificate",
                style = MaterialTheme.typography.titleSmall.copy(
                    color = Color.Gray,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                )
            )
        }
    }
}