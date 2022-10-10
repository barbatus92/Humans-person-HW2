fun main() {

    val likes = 3021
    val person = "человеку"
    val humans = "людям"
    val penultimateSymbol = if (likes.toString().length > 1) likes.toString()[likes.toString().length - 2] else '0'
    val ending = if (likes % 10 == 1 && penultimateSymbol != '1') person else humans

    println("Понравилось: $likes $ending")
}
