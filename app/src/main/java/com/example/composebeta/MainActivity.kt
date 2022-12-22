package com.example.composebeta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composebeta.codelab1.OnBoardingScreen
import com.example.composebeta.codelab2.HomeScreen
import com.example.composebeta.codelab2.MyBottomNavigation
import com.example.composebeta.ui.theme.ComposeBetaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBetaTheme {
                // A surface container using the 'background' color from the theme
                MyApp(modifier = Modifier)

            }
        }
    }
}


@Composable
private fun MyApp(
    modifier: Modifier = Modifier,
) {
    val shouldShowOnBoarding = rememberSaveable {
        mutableStateOf(true)
    }
    Surface(
        modifier = modifier,
        color = MaterialTheme.colors.background
    ) {
        if (shouldShowOnBoarding.value) OnBoardingScreen(onContinueClicked = {
            shouldShowOnBoarding.value = false
        }) else Scaffold(
            bottomBar = { MyBottomNavigation(modifier = modifier) }
        ) {
            HomeScreen(modifier = modifier.padding(it))
        }
    }
}


@Preview(
    showBackground = true,
    showSystemUi = false
)
@Composable
fun DefaultPreview() {
    ComposeBetaTheme {
        MyApp()
    }
}