package com.compose.tugasfront_end.core.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.tugasfront_end.core.model.Category
import com.compose.tugasfront_end.core.presentation.Utils
import com.compose.tugasfront_end.ui.theme.TugasFrontEndTheme

@Composable
fun CategoryTile(modifier: Modifier = Modifier, category: Category, onClick: () -> Unit) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .size(100.dp),
            shape = RoundedCornerShape(16.dp),
            onClick = onClick
        ) {
            Image(
                painter = painterResource(id = category.image),
                contentDescription = category.name,
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = category.name, style = MaterialTheme.typography.titleSmall
        )
    }
}

@Preview
@Composable
private fun CategoryTile() {
    TugasFrontEndTheme {
        CategoryTile(category = Utils.generateCategoryList()[0]) {}
    }
}