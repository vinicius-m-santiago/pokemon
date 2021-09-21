package br.com.pokemon.pokemon.repository.impl

import br.com.pokemon.pokemon.client.PokemonClient
import br.com.pokemon.pokemon.model.Pokemon
import br.com.pokemon.pokemon.repository.PokemonRepository
import org.springframework.stereotype.Repository

@Repository
class PokemonRepositoryImpl(
    private val pokemonClient: PokemonClient
) : PokemonRepository {
    override fun getPokemon(id: Int): Pokemon? {
        val response = pokemonClient.getPokemon(id).execute()
        if (response.isSuccessful) {
            return response.body()
        }
        throw Exception("Ocorreu um erro na hora de buscar o pokemon")
    }
}