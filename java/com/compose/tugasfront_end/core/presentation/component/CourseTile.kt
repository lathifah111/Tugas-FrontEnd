package com.compose.tugasfront_end.core.presentation.component

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.tugasfront_end.R
import com.compose.tugasfront_end.core.model.Course
import com.compose.tugasfront_end.ui.theme.TugasFrontEndTheme

@Composable
fun CourseTile(modifier: Modifier = Modifier, course: Course, onClick: () -> Unit) {
    Card(
        colors = CardDefaults.cardColors().copy(
            containerColor = MaterialTheme.colorScheme.surfaceContainer
        ),
        shape = RoundedCornerShape(24.dp),
        onClick = onClick,
        modifier = modifier
            .padding(vertical = 11.dp)
            .fillMaxWidth()
    ) {

        Box(modifier = Modifier.height(110.dp), contentAlignment = Alignment.BottomStart) {
            Image(
                painter = painterResource(id = course.image),
                contentDescription = course.name,
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 19.dp, vertical = 19.dp)
            ) {
                Text(
                    text = course.date, style = MaterialTheme.typography.titleSmall.copy(textDecoration = TextDecoration.Underline, color = Color.White)
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = course.name,
                        style = MaterialTheme.typography.titleMedium.copy(
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Card(
                        colors = CardDefaults.cardColors().copy(
                            containerColor = Color.Black
                        ),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = course.owner,
                            modifier = Modifier.padding(all = 6.dp),
                            style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Medium, color = Color.White),
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                        )
                    }
                }
            }
        }

    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(
    showBackground = true,
    device = "id:pixel_5"
)
@Composable
private fun ListTilePreview(
) {
    TugasFrontEndTheme() {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) {
            CourseTile(
                course = Course(
                    id = 1,
                    name = "da",
                    owner = "da",
                    image = R.drawable.image_class_unity,
                    price = "Rp.100",
                    rate = 5.5,
                    reviewCount = 12312,
                    date = "8 Nov 2024"
                ),
                onClick = {}
            )
        }
    }
}