fun countXO(string: String): Boolean {
    var i = 0
    var countX = 0
    var countO = 0
    val stringLower = string.lowercase()

    while (i<string.length){
        if (stringLower[i] =='x'){
            countX++

        } else if (stringLower[i] =='o'){
            countO++
        }
        i++
    }

    return countO ==countX &&countO!=0
}

fun exception(){
    throw Exception()
}

fun main() {
 println(countXO("xxoo"))
 println(countXO("xxxo"))
}