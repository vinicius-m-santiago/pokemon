package br.com.pokemon.pokemon.service

import br.com.pokemon.pokemon.model.Card
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CardService {

    @GET("cards/{id}")
  fun getCard(@Path("id")id: String): Call<Card>

}