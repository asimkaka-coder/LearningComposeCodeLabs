package com.example.composebeta.codelab2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composebeta.R


@Composable
fun AlignBodyElement(
    elementText:String = "Android Background",
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier
                .size(88.dp)
                .clip(CircleShape)
        )
        Text(
            text = elementText,
            style = MaterialTheme.typography.subtitle1,
            modifier = modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp)
        )
    }
}

@Composable
fun AlignBodyRow(
    modifier: Modifier = Modifier,
    list: List<String> = List(50){"Item $it"}
    ) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(16.dp)
    ){
        items(list){
            AlignBodyElement(it)
        }
    }

}


@Preview(
    showBackground = true
)
@Composable
fun AlignBodyElementPreview() {
    AlignBodyElement()
}

@Preview(
    showBackground = true
)
@Composable
fun AlignBodyElementRowPreview() {
    AlignBodyRow()
}