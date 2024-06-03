package baekjoon.no10811

import java.util.regex.Pattern

class Main {
}

private val WITESPACE =  Pattern.compile("\\s+")
fun main() {
    var nm = WITESPACE.split(readLine()!!.trim())
    var arr = Array(nm[0].toInt()) {it+1}
    for (x in 1..(nm[1].toInt())) {
        var ij = WITESPACE.split(readLine()!!.trim())
        var copiedPartialArray = arr.copyOf()
        for (y in ij[0].toInt()-1.. ij[1].toInt()-1) {
            arr[y] = copiedPartialArray[ij[1].toInt()-1 - (y-(ij[0].toInt()-1))]
        }
    }
    for (x in arr) {
        print("$x ")
    }
}