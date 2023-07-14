package encryptdecrypt


import kotlin.text.StringBuilder

fun main() {
    val cmd: String = readln()
    val message: String = readln()
    var shift: Int = readln().toInt() % 26
    val result: StringBuilder = StringBuilder()

    shift = if (cmd == "dec") shift * -1 else shift
    for (ch in message) {
        var code: Int = ch.code + shift
        result.append(code.toChar())
    }
    println(result)
}