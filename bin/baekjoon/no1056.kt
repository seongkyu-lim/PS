

fun main() {
    val input = readLine()!!.toLong()

    if (input == 1L) print(0)


    dp[input] = input - 1L

    for (i in 1..62) {
        T1 = mina(input, i, true)
        d1 = dev_con(T1, i)
        T2 = mina(input, i, false)
        d2 = dev_con(T2, i)

        if (T1 >= input or T2 >= input) continue

    
        dp[input] = min
    }




fun binarySearch(input: Long): Long {
    var minimumNum: Long = 0
    var maximumNum = input
    var mid: Long
    var optimalCnt: Long = 0

    while (minimumNum < maximumNum) {
        var cnt: Long = 0
        mid = (minimumNum + maximumNum) / 2
        
        var value = 1
        while (value <= input) {
            value *= value 
            cnt = 1
        }
        
        
        cnt += if (input-value > ((value*value)-input)) ((value*value) - input) else (input-value) 

        println("cnt: $cnt")
        println("optimalCnt: $optimalCnt")

        if (cnt <= optimalCnt) {
            optimalCnt = cnt
            minimumNum = mid + 1
        } else {
            maximumNum = mid - 1
        }
    }
    return optimalCnt
}