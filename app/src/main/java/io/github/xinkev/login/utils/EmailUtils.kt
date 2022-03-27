package io.github.xinkev.login.utils

import android.util.Patterns


fun isEmailValid(value: String): Boolean {
    val pattern = Patterns.EMAIL_ADDRESS.matcher(value)
    return pattern.matches()
}