package br.com.pokemon.pokemon.client

import br.com.pokemon.pokemon.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonClient {
    @GET("pokemon/{id}")
    fun getPokemon(@Path("id")id: Int = 1): Call<Pokemon>
}