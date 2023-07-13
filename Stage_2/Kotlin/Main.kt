package encryptdecrypt


import kotlin.text.StringBuilder

fun main() {
    val message: String = readln()
    val shift: Int = readln().toInt() % 26
    val result: StringBuilder = StringBuilder()

    for (ch in message) {
        var code: Int = ch.code
        if (Character.isAlphabetic(code)) {
            code = code - 'a'.code + shift
            if (code >= 26) {
                code %= 26
            }
            code += 'a'.code
        }
        result.append(code.toChar())
    }
    println(result)
}