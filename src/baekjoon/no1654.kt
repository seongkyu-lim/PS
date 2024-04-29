package baekjoon

import java.util.regex.Pattern

lateinit var lanCable: Array<Int>
private val WITESPACE =  Pattern.compile("\\s+")
fun main(args: Array<String>) {
    val input = readLine()
    val kAndN = WITESPACE.split(input!!.trim())

    lanCable= Array(kAndN[0].toInt()) {0}
    lanCable.forEachIndexed { index, it -> lanCable[index] = readLine()!!.toInt()  }
    lanCable.sort()

    println(binarySearch(kAndN[0].toLong(), kAndN[1].toLong()))
}

fun binarySearch(k: Long, n: Long): Long {
    var minimumLan:Long = 0
    var maximumLan:Long = lanCable[lanCable.lastIndex] + 1.toLong()
    var mid: Long = 0
    var count: Long = 0

    while (minimumLan < maximumLan) {
        mid = (minimumLan + maximumLan) / 2
        count = 0

        lanCable.forEach { count += it / mid }

        if ( count < n) maximumLan = mid
        else minimumLan = mid + 1
    }
    return minimumLan-1
}
