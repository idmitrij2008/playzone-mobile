package navigation

import forgot.ForgotScreen
import login.LoginScreen
import register.RegisterScreen
import ru.alexgladkov.odyssey.compose.extensions.flow
import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder

fun RootComposeBuilder.authFlow() {
    flow(name = NavigationTree.Auth.AUTH_FLOW.name) {
        screen(name = NavigationTree.Auth.LOGIN.name) {
            LoginScreen()
        }

        screen(name = NavigationTree.Auth.REGISTER.name) {
            RegisterScreen()
        }

        screen(name = NavigationTree.Auth.FORGOT.name) {
            ForgotScreen()
        }
    }
}