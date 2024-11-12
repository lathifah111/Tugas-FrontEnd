package com.compose.tugasfront_end.core.presentation.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.tugasfront_end.R
import com.compose.tugasfront_end.ui.theme.Black
import com.compose.tugasfront_end.ui.theme.TugasFrontEndTheme

@Composable
fun AboutPage(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 26.dp)
    ) {
        Column(
            modifier = modifier
                .align(alignment = Alignment.TopCenter)
                .verticalScroll(state = rememberScrollState())
        ) {
            Spacer(modifier = Modifier.height(13.dp))
            Card(
                shape = RoundedCornerShape(size = 30.dp),
                modifier = Modifier
                    .height(214.dp)
                    .width(335.dp),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.picture_person),
                    contentDescription = "Person",
                    contentScale = ContentScale.Crop,
                )
            }
            Spacer(modifier = Modifier.height(35.dp))
            FieldDetail(
                icon = Icons.Outlined.Person,
                value = "Lathifah Atfiana Sholihah",
                modifier = Modifier
            )
            Spacer(modifier = Modifier.height(24.dp))
            FieldDetail(
                icon = Icons.Outlined.Email,
                value = "lathifahatfia71@gmail.com",
                modifier = Modifier
            )
            Spacer(modifier = Modifier.height(24.dp))
            FieldDetail(
                icon = Icons.Outlined.Call,
                value = "UNISNU Jepara",
                modifier = Modifier
            )
            Spacer(modifier = Modifier.height(24.dp))
            FieldDetail(
                icon = Icons.Outlined.LocationOn,
                value = "Desain Komunikasi Visual",
                modifier = Modifier
            )
            Spacer(modifier = Modifier.height(24.dp))

        }

        FilledIconButton(
            shape = RoundedCornerShape(12.dp),
            colors = IconButtonDefaults.iconButtonColors().copy(containerColor = Black),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 40.dp)
                .align(alignment = Alignment.BottomCenter)
                .height(60.dp),
            onClick = { /*TODO*/ }) {
            Text(
                "Save",
                style = MaterialTheme.typography.titleSmall.copy(
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                ),
            )
        }
    }

}

@Composable
fun FieldDetail(modifier: Modifier = Modifier, icon: ImageVector, value: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = icon, contentDescription = value, modifier = Modifier.padding(16.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            shape = RoundedCornerShape(8.dp),
            label = {
                Text(
                    text = value,
                    style = MaterialTheme.typography.titleMedium.copy(color = Color.Gray),
                )
            },
        )
    }
}

@Preview(
    showBackground = true,
    device = "id:pixel_5"
)
@Composable
private fun AboutPagePrev() {
    TugasFrontEndTheme {
        AboutPage()
    }
}
