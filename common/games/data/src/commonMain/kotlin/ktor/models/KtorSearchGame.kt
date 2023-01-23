package ktor.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import models.Game

@Serializable
data class KtorSearchGame(
    @SerialName("description")
    val description: String,
    @SerialName("gameId")
    val gameId: String,
    @SerialName("size")
    val size: String,
    @SerialName("title")
    val title: String,
    @SerialName("version")
    val version: String
)

fun KtorSearchGame.mapToGame() =
    Game(
        gameId = gameId,
        title = title,
    )