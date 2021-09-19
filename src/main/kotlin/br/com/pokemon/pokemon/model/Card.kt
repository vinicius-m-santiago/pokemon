package br.com.pokemon.pokemon.model

import com.google.gson.annotations.SerializedName
import javax.validation.constraints.NotNull

data class Card(
    val `data`: Data
)

data class Data(
    val abilities: List<Ability>,
    val artist: String,
    val attacks: List<Attack>,
    val cardmarket: Cardmarket,
    val convertedRetreatCost: Int,
    val evolvesFrom: String,
    val hp: String,
    val id: String,
    val images: Images,
    val legalities: Legalities,
    val level: String,
    val name: String,
    val nationalPokedexNumbers: List<Int>,
    val number: String,
    val rarity: String,
    val resistances: List<Resistance>,
    val retreatCost: List<String>,
    val `set`: Set,
    val subtypes: List<String>,
    val supertype: String,
    val tcgplayer: Tcgplayer,
    val types: List<String>,
    val weaknesses: List<Weaknesse>
)

data class Ability(
    val name: String,
    val text: String,
    val type: String
)

data class Attack(
    val convertedEnergyCost: Int,
    val cost: List<String>,
    val damage: String,
    val name: String,
    val text: String
)

data class Cardmarket(
    val prices: Prices,
    val updatedAt: String,
    val url: String
)

data class Images(
    val large: String,
    val small: String
)

data class Legalities(
    val unlimited: String
)

data class Resistance(
    val type: String,
    val value: String
)

data class Set(
    val id: String,
    val images: ImagesX,
    val legalities: LegalitiesX,
    val name: String,
    val printedTotal: Int,
    val ptcgoCode: String,
    val releaseDate: String,
    val series: String,
    val total: Int,
    val updatedAt: String
)

data class Tcgplayer(
    val prices: PricesX,
    val updatedAt: String,
    val url: String
)

data class Weaknesse(
    val type: String,
    val value: String
)

data class Prices(
    val averageSellPrice: Double,
    val avg1: Double,
    val avg30: Double,
    val avg7: Double,
    val germanProLow: Any,
    val lowPrice: Double,
    val lowPriceExPlus: Double,
    val reverseHoloAvg1: Double,
    val reverseHoloAvg30: Double,
    val reverseHoloAvg7: Double,
    val reverseHoloLow: Double,
    val reverseHoloSell: Double,
    val reverseHoloTrend: Double,
    val suggestedPrice: Any,
    val trendPrice: Double
)

data class ImagesX(
    val logo: String,
    val symbol: String
)

data class LegalitiesX(
    val unlimited: String
)

data class PricesX(
    val holofoil: Holofoil,
    val reverseHolofoil: ReverseHolofoil
)

data class Holofoil(
    val directLow: Any,
    val high: Double,
    val low: Double,
    val market: Double,
    val mid: Double
)

data class ReverseHolofoil(
    val directLow: Double,
    val high: Double,
    val low: Double,
    val market: Double,
    val mid: Double
)
