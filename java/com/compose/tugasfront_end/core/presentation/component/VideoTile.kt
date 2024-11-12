package com.compose.tugasfront_end.core.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.tugasfront_end.R
import com.compose.tugasfront_end.core.model.Video
import com.compose.tugasfront_end.core.presentation.Utils
import com.compose.tugasfront_end.ui.theme.TugasFrontEndTheme

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun VideoTile(modifier: Modifier = Modifier, video: Video, onCLick: () -> Unit) {
    Column(
        modifier = modifier
    ) {
        Card(
            onClick = onCLick,
            modifier = Modifier.height(136.dp),
            shape = RoundedCornerShape(24.dp)
        ) {
            Box(modifier = Modifier) {
                Image(
                    painter = painterResource(id = video.image),
                    contentDescription = video.name,
                    contentScale = ContentScale.Crop
                )
                Icon(
                    painter = painterResource(id = R.drawable.icon_play),
                    contentDescription = "Icon play",
                    modifier = Modifier.align(alignment = Alignment.Center)
                )
            }
        }
        Row(
            modifier = Modifier.padding(top = 16.dp, bottom = 7.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.icon_tone_1),
                contentDescription = "Tone",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(7.dp))
            Text(
                text = "${video.like} Student Like This",
                style = MaterialTheme.typography.titleSmall
            )
        }
        Text(
            text = video.name,
            style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Medium),
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = video.price,
            style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Medium),
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = video.price,
            style = MaterialTheme.typography.titleSmall.copy(
                fontWeight = FontWeight.Medium,
                color = Color.Gray,
                textDecoration = TextDecoration.LineThrough
            ),
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun VideoTilePrev() {
    TugasFrontEndTheme {
        VideoTile(
            modifier = Modifier.fillMaxSize(),
            video = Utils.generateVideoDummy()[0],
            onCLick = {})
    }
}