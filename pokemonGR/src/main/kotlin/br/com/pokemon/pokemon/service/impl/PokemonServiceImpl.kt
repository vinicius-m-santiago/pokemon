package br.com.pokemon.pokemon.service.impl

import br.com.pokemon.pokemon.model.Pokemon
import br.com.pokemon.pokemon.repository.PokemonRepository
import br.com.pokemon.pokemon.service.PokemonService
import org.springframework.stereotype.Service

@Service
class PokemonServiceImpl(
    private val pokemonRepository: PokemonRepository
) : PokemonService {
    override fun getPokemon(id: Int): Pokemon? =
        pokemonRepository.getPokemon(id)
}