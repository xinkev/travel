package io.github.xinkev.login.ui.screens.signup.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.xinkev.login.ui.components.GradientButton

@Composable
fun CreateNowButton(enabled: Boolean, onClick: () -> Unit) {
    val gradient = remember {
        Brush.linearGradient(
            listOf(
                Color(0xff01b7c7),
                Color(0xff2c79a0)
            )
        )
    }
    GradientButton(
        enabled = enabled,
        gradientBrush = gradient,
        onClick = onClick,
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "Create my new account now")
    }
}