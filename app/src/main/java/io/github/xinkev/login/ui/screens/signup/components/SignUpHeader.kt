package io.github.xinkev.login.ui.screens.signup.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SignUpHeader() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Almost there!", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Complete the form below or create your Ready To Travel account.")
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "*Mandatory",
            fontSize = 12.sp,
            color = Color(0xFF666666),
        )
    }
}