package com.compose.tugasfront_end.core.presentation.screen

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.tugasfront_end.R
import com.compose.tugasfront_end.core.presentation.MainViewModel
import com.compose.tugasfront_end.core.presentation.component.TagComponent
import com.compose.tugasfront_end.core.presentation.screen.component.DetailIdentity
import com.compose.tugasfront_end.core.presentation.screen.component.EnrollContainer
import com.compose.tugasfront_end.core.presentation.screen.component.SectionTile
import com.compose.tugasfront_end.ui.theme.Blue
import com.compose.tugasfront_end.ui.theme.Green

@Composable
fun DetailScreenVideo(modifier: Modifier = Modifier, id: Int, mainViewModel: MainViewModel, backHandler: () -> Unit) {
    val configuration = LocalConfiguration.current
    val maxWidth = configuration.screenWidthDp.dp

    val category by mainViewModel.video.collectAsState()
    val detail = category[id]

    Box(
        modifier = modifier
            .background(color = Color.White)
    ) {
        LazyColumn(modifier = Modifier, contentPadding = PaddingValues(bottom = 100.dp)) {
            item {
                Box(modifier = Modifier) {
                    Box {
                        Image(
                            painter = painterResource(id = detail.image),
                            contentDescription = "ImageCourse",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(maxWidth)
                                .height(412.dp),
                        )
                        PlayVideoContainer(modifier = Modifier.align(alignment = Alignment.Center))
                    }
                    Box(
                        modifier = Modifier
                            .width(maxWidth)
                            .clip(shape = RoundedCornerShape(topStart = 45.dp, topEnd = 45.dp))
                            .background(Color.White)
                            .align(Alignment.BottomCenter)

                    ) {
                        Column(
                            modifier = Modifier
                                .padding(horizontal = 24.dp, vertical = 35.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                            ) {
                                TagComponent(tagName = "Best Seller", color = Blue)
                                Row {
                                    Image(
                                        painter = painterResource(id = R.drawable.icon_star_yellow),
                                        contentDescription = "Icon Star",
                                        modifier = Modifier.size(16.dp)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = "${detail.rate} (${detail.like} Review)",
                                        style = MaterialTheme.typography.titleSmall.copy(
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.SemiBold,
                                            color = Color.Gray
                                        )
                                    )
                                }
                            }
                            Text(
                                modifier = Modifier.padding(top = 22.dp, bottom = 12.dp),
                                text = detail.name,
                                style = MaterialTheme.typography.titleLarge.copy(
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold,
                                ),
                            )
                            DetailIdentity(name = detail.owner, lessons = detail.totalLessons)
                            Spacer(modifier = Modifier.height(16.dp))
                            Row(
                                modifier = Modifier
                                    .padding(top = 8.dp)
                            ) {
                                Text(
                                    text = "Lessons",
                                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                                )
                                Spacer(modifier = Modifier.width(5.dp))
                                Text(
                                    text = "${detail.totalLessons}",
                                    style = MaterialTheme.typography.titleMedium.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = Green
                                    )
                                )
                            }
                        }
                    }
                }
            }
            itemsIndexed(items = detail.session) { index, session ->
                SectionTile(
                    modifier = Modifier.padding(horizontal = 26.dp),
                    index = index,
                    session = session
                )
            }
        }
        EnrollContainer(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        )
    }
    BackHandler {
        backHandler()
    }
}

@Composable
fun PlayVideoContainer(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors().copy(containerColor = Color.White.copy(alpha = 0.8f))

    ) {
        Row(
            modifier = Modifier.padding(horizontal = 21.dp, vertical = 9.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Card(
                shape = RoundedCornerShape(100.dp),
                colors = CardDefaults.cardColors().copy(containerColor = Color.White)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.icon_play_filled),
                    contentDescription = "Icon Play",
                    modifier = Modifier.padding(7.dp)
                )
            }
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "Video Preview",
                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.SemiBold)
            )
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun PlayVideoContainerPrev() {
    PlayVideoContainer()
}
