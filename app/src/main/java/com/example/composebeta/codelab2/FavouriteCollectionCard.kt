package com.example.composebeta.codelab2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebeta.R


@Composable
fun FavouriteCollectionCard(
    cardText:String = "Android Background",
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier,
        shape = MaterialTheme.shapes.medium
    ) {
        Row(modifier = modifier.width(192.dp),
        verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                contentScale= ContentScale.Crop,
                modifier = modifier.size(56.dp)
            )
            Text(text = cardText,
                modifier = modifier.padding(horizontal = 8.dp),
                style = MaterialTheme.typography.subtitle2.copy(
                    fontSize = 12.sp
                )
                )
        }
    }
}

@Composable
fun FavouriteCollectionCardGrid(
    modifier: Modifier = Modifier,
    list: List<String> = List(50){"Item $it"}

) {
    LazyHorizontalGrid(rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier.height(120.dp)
        ){
        items(list){it->
                FavouriteCollectionCard(it)
        }
    }
    
}


@Preview(
    showBackground = true
)
@Composable
fun FavouriteCollectionCardPreview() {
    FavouriteCollectionCard()
}

@Preview(
    showBackground = true
)
@Composable
fun FavouriteCollectionCardGridPreview() {
    FavouriteCollectionCardGrid()
}