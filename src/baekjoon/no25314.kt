package baekjoon

class no25314 {
}
fun main() {
    val byte = readLine()!!.toInt()
    var answer = "int"
    for (i in 1..byte/4) {
        answer = "long " + answer
    }

    print(answer)
}