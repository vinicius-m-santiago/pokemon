package br.com.pokemon.pokemon

import br.com.pokemon.pokemon.model.Card
import br.com.pokemon.pokemon.service.CardService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CardRepository {

    val service: CardService
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.pokemontcg.io/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(CardService::class.java)
    }

    fun getCard(id: String): Card?{
       val call = service.getCard(id)
       return call.execute().body()

    }

    fun getCardList(): Card?{
         val call = service.getCardList()
         return call.execute().body()
        }
    }

