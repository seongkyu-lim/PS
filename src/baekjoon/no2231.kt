fun main() {
 val n = readLine()!!.toInt()
 var cnt = findCnt(n)
//  println("cnt :: $cnt")
 println(findGenerator(cnt, n))
}

fun findCnt(target: Int): Int {
    var digitNumber = 1
    while(true) {
        // println("digitNumber :: $digitNumber")
        if ((("9".repeat(digitNumber)).toInt() + 9*digitNumber) > target) {
            return if (digitNumber == 1) 1 else ("9".repeat(digitNumber-1)).toInt()
        }
        digitNumber++
    }
}

fun findGenerator(cnt: Int, n: Int): Int {
    var decompositionReaction = cnt
    var target = cnt
    while(true) {
        for (value in decompositionReaction.toString()) decompositionReaction += Character.getNumericValue(value)
        // println("decompositionReaction :: $decompositionReaction")

        if (decompositionReaction == n) return target
        else if (decompositionReaction > n) return 0

        decompositionReaction = ++target
    }
}

