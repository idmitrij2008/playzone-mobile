import ktor.KtorAuthRemoteDataSource
import org.kodein.di.*
import settings.SettingsDataSource

val authModule = DI.Module("authModule") {
    bind<AuthRepository>() with singleton {
        AuthRepositoryImpl(instance(), instance())
    }

    bind<SettingsDataSource>() with provider {
        SettingsDataSource(instance())
    }

    bind<KtorAuthRemoteDataSource>() with provider {
        KtorAuthRemoteDataSource(instance())
    }
}

