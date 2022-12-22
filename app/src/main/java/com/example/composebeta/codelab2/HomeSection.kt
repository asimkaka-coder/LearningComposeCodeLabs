package com.example.composebeta.codelab2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebeta.R
import com.example.composebeta.ui.theme.ComposeBetaTheme

@Composable
fun HomeSection(
    title: String = "Section",
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(modifier) {
        Text(title,
            style = MaterialTheme.typography.h2.copy(
                fontSize = 25.sp
            ),
            modifier = modifier
                .paddingFromBaseline(top = 40.dp, bottom = 8.dp)
                .padding(horizontal = 16.dp)

        )
        content()
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun HomeSectionPreview() {
    ComposeBetaTheme() {
        HomeSection("Align Body") {
            AlignBodyRow()
        }
    }
}
