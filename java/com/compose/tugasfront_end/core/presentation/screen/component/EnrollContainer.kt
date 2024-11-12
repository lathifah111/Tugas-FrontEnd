package com.compose.tugasfront_end.core.presentation.screen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.compose.tugasfront_end.ui.theme.Black


@Composable
fun EnrollContainer(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .background(color = Color.White)
            .border(
                width = 1.dp,
                color = Black,
                shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
            ),
        horizontalArrangement = Arrangement.Center,
    ) {
        Row(
            modifier = Modifier.padding(vertical = 20.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Column {
                Text(
                    "Total",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.SemiBold)
                )
                Text(
                    "$ 10.00",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Normal)
                )
            }
            Spacer(modifier = Modifier.width(27.dp))
            FilledIconButton(
                modifier = Modifier
                    .height(56.dp)
                    .width(200.dp),
                shape = RoundedCornerShape(10.dp),
                onClick = { /*TODO*/ },
                colors = IconButtonDefaults.iconButtonColors().copy(containerColor = Black)
            ) {
                Text(
                    text = "Enroll Now",
                    style = MaterialTheme.typography.titleMedium.copy(
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold
                    ),
                )
            }
        }
    }
}