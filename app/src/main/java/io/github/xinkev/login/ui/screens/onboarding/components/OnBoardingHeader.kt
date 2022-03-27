package io.github.xinkev.login.ui.screens.onboarding.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.xinkev.login.R

@Composable
fun BoardingHeader(onCancel: () -> Unit) {
    Box {
        BackgroundImage(
            drawable = R.drawable.welcome,
        )
        IconButton(
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 4.dp),
            onClick = onCancel
        ) {
            Icon(imageVector = Icons.Default.Close, contentDescription = null)
        }
    }
}
