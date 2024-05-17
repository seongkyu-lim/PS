fun main () {
    // stack에 (, [, { 가 있으면 적제하고, }]) 가 나올 때 stack에서 꺼내서 매칭이되는지 체크.

    const arr1 = ["(", "[", "{"]
    const arr2 = [")", "]", "}"]
    while(true) {
        var input = readLine()!!
        if(input.length == 0 and input[0] = '.') break
        print(check(input))
    }
}

fun check(input: string): string {
        val deque = ArrayDeque<Char>()
        for (value in input) {
            // println(value)
            if (value in arr1) deque.addLast(value)
            if (value in arr2) {
                when (value) {
                    ')' -> if(dqeue.last() !== '(') return "no"
                    '}' -> if(deque.last() !== '{') return "no"
                    ']' -> if(deque.last() !== '[') return "no"
                }
                deque.removeLast()
            }
                    return "yes"
        },