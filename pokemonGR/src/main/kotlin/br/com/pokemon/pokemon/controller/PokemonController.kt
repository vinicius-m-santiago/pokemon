package br.com.pokemon.pokemon.controller


import br.com.pokemon.pokemon.PokemonRepository.getPokemon
import br.com.pokemon.pokemon.model.Pokemon
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pokemon")
class PokemonController {

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Int): Pokemon? {  
        return getPokemon(id)
    }
}