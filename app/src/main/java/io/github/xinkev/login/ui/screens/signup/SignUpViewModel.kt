package io.github.xinkev.login.ui.screens.signup

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.xinkev.login.ui.screens.signup.components.GenderType
import io.github.xinkev.login.utils.isEmailValid
import io.github.xinkev.login.utils.isValidBirthDate
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor() : ViewModel() {
    var firstName by mutableStateOf("")
        private set
    var lastName by mutableStateOf("")
        private set
    var email by mutableStateOf("")
        private set
    var genderType by mutableStateOf(GenderType.Female)
        private set
    var dob by mutableStateOf("")
        private set
    var nationality by mutableStateOf("")
        private set
    var countryOfResidence by mutableStateOf("")
        private set
    var mobileNo by mutableStateOf("")
        private set

    var showSuccess by mutableStateOf(false)
        private set

    val areInputsValid
        get() = firstName.isNotBlank() && lastName.isNotBlank()
                && isEmailValid(email) && isValidBirthDate(dob)
                && countryOfResidence.isNotBlank() && nationality.isNotBlank()


    fun onFirstNameChange(value: String) {
        firstName = value
    }

    fun onLastNameChange(value: String) {
        lastName = value
    }

    fun onEmailChange(value: String) {
        email = value
    }

    fun onDOBChange(value: String) {
        dob = value
    }

    fun onNationalityChange(value: String) {
        nationality = value
    }

    fun onGenderSelect(genderType: GenderType) {
        this.genderType = genderType
    }

    fun onCountryOfResidenceChange(value: String) {
        countryOfResidence = value
    }

    fun onMobileNoChange(value: String) {
        mobileNo = value
    }

    fun onCreateClick() {
        if (areInputsValid) {
            showSuccess = true
        }
    }

    fun clear() {
        showSuccess = false
        firstName = ""
        lastName = ""
        email = ""
        dob = ""
        genderType = GenderType.Female
        nationality = ""
        countryOfResidence = ""
        mobileNo = ""
    }
}