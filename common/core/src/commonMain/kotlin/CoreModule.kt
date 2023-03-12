import json.serializationModule
import ktor.ktorModule
import org.kodein.di.DI
import settings.settingsModule

val coreModule = DI.Module("coreModule") {
    importAll(
        ktorModule,
//        databaseModule,
        serializationModule,
        settingsModule,
    )
}