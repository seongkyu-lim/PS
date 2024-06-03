package baekjoon

import java.util.regex.Pattern

class no11382 {
}

private val WITESPACE =  Pattern.compile("\\s+")
fun main() {
    var input = readLine()
    val numbers = WITESPACE.split(input!!.trim())
    print(numbers.map{ it.toLongOrNull() ?: 0}.sum())
}