package com.compose.tugasfront_end.core.presentation.screen

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.tugasfront_end.R
import com.compose.tugasfront_end.core.presentation.MainViewModel
import com.compose.tugasfront_end.core.presentation.component.RatingBarCustom
import com.compose.tugasfront_end.core.presentation.component.TagComponent
import com.compose.tugasfront_end.ui.theme.Black
import com.compose.tugasfront_end.ui.theme.Blue
import com.compose.tugasfront_end.ui.theme.Green

@Composable
fun DetailScreenCourse(modifier: Modifier = Modifier, id: Int, mainViewModel: MainViewModel, backHandler:() -> Unit) {
    val configuration = LocalConfiguration.current
    val maxWidth = configuration.screenWidthDp.dp
    val maxHeight = configuration.screenHeightDp

    val course by mainViewModel.course.collectAsState()
    val detailCourse = course[id]

    BackHandler {
        backHandler()
    }

    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = detailCourse.image),
            contentDescription = "ImageCourse",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(maxWidth)
                .height(412.dp),
        )
        Box(
            modifier = Modifier
                .width(maxWidth)
                .height((0.7 * maxHeight).dp)
                .clip(shape = RoundedCornerShape(topStart = 45.dp, topEnd = 45.dp))
                .background(Color.White)
                .align(Alignment.BottomCenter)

        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 24.dp, vertical = 35.dp)
                    .verticalScroll(state = rememberScrollState())
            ) {
                Row {
                    TagComponent(tagName = "Top Rated", color = Blue)
                    Spacer(modifier = Modifier.width(7.dp))
                    TagComponent(tagName = "Access Lifetime", color = Green)
                }
                DetailIdentityCourse(
                    modifier = Modifier.padding(vertical = 6.dp),
                    owner = detailCourse.owner,
                    name = detailCourse.name,
                    price = detailCourse.price
                )
                Rate(
                    modifier = Modifier.padding(vertical = 10.dp),
                    rate = 4.0.toFloat(),
                    review = 121241
                )
                Text(
                    text = detailCourse.description,
                    style = MaterialTheme.typography.titleMedium.copy(color = Color.Gray)
                )
            }
        }

        ActionButton(modifier = Modifier.align(alignment = Alignment.BottomCenter))
    }

}

@Composable
fun DetailIdentityCourse(modifier: Modifier = Modifier, owner: String, name: String, price: String) {
    Column(modifier = modifier) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = name,
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
            )
            Text(
                text = price,
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = owner,
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold)
            )
            Text(
                text = "$ 50.00",
                style = MaterialTheme.typography.titleLarge.copy(
                    fontWeight = FontWeight.Normal,
                    textDecoration = TextDecoration.LineThrough,
                    color = Color.Gray
                ),
            )
        }
    }
}

@Composable
fun Rate(modifier: Modifier = Modifier, rate: Float, review: Int) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        RatingBarCustom(rating = rate)
        Spacer(modifier = Modifier.width(5.dp))
        Text(
            text = "($review reviews)",
            style = MaterialTheme.typography.titleSmall.copy(
                fontWeight = FontWeight.SemiBold,
                fontSize = 10.sp
            ),
        )
    }
}

@Composable
fun ActionButton(modifier: Modifier = Modifier) {
    Row(modifier = modifier.padding(bottom = 40.dp)) {
        OutlinedButton(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .height(60.dp)
                .width(160.dp)
        ) {
            Text(
                text = "Buy Now",
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Black
                )
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        FilledIconButton(
            colors = IconButtonDefaults.iconButtonColors().copy(containerColor = Black),
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .height(60.dp)
                .width(160.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Add To Now",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))
                Image(painter = painterResource(id = R.drawable.icon_chart), contentDescription = "Icon Chart", modifier.size(24.dp))
            }
        }
    }
}