package baekjoon.no3003

import java.util.regex.Pattern

class Main {
}

fun main() {
    var input = readLine()!!.split(" ").map {it.toInt()}
    var list = intArrayOf(1,1,2,2,2,8)

    var answer = ""
    for (index in input.indices ) {
        answer += (list[index] - input[index]).toString()+" "
    }

    print(answer)

}