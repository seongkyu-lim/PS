package baekjoon

import java.util.regex.Pattern

class no2480 {
}

private val WITESPACE =  Pattern.compile("\\s+")
fun main() {
    var input = readLine()
    val inputList = WITESPACE.split(input!!.trim())
    val inputListWithTypeInt = inputList.map { it.toInt() }


    var value = 0

    if (inputListWithTypeInt[0] == inputListWithTypeInt[1] && inputListWithTypeInt[1] == inputListWithTypeInt[2]) {
        value += 10000
        value += inputListWithTypeInt[0] * 1000
    } else if ((inputListWithTypeInt[0] == inputListWithTypeInt[1] && inputListWithTypeInt[1] != inputListWithTypeInt[2]) || (inputListWithTypeInt[0] == inputListWithTypeInt[2] && inputListWithTypeInt[0] != inputListWithTypeInt[1]) || (inputListWithTypeInt[1] == inputListWithTypeInt[2] && inputListWithTypeInt[1] != inputListWithTypeInt[0])) {
        value += 1000
        if (inputListWithTypeInt[0] == inputListWithTypeInt[1] && inputListWithTypeInt[1] != inputListWithTypeInt[2]) value += 100 * inputListWithTypeInt[0]
        if (inputListWithTypeInt[0] == inputListWithTypeInt[2] && inputListWithTypeInt[0] != inputListWithTypeInt[1]) value += 100 * inputListWithTypeInt[0]
        if (inputListWithTypeInt[1] == inputListWithTypeInt[2] && inputListWithTypeInt[1] != inputListWithTypeInt[0]) value += 100 * inputListWithTypeInt[1]
    } else {
        var max = inputListWithTypeInt[0]
        inputListWithTypeInt.forEach {number -> if (number > max) max = number}
        value += 100 * max
    }

    print(value)

}