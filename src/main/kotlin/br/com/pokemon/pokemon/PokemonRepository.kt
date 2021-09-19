package br.com.pokemon.pokemon

import br.com.pokemon.pokemon.model.Pokemon
import br.com.pokemon.pokemon.service.PokemonService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PokemonRepository {

    val service: PokemonService
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

     service = retrofit.create(PokemonService::class.java)
    }

    fun getPokemon(id: Int): Pokemon?{
        val call = service.getPokemon(id)
        return call.execute().body()
    }

}