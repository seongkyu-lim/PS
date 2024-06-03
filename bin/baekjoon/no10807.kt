package baekjoon

import java.util.regex.Pattern

class no10807 {
}

private val WITESPACE =  Pattern.compile("\\s+")

fun main() {
    val N = readLine()
    val numbers = WITESPACE.split(readLine()!!.trim())
    val target = readLine()

    print(numbers.count { it == target })
}