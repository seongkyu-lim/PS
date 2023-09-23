import java.util.regex.Pattern

class no25304 {
}

private val WITESPACE =  Pattern.compile("\\s+")
fun main() {
    var total = readLine()!!.toInt()
    var calNum = 0;

    var numberOfCategory = readLine()!!.toInt()
    for (i in 1..numberOfCategory) {
        var input = readLine()
        val priceAndCount = WITESPACE.split(input!!.trim())
        calNum += priceAndCount[0].toInt() * priceAndCount[1].toInt()
    }
    if (total == calNum) print("Yes")
    else print("No")
}