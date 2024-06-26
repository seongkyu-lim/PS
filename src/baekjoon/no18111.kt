fun main() {
    // 마인크래프트

    /*
    해당 코틀린 코드에서 소괄호는 "destructuring declaration"을 의미합니다. Destructuring declaration은 컬렉션 또는 객체의 여러 구성 요소를 분해하여 각각의 변수에 할당할 때 사용합니다. 이 경우, readLine()!!.split(" ").map { it.toInt() }가 반환하는 리스트의 각 요소를 n, m, b 변수에 각각 할당합니다.

    이 코드를 조금 더 자세히 설명하자면:

    readLine()!! : 표준 입력에서 한 줄을 읽습니다. !!는 입력이 null이 아닌 것을 보장합니다.
    split(" ") : 입력된 문자열을 공백을 기준으로 나눕니다. 결과는 문자열 리스트입니다.
    map { it.toInt() } : 리스트의 각 문자열 요소를 정수로 변환합니다.
    val (n, m, b) : Destructuring declaration을 사용하여 리스트의 첫 번째, 두 번째, 세 번째 요소를 각각 n, m, b 변수에 할당합니다.
    즉, 이 코드는 한 줄로 입력된 세 개의 정수를 각 변수 n, m, b에 할당하는 역할을 합니다.
     */

     /*
     코틀린에서 메소드 호출 시 소괄호를 생략할 수 있는 경우는 몇 가지 특정 상황에 한정됩니다. 일반적으로 메소드 호출 시에는 소괄호를 사용해야 합니다. 하지만 람다식과 함께 사용하는 경우, 특히 map과 같은 고차 함수에서는 생략이 가능합니다.

map 메소드 호출 시 소괄호가 생략된 것처럼 보이는 이유는 코틀린의 람다 표현식 사용과 관련이 있습니다. 람다 표현식을 인자로 받는 고차 함수는 인자로 전달되는 람다를 중괄호 {}로 감싸 표현할 수 있습니다. 이러한 경우 메소드 호출의 소괄호를 생략할 수 있습니다.
     */

     /*
     코틀린에서 it 키워드는 람다식에서 사용되는 특별한 변수로, 람다식의 매개변수가 하나일 때 이를 자동으로 참조하는 역할을 합니다.
     */
    val (n: Int, m: Int, b: Int) = readLine()!!.split(" ").map { it.toInt() }
    /*
    Array(n) { ... }: 이 부분은 길이가 n인 배열을 생성합니다. 배열의 각 요소는 중괄호 { ... } 안의 내용을 통해 초기화됩니다.

    toIntArray를 빼면 List<Int> 타입.
    */
    val map: Array<IntArray> = Array<IntArray>(n) { readLine()!!.split(" ").map { it.toInt() }.toIntArray() }
    // solve(n, m, b, map)
}