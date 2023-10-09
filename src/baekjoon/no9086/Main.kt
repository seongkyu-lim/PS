package baekjoon.no9086

class Main {
}

fun main() {
    val num = readln().toInt()
    for (i in 1..num) {
        val value = readln()
        println("${value[0]}${value[value.length-1]}")
    }
}