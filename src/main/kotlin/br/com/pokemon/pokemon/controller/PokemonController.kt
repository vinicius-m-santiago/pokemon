package br.com.pokemon.pokemon.controller


import br.com.pokemon.pokemon.CardRepository
import br.com.pokemon.pokemon.CardRepository.getCard
import br.com.pokemon.pokemon.PokemonRepository.getPokemon
import br.com.pokemon.pokemon.model.Card
import br.com.pokemon.pokemon.model.Pokemon
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/pokemon")
class PokemonController {
    @GetMapping("/teste/{id}")
    fun buscarPorId(@PathVariable id: Int): Pokemon? {
        return getPokemon(id)
    }

    @GetMapping("/card/{id}")
    fun buscarPorCard(@PathVariable @Valid id: String): Card? {
        return getCard(id)
    }


}