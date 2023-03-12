import json.serializationModule
import ktor.ktorModule
import org.kodein.di.DI

val coreModule = DI.Module("coreModule") {
    importAll(
        ktorModule,
//        databaseModule,
        serializationModule
    )
}