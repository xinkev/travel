package io.github.xinkev.login.ui.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Composable
fun LoginWithEmailButton() {
    val gradient = remember {
        Brush.linearGradient(
            colors = listOf(
                Color(0xff1864d6),
                Color(0xff1864d6),
            )
        )
    }
    GradientButton(
        gradientBrush = gradient,
        onClick = {},
    ) {
        Text(text = "Log in with email address")
    }
}