package  baekjoon.no2444

class Main {

}

fun main(){
    var input = readln().toInt()
    for ( i in 1..input) {
        printStar(2*i-1, input)
    }

    for (i in input-1 downTo 1) {
        printStar(2*i-1, input)
    }

}

fun printStar(num: Int, input: Int) {
    for ( i in 1 .. input-((num-1)/2 +1)) {
        print(' ')
    }
    for ( i in 1..num) {
        if (i == num) println('*')
        else print('*')
    }
}