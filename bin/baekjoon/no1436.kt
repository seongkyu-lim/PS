package baekjoon

fun main(args: Array<String>) {
    // n번째로 작은 종말의 수
    val input = readLine()!!.toInt()
    var number = 666
    var cnt = 1
    while(true) {
        if (cnt === input && isEndNumber(number.toString())) {
            print(number)
            break
        } else if (cnt < input && isEndNumber(number.toString())) cnt++
        number++
    }
}

fun isEndNumber(number: String): Boolean {
    for(idx in 0 ..  number.length - 1) {
        if (number.length-1 < idx+2) return false
        if(number[idx]=== '6'&& number[idx +1] === '6' && number[idx+2] === '6') return true
    }
    return false
}