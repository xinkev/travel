package io.github.xinkev.login.ui.screens.onboarding.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun BackgroundImage(modifier: Modifier = Modifier, @DrawableRes drawable: Int) {
    Image(
        modifier = modifier,
        painter = painterResource(id = drawable),
        contentDescription = null
    )
}