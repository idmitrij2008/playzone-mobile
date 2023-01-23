package ktor

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import ktor.models.KtorSearchGame
import ktor.models.KtorSearchRequest
import ktor.models.KtorSearchResponse

class KtorGamesDataSource(private val httpClient: HttpClient) {
    suspend fun fetchAllGames(): List<KtorSearchGame> {
        return httpClient.post {
            header("Bearer-Authorization", "admin_token")

            url {
                path("games/search")
                setBody(KtorSearchRequest(searchQuery = ""))
            }
        }.body<KtorSearchResponse>().games
    }

    suspend fun searchGame(query: String): List<KtorSearchGame> {
        return httpClient.post {
            header("Bearer-Authorization", "admin_token")

            url {
                path("/games/search")
                setBody(KtorSearchRequest(searchQuery = query))
            }
        }.body<KtorSearchResponse>().games
    }
}