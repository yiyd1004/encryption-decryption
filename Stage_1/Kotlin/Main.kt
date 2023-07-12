package encryptdecrypt


import kotlin.text.StringBuilder

fun main() {
    val message: String = "we found a treasure!"
    val result: StringBuilder = StringBuilder()

    for (ch in message) {
        if (ch in 'a'..'z') {
            val newChar: Char = ('z' - (ch - 'a'))
            result.append(newChar)
        } else {
            result.append(ch)
        }
    }

    println(result)
}