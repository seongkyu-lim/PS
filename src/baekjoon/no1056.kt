

fun main() {
    val input = readLine()!!.toLong()
    print(binarySearch(input))
}


fun binarySearch(input: Long): Long {
    var minimumNum: Long = 0
    var maximumNum = input
    var mid: Long
    var optimalCnt: Long = 0

    while (minimumNum < maximumNum) {
        var cnt: Long = 0
        mid = (minimumNum + maximumNum) / 2
        
        var value = 0
        while (value <= input) {
            value *= value
            cnt++
        }
        
        cnt += if (input-value > ((value*value)-input)) ((value*value) - input) else (input-value) 

        if (cnt <= optimalCnt) {
            optimalCnt = cnt
            minimumNum = mid + 1
        } else {
            maximumNum = mid - 1
        }
    }
    return optimalCnt
}