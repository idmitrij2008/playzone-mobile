package navigation

import SplashScreen
import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder

fun RootComposeBuilder.generateGraph() {
    screen(NavigationTree.Splash.SPLASH_SCREEN.name) {
        SplashScreen()
    }

    authFlow()
    mainFlow()
    5:59:15
}