package com.example.composebeta.codelab2

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home


@Composable
fun MyBottomNavigation(modifier: Modifier) {
    BottomNavigation(modifier = modifier,
        backgroundColor = MaterialTheme.colors.background,
    ){
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = null
                )
            },
            label = {
                Text("Home")
            },
            selected = true,
            onClick = {}
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null
                )
            },
            label = {
                Text("Profile")
            },
            selected = false,
            onClick = {}
        )
    }

}
