package io.github.xinkev.login.ui.screens.signup.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun GenderSelection(
    modifier: Modifier = Modifier,
    genderType: GenderType,
    onClick: (GenderType) -> Unit
) {
    Card(
        backgroundColor = Color(0xfff5f5f5),
        shape = RoundedCornerShape(50),
        elevation = 0.dp,
        modifier = modifier
    ) {
        Row(
            modifier = Modifier.height(45.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            GenderOption(
                modifier = Modifier.weight(0.5f),
                label = "Female",
                isSelected = genderType == GenderType.Female,
                onClick = { onClick(GenderType.Female) },
            )
            GenderOption(
                modifier = Modifier.weight(0.5f),
                label = "Male",
                isSelected = GenderType.Male == genderType,
                onClick = { onClick(GenderType.Male) },
            )
        }
    }
}

@Composable
fun GenderOption(
    modifier: Modifier = Modifier,
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val selectedBorder = Modifier.border(
        border = BorderStroke(
            2.dp,
            MaterialTheme.colors.primary
        ),
        shape = RoundedCornerShape(50),
    )
    Box(
        modifier = Modifier
            .run { if (isSelected) then(selectedBorder) else this }
            .clickable(onClick = onClick)
            .fillMaxHeight()
            .then(modifier),
        contentAlignment = Alignment.Center
    ) {
        Text(text = label)
    }
}

enum class GenderType {
    Male, Female
}