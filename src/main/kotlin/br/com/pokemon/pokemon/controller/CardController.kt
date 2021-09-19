package br.com.pokemon.pokemon.controller

import br.com.pokemon.pokemon.CardRepository.getCard
import br.com.pokemon.pokemon.model.Card
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/card")
class CardController {
    @GetMapping("/{id}")
    fun buscarPorCard(@PathVariable id: String): Card? {
        return getCard(id)

    }
}