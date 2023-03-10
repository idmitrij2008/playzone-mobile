import ktor.KtorAuthRemoteDataSource
import ktor.KtorLoginRequest
import models.Token
import settings.SettingsDataSource

class AuthRepositoryImpl(
    private val remoteDataSource: KtorAuthRemoteDataSource,
    private val cacheDataSource: SettingsDataSource,
) : AuthRepository {

    override suspend fun login(login: String, password: String): Token {
        val token = remoteDataSource.performLogin(
            request = KtorLoginRequest(
                login = login,
                password = password
            )
        )

        cacheDataSource.saveToken(token.token)

        return token
    }

    override fun isUserLoggedIn(): Boolean {
        return cacheDataSource.fetchToken().isNotBlank()
    }

}