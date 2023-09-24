package baekjoon

import java.util.regex.Pattern

private val WITESPACE =  Pattern.compile("\\s+")
fun main() {
    val nAndM = WITESPACE.split(readln().trim())

    val list = Array(nAndM[0].toInt()) { 0 }

    for (i in 1..nAndM[1].toInt()) {
        val ijk = WITESPACE.split(readln().trim())
        for (j in ijk[0].toInt()..ijk[1].toInt()) {
            list[j-1] = ijk[2].toInt()
        }
    }

    var answer = ""
    for (item in list) answer += "$item "

    print(answer)
}
