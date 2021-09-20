package br.com.pokemon.pokemon.repository

import br.com.pokemon.pokemon.client.PokemonClient
import br.com.pokemon.pokemon.model.Pokemon
import br.com.pokemon.pokemon.service.PokemonService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface PokemonRepository {
    fun getPokemon(id: Int): Pokemon?
}