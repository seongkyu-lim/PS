package baekjoon.no10988

class Main {

}

fun main() {
    print(checkPalindrome(readln()))
}

fun checkPalindrome(input: String): Int {
    for (idx in 0 .. input.length/2-1) {
        if (input[idx] !== input[input.length-idx-1]) return 0
    }
    return 1
}