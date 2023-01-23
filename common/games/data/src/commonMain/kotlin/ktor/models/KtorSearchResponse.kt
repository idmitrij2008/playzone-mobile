package ktor.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class KtorSearchResponse(
    @SerialName("games")
    val games: List<KtorSearchGame>
)