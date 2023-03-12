package navigation

import navigation.tabs.*
import ru.alexgladkov.odyssey.compose.extensions.bottomNavigation
import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.extensions.tab
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder

fun RootComposeBuilder.mainFlow() {
    bottomNavigation(
        name = NavigationTree.Main.DASHBOARD.name,
        tabsNavModel = BottomConfiguration()
    ) {
        tab(HomeTab()) {
            screen(name = NavigationTree.Main.HOME.name) {

            }
        }

        tab(SearchTab()) {
            screen(name = NavigationTree.Main.SEARCH.name) {

            }
        }

        tab(EventsTab()) {
            screen(name = NavigationTree.Main.HOME.name) {

            }
        }

        tab(VideosTab()) {
            screen(name = NavigationTree.Main.HOME.name) {

            }
        }
    }
}