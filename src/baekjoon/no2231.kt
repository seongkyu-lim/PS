fun main() {
 val n = readLine()!!.toInt()
 var cnt = findCnt(n)
 println(findGenerator(cnt, n))
}

fun findCnt(target: Int): Int {
    var digitNumber = 1
    while(true) {
        if ((("9".repeat(digitNumber)).toInt() + 9*digitNumber) > target) return ("9".repeat(digitNumber-1)).toInt() + 9*(digitNumber-1)
        digitNumber++
    }
}

fun findGenerator(cnt: Int, n: Int): Int {
    var decompositionReaction = cnt
    var target = cnt
    while(true) {
        for (value in decompositionReaction.toString()) {
            decompositionReaction += value.code
        }
        if (decompositionReaction == n) return target
        else if (decompositionReaction > n) return 0

        target++
    }
}

