
private val arr1 = arrayOf("(", "[")
private val arr2 = arrayOf(")", "]")

fun main () {
    // stack에 (, [, { 가 있으면 적제하고, }]) 가 나올 때 stack에서 꺼내서 매칭이되는지 체크.
    while(true) {
        val input = readLine()!!
        // println("input.length : ${input.length} / input.contains('.') : ${input.contains('.')}")
        if(input.length == 1 && input.contains('.')) break
        println(check(input))
    }
}

fun check(input: String): String {
        // println("========== check ===========")

        val deque = ArrayDeque<String>()
        for (value in input) {
            // println(value)
            if (value.toString() in arr1) deque.addLast(value.toString())
            if (value.toString() in arr2) {
                // print( "deque.last() : ${deque.last()} / ${deque.last() !== "("}" )
                if (deque.isEmpty()) return "no"
                when (value.toString()) {
                    ")" -> if(deque.last() != "(") return "no"
                    "}" -> if(deque.last() != "{") return "no"
                    "]" -> if(deque.last() != "[") return "no"
                }
                deque.removeLast()
            }
            // println("deque : ${deque}")
        }
        // println("========== check finish ===========")
        return "yes"
}

/*
반례

([)].
.

 */