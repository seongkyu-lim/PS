package baekjoon

import java.util.regex.Pattern

// 너의 평점은

private val WITESPACE =  Pattern.compile("\\s+")
fun main() {
    var numerator = 0.0
    var denominator = 0.0
    val gradeList = mapOf("A+" to 4.5, "A0" to 4.0, "B+" to 3.5, "B0" to 3.0, "C+" to 2.5, "C0" to 2.0, "D+" to 1.5, "D0" to 1.0, "F" to 0.0)
    for( i in 1..20) {
        val input = readLine()
        val subjectAndCreditAndGrade =  WITESPACE.split(input!!.trim())
        if (subjectAndCreditAndGrade[2].toString() == "P") continue
//        print("[1] : ${subjectAndCreditAndGrade[1]}\n")
//        print("[2] : ${subjectAndCreditAndGrade[2]}\n")
//        print("[0] : ${subjectAndCreditAndGrade[0]}\n")
        numerator += (subjectAndCreditAndGrade[1].toDouble() * gradeList.get(subjectAndCreditAndGrade[2])!!.toDouble())
        denominator += (subjectAndCreditAndGrade[1].toDouble())
//        print("numerator : $numerator\n")
//        print("denominator : $denominator\n")
//        print("----------\n")
    }
    print(numerator / denominator)
}