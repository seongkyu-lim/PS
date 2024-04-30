

fun main(args: Array<String>) {
    val input = readLine()!!.toLong()
    binarySearch(input)


}


fun binarySearch(input: Long): Long {
    var minimumNum: Long = 0
    var maximumNum = input
    var mid: Long
    var optimalCnt: Long = 0

    while (minimumNum < maximumNum) {
        var cnt: Long = 0
        mid = (minimumNum + maximumNum) / 2
        
        // TODO: calculate cnt

        if (cnt <= optimalCnt) {
            optimalCnt = cnt
            minimumNum = mid + 1
        } else {
            maximumNum = mid - 1
        }
    }
    return optimalCnt
}