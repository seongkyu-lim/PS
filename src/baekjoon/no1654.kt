package baekjoon

import java.util.regex.Pattern

private val WITESPACE =  Pattern.compile("\\s+")
fun main(args: Array<String>) {
    val input = readLine()
    val kAndN = WITESPACE.split(input!!.trim())
    var lanCable= Array(kAndN[0].toInt()) {0}
    for (idx in 0 .. kAndN[0].toInt()) {
        lanCable[idx] =readLine()!!.toInt()
    }
    lanCable.sort()

}