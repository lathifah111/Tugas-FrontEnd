package com.compose.tugasfront_end.core.presentation.screen.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.tugasfront_end.R
import com.compose.tugasfront_end.core.model.DetailSession
import com.compose.tugasfront_end.ui.theme.BorderGreen
import com.compose.tugasfront_end.ui.theme.Green
import com.compose.tugasfront_end.ui.theme.YoungGreen

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DetailSectionTile(modifier: Modifier = Modifier, index: Int, detailSession: DetailSession, onClick: () -> Unit) {
    Card(
        modifier = modifier,
        onClick = onClick,
        shape = RoundedCornerShape(size = 100.dp),
        border = BorderStroke(width = 1.dp, color = BorderGreen),
    ) {
        Row(
            modifier = Modifier.padding(all = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                shape = RoundedCornerShape(size = 100.dp),
                backgroundColor = YoungGreen
            ) {
                Text(
                    modifier = Modifier.padding(all = 16.dp),
                    text = if (index < 10) "0${index + 1}" else "${index + 1}",
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Green
                    )
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 21.dp)
            ) {
                Text(
                    detailSession.name,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                )
                Text(
                    "${detailSession.duration} min",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Gray
                    ),
                )
            }
            if (!detailSession.isPlayed) {
                Icon(
                    imageVector = Icons.Outlined.Lock,
                    contentDescription = "Lock Icon",
                    modifier = Modifier
                        .size(35.dp)
                        .padding(end = 8.dp),
                )
            } else {
                Image(
                    painter = painterResource(id = R.drawable.icon_play_green),
                    contentDescription = "Lock Icon",
                    modifier = Modifier
                        .size(35.dp)
                        .padding(end = 8.dp)
                )
            }
        }
    }
}