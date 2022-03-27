package io.github.xinkev.login.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Facebook
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LoginWithFacebookButton() {
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
        Text(text = "Log in with Facebook")
        Icon(
            imageVector = Icons.TwoTone.Facebook,
            contentDescription = null,
            modifier = Modifier
                .align(
                    Alignment.CenterEnd
                )
                .padding(horizontal = 8.dp)
        )
    }
}