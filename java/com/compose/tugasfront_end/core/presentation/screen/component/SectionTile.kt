package com.compose.tugasfront_end.core.presentation.screen.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.compose.tugasfront_end.core.model.Session

@Composable
fun SectionTile(modifier: Modifier = Modifier, index: Int, session: Session) {
    Column(
        modifier = modifier
    ) {
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Text(
            text = "Section ${index} : ${session.name}",
            style = MaterialTheme.typography.titleMedium.copy(
                fontWeight = FontWeight.SemiBold,
                color = Color.Gray
            ),
        )
        Spacer(modifier = Modifier.padding(top = 6.dp))
        session.detail.mapIndexed { index, detailSesion ->
            DetailSectionTile(
                modifier = Modifier.padding(vertical = 7.dp),
                index = index,
                detailSession = detailSesion
            ) {

            }
        }
    }
}