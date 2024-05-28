

import java.util.ArrayList
import java.util.Stack

fun main() {
    // 스택 수열
    val n = readLine()!!.toInt()
    val arrayList = arrayListOf<Int>()
    for (i in 1 until n+1) {
        // 1이상 n이하, 중복되는 수 x
        arrayList.add(readLine()!!.toInt())
    }
    solve(arrayList)
}

// 1 부터 n까지의 수를 순서대로 stack에 넣거나 빼서 arrayList의 순서를 만들기.
fun solve(arrayList: ArrayList<Int>) {
    val stack = Stack<Int>()
    val result = ArrayList<Char>()
    var current = 1

    for (num in arrayList) {
        while (current <= num) {
            stack.push(current)
            result.add('+')
            current++
        }

        if (stack.peek() == num) {
            stack.pop()
            result.add('-')
        } else {
            println("NO")
            return
        }
    }

    for (op in result) {
        println(op)
    }
    return
}