package io.github.xinkev.login.ui.screens.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.AlertDialog
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import io.github.xinkev.login.R
import io.github.xinkev.login.ui.components.TextInput
import io.github.xinkev.login.ui.screens.signup.components.CreateNowButton
import io.github.xinkev.login.ui.screens.signup.components.GenderSelection
import io.github.xinkev.login.ui.screens.signup.components.SignUpHeader
import io.github.xinkev.login.ui.screens.signup.components.SignUpToolbar

@Composable
fun SignUpScreen(
    goBack: () -> Unit,
    vm: SignUpViewModel,
) {
    if (vm.showSuccess) {
        AlertDialog(onDismissRequest = vm::clear, confirmButton = {
            TextButton(onClick = vm::clear) {
                Text(text = "Okay")
            }
        }, text = { Text(text = "Successfully created your account!") })
    }
    Column(
        modifier = Modifier
            .background(color = Color(0xFFF6F6F6))
            .verticalScroll(rememberScrollState()),
    ) {
        SignUpToolbar(goBack)
        SignUpHeader()
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(16.dp)
        ) {
            TextInput(
                value = vm.firstName,
                onValueChange = vm::onFirstNameChange,
                hint = "First Name *",
                modifier = Modifier.fillMaxWidth(),
            )
            TextInput(
                value = vm.lastName,
                onValueChange = vm::onLastNameChange,
                hint = "Last Name *",
                modifier = Modifier.fillMaxWidth(),
            )
            TextInput(
                value = vm.email,
                onValueChange = vm::onEmailChange,
                hint = "Email Address *",
                modifier = Modifier.fillMaxWidth(),
            )
            Row {
                TextInput(
                    value = vm.dob,
                    onValueChange = vm::onDOBChange,
                    hint = "Date of Birth *",
                    placeholder = "DD/MM/YYYY",
                    trailingIcon = painterResource(
                        id = R.drawable.dob
                    ),
                    modifier = Modifier.weight(0.5f)
                )
                GenderSelection(
                    modifier = Modifier
                        .weight(0.5f)
                        .padding(top = 8.dp, start = 8.dp, bottom = 8.dp),
                    genderType = vm.genderType,
                    onClick = vm::onGenderSelect
                )
            }
            TextInput(
                value = vm.nationality,
                onValueChange = vm::onNationalityChange,
                hint = "Nationality *",
                modifier = Modifier.fillMaxWidth(),
            )
            TextInput(
                value = vm.countryOfResidence,
                onValueChange = vm::onCountryOfResidenceChange,
                hint = "Country of Residence *",
                modifier = Modifier.fillMaxWidth(),
            )
            TextInput(
                value = vm.mobileNo,
                onValueChange = vm::onMobileNoChange,
                hint = "Mobile no.(Optional)",
                modifier = Modifier.fillMaxWidth(),
            )
            CreateNowButton(onClick = vm::onCreateClick, enabled = vm.areInputsValid)
        }
    }
}

