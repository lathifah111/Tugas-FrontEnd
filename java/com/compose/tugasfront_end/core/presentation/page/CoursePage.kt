package com.compose.tugasfront_end.core.presentation.page

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
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
import com.compose.tugasfront_end.core.presentation.component.CategoryTile
import com.compose.tugasfront_end.core.presentation.component.CourseTile
import com.compose.tugasfront_end.core.presentation.component.SearchBarCustom

@Composable
fun CoursePage(
    modifier: Modifier = Modifier,
    mainViewModel: MainViewModel,
    courseOnTapAction: (Int) -> Unit,
    categoryOnTapAction: (Int) -> Unit,
) {
    val listCourse by mainViewModel.course.collectAsState()
    val listCategory by mainViewModel.category.collectAsState()
    val querySearch by mainViewModel.query.collectAsState()

    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(bottom = 40.dp)
    ) {
        item {
            SearchBarCustom(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 26.dp), value = querySearch
            ) {
                mainViewModel.queryChange(it)
            }
            Header(
                title = "Category",
                modifier = Modifier.padding(vertical = 12.dp, horizontal = 26.dp)
            )
            LazyRow(
                contentPadding = PaddingValues(start = 26.dp, end = 26.dp)
            ) {
                itemsIndexed(
                    items = listCategory,
                    key = { _, item -> item.id },
                ) { index, category ->
                    CategoryTile(category = category, modifier = Modifier.padding(end = 10.dp)) {
                        categoryOnTapAction(index)
                    }
                }
            }
            Header(
                title = "Choose Your Class",
                modifier = Modifier
                    .padding(start = 26.dp, end = 26.dp, top = 25.dp),
            )

        }

        itemsIndexed(items = listCourse, key = { _, item -> item.id }) { index, course ->
            AnimatedVisibility(visible = true) {
                CourseTile(
                    course = course,
                    modifier = Modifier.padding(horizontal = 26.dp)
                ) {
                    courseOnTapAction(index)
                }
            }
        }
    }
}

@Composable
fun Header(modifier: Modifier = Modifier, title: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Text(
            text = title, style = MaterialTheme.typography.titleLarge.copy(
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
}