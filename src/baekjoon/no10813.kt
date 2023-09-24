package baekjoon

import java.util.regex.Pattern

private val WITESPACE =  Pattern.compile("\\s+")
fun main() {
    val nm = WITESPACE.split(readln()!!.trim())
    var list = Array(nm[0].toInt()) {it+1}
    for (i in 1..nm[1].toInt()) {
        val ij = WITESPACE.split(readln()!!.trim())
        val target = list[ij[1].toInt()-1]
        list[ij[1].toInt()-1] = list [ij[0].toInt()-1]
        list[ij[0].toInt()-1] = target
    }

    var answer = ""
    for (item in list) {
        answer += "$item "
    }

    print(answer)
}