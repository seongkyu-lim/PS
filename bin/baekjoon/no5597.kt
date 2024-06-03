package baekjoon

fun main() {
    var list = mutableListOf<Int>()
    for (i in 1..30) list.add(i)
    for (i in 1..28) {
        val num = readln()!!.toInt()
        list.remove(num)
    }

    println(list[0])
    print(list[1])
}
