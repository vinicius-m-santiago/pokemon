package br.com.pokemon.pokemon.service

import br.com.pokemon.pokemon.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonService {
    fun getPokemon(id: Int): Pokemon?
}