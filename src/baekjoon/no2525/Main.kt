package baekjoon.no2525

import java.util.regex.Pattern

class Main {
}

private val WITESPACE =  Pattern.compile("\\s+")
fun main() {
    val hourAndMinute = readLine()
    var hourAndMinuteList = WITESPACE.split(hourAndMinute!!.trim())
    var hour = hourAndMinuteList[0].toInt()
    var minute = hourAndMinuteList[1].toInt() + readLine()!!.toInt()

    hour += minute / 60
    minute = minute % 60

    if (hour >= 24) hour -= 24

    print("${hour} ${minute}")
}