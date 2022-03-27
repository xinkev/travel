package io.github.xinkev.login.ui.components

import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter

@Composable
fun TextInput(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    hint: String,
    trailingIcon: Painter? = null,
    placeholder: String? = null,
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Transparent
        ),
        label = { Text(text = hint) },
        modifier = modifier,
        trailingIcon = trailingIcon?.let { { Icon(painter = it, contentDescription = null) } },
        placeholder = placeholder?.let { { Text(text = it) } }
    )
}