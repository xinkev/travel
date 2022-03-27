package io.github.xinkev.login.ui.screens.onboarding.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OnBoardingMessage() {
    Text(
        text = "Welcome to \nReady To Travel",
        textAlign = TextAlign.Start,
        fontWeight = FontWeight.Bold,
        fontSize = 29.sp,
        letterSpacing = 1.sp,
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(
        text = "Sign up with Facebook for the most fulfilling trip planning experience with us!",
        style = MaterialTheme.typography.subtitle1
    )
}