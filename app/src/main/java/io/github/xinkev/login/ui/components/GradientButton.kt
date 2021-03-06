package io.github.xinkev.login.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp

@Composable
fun GradientButton(
    modifier: Modifier = Modifier,
    gradientBrush: Brush,
    enabled: Boolean = true,
    onClick: () -> Unit,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(
        modifier = modifier.then(
            Modifier
                .clip(RoundedCornerShape(10))
                .run { if (enabled) background(brush = gradientBrush) else background(Color.Gray) }
                .clickable(onClick = onClick, role = Role.Button)
                .height(45.dp)
                .fillMaxWidth()
        ),
        contentAlignment = Alignment.Center
    ) {
        CompositionLocalProvider(LocalContentColor provides Color.White) {
            content()
        }
    }
}