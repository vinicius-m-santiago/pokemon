package br.com.pokemon.pokemon.controller


import br.com.pokemon.pokemon.model.Pokemon
import br.com.pokemon.pokemon.service.PokemonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pokemon")
class PokemonController(
    private val pokemonService: PokemonService
) {

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Int): Pokemon? {  
        return pokemonService.getPokemon(id)
    }
}