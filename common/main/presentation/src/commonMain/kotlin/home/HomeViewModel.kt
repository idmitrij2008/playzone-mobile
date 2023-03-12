package home

import com.adeo.kviewmodel.BaseSharedViewModel
import home.models.HomeAction
import home.models.HomeEvent
import home.models.HomeViewState

class HomeViewModel : BaseSharedViewModel<HomeViewState, HomeAction, HomeEvent>(
    initialState = HomeViewState(
        userName = "Erlink Halah",
        avatarUrl = "https://assets-a1.kompasiana.com/items/album/2022/12/26/whatsapp-image-2022-12-26-at-22-23-02-63a9bc6a08a8b52cc42c5223.jpeg",
    )
) {
    override fun obtainEvent(viewEvent: HomeEvent) {
        when (viewEvent) {
            HomeEvent.UserProfileClicked -> HomeAction.ShowUserProfile
        }
    }

}