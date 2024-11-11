package com.example.poketinder.api
import com.example.poketinder.PokemonListResponse
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApi {

    @GET("7api/v2/pokemon")
    suspend fun getPokemon(): Response<PokemonListResponse>
}