package io.github.xinkev.login.utils

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.time.format.ResolverStyle

/**
 * Check the whether date given is a valid birth date or not.
 * Date format must be dd/MM/uuuu.
 * Validation fails if the date given has an invalid format and the age is >100 or <4
 */
fun isValidBirthDate(value: String): Boolean {
    val formatter =
        DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT)

    return try {
        val date = LocalDate.parse(value, formatter)
        date.isAfter(LocalDate.now().minusYears(100)) &&
                date.isBefore(LocalDate.now().minusYears(4))
    } catch (e: DateTimeParseException) {
        false
    }
}