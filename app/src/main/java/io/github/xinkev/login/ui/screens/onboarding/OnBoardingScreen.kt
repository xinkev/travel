package io.github.xinkev.login.ui.screens.onboarding

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.xinkev.login.R
import io.github.xinkev.login.ui.components.LoginWithEmailButton
import io.github.xinkev.login.ui.components.LoginWithFacebookButton
import io.github.xinkev.login.ui.components.SignUpButton
import io.github.xinkev.login.ui.screens.onboarding.components.BackgroundImage
import io.github.xinkev.login.ui.screens.onboarding.components.BoardingHeader
import io.github.xinkev.login.ui.screens.onboarding.components.OnBoardingMessage

@Composable
fun OnBoardingScreen(
    goToSignUp: () -> Unit,
) {
    Box {
        BoardingHeader(onCancel = { })
        Box(modifier = Modifier.offset(y = 250.dp)) {
            BackgroundImage(
                drawable = R.drawable.clouds,
                modifier = Modifier.align(Alignment.BottomStart)
            )
            Column(
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(vertical = 16.dp, horizontal = 32.dp)
            ) {
                OnBoardingMessage()
                Spacer(modifier = Modifier.height(32.dp))
                LoginWithFacebookButton()
                Spacer(modifier = Modifier.height(8.dp))
                LoginWithEmailButton()
                Spacer(modifier = Modifier.height(8.dp))
                SignUpButton(onClick = goToSignUp)
            }
        }
    }
}