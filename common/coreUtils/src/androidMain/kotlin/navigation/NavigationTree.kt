package navigation

object NavigationTree {

    enum class Splash {
        SPLASH_SCREEN
    }

    enum class Auth {
        AUTH_FLOW, LOGIN, REGISTER, FORGOT
    }

    enum class Main {
        DASHBOARD, HOME, SEARCH, VIDEOS
    }
}