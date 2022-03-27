package io.github.xinkev.login.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import io.github.xinkev.login.R

val chivoFontFamily = FontFamily(
    Font(R.font.chivo_black, FontWeight.Black),
    Font(R.font.chivo_black_italic, FontWeight.Black, FontStyle.Italic),
    Font(R.font.chivo_bold, FontWeight.Bold),
    Font(R.font.chivo_bold_italic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.chivo_italic, style = FontStyle.Italic),
    Font(R.font.chivo_light, FontWeight.Light),
    Font(R.font.chivo_light_italic, FontWeight.Light, FontStyle.Italic),
    Font(R.font.chivo_regular, FontWeight.Normal),
)