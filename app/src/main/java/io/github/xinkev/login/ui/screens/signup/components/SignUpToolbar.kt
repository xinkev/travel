package io.github.xinkev.login.ui.screens.signup.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SignUpToolbar(goBack: () -> Unit) {
    Row(Modifier.fillMaxWidth()) {
        IconButton(
            modifier = Modifier.padding(vertical = 8.dp, horizontal = 4.dp),
            onClick = goBack
        ) {
            Icon(imageVector = Icons.Default.ArrowBackIosNew, contentDescription = null)
        }
    }
}