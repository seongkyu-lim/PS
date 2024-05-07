import java.util.regex.Pattern

private val WITESPACE =  Pattern.compile("\\s+")
fun main() {
    val num = readLine()!!.toInt();
    var arr = Array(num) { Array<Int>(2) {0}}
    for (i in 1..num) {
        val nm = WITESPACE.split(readln().trim())
        arr[i-1][0] = nm[0].toInt()
        arr[i-1][1] = nm[1].toInt()
    }


    for (i in 0..num-2){
        var xMin:Int = arr[i][0]
        var yMin:Int = arr[i][1]
        for (j in (i+1)..num-1){
            if (yMin > arr[j][1]) {
                val xTemp = xMin
                val yTemp = yMin
                xMin = arr[j][0]
                yMin = arr[j][1]

                arr[j][0] = xTemp
                arr[j][1] = yTemp
            } else if (yMin == arr[j][0]) {
                if (xMin > arr[j][0]) {
                    val xTemp = xMin
                    val yTemp = yMin
                    xMin = arr[j][0]
                    yMin = arr[j][1]

                    arr[j][0] = xTemp
                    arr[j][1] = yTemp
                }
            }
        }
        arr[i][0] = xMin
        arr[i][1] = yMin
    }

    for (i in 0..num-1){
        println("${arr[i][0]} ${arr[i][1]}")
    }
}