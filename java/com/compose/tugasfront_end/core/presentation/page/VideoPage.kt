package com.compose.tugasfront_end.core.presentation.page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.tugasfront_end.core.presentation.MainViewModel
import com.compose.tugasfront_end.core.presentation.component.SearchBarCustom
import com.compose.tugasfront_end.core.presentation.component.VideoTile

@Composable
fun VideoPage(
    modifier: Modifier = Modifier,
    mainViewModel: MainViewModel,
    onVideoTap: (Int) -> Unit,
) {
    val listVideo by mainViewModel.video.collectAsState()
    val query by mainViewModel.queryVideo.collectAsState()
    Column(modifier = modifier) {
        SearchBarCustom(
            value = query,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 26.dp)
        ) {
            mainViewModel.queryVideoChange(it)
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 26.dp, vertical = 12.dp)
        ) {
            Text(
                text = "What do you want to learn?",
                style = MaterialTheme.typography.titleLarge.copy(
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                "SEE ALL",
                style = MaterialTheme.typography.titleSmall.copy(
                    color = Color(0xFF21D4B4),
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
        }
        LazyVerticalGrid(
            columns = GridCells.Fixed(count = 2),
            modifier = modifier,
            contentPadding = PaddingValues(horizontal = 26.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            itemsIndexed(items = listVideo, key = { _, item -> item.id }) { index, item ->
                VideoTile(video = item) {
                    onVideoTap(index)
                }
            }
        }
    }

}