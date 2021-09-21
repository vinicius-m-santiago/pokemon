package br.com.pokemon.pokemon.configuration

import br.com.pokemon.pokemon.client.PokemonClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Configuration
class Config(
    @Value("\${pokemon.baseUrl}")
    private val pokemonClientBaseURL: String
) {
    @Bean
    fun pokemonClient(): PokemonClient {
        val retrofit = Retrofit.Builder()
            .baseUrl(pokemonClientBaseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(PokemonClient::class.java)
    }
}