package br.com.pokemon.pokemon

import org.springframework.context.annotation.ComponentScan


import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@ComponentScan("br.com.pokemon.pokemon.controller")
class PokemonApplication

fun main(args: Array<String>) {
	runApplication<PokemonApplication>(*args)
}
