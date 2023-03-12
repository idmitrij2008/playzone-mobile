package settings

import com.russhwolf.settings.Settings

class SettingsDataSource(
    private val settings: Settings
) {

    companion object {
        private const val KEY_TOKEN = "tokenKey"
    }

    fun saveToken(token: String) {
        settings.putString(KEY_TOKEN, token)
    }

    fun fetchToken(): String {
        return settings.getString(KEY_TOKEN, "")
    }
}