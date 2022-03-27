package io.github.xinkev.login.ui.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Composable
fun SignUpButton(onClick: () -> Unit) {
    val gradient = remember {
        Brush.linearGradient(
            listOf(
                Color(0xff01b7c7),
                Color(0xff2c79a0)
            )
        )
    }
    GradientButton(gradientBrush = gradient, onClick = onClick) {
        Text(text = "Create a new account")
    }
}