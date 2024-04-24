class Calculator {
    var n1: Double = 0.0
    var n2: Double = 0.0
    var operator: String = ""

    fun plus(n1: Double, n2: Double) = n1 + n2

    fun minus(n1: Double, n2: Double) = n1 - n2

    fun multiply(n1: Double, n2: Double) = n1 * n2

    fun divide(n1: Double, n2: Double) = n1 / n2

    fun mod(n1: Double, n2: Double) = n1 % n2
}

    fun main () {

        println("1번 숫자를 넣어주세요")
        var n1: Double = readLine()!!.toDouble()

        println("다음은 연산부호입니다")

        println("+, -, *, /, %")
        var operator: String = readLine()!!


        println("2번 숫자를 넣어주세요")
        var n2: Double = readLine()!!.toDouble()

        var cl: Double = 0.0



        when (operator) {
            "+" -> cl = Calculator().plus(n1, n2)
            "-" -> cl = Calculator().minus(n1, n2)
            "*" -> cl = Calculator().multiply(n1, n2)
            "/" -> cl = Calculator().divide(n1, n2)
            "%" -> cl = Calculator().mod(n1, n2)
        }

        println("정답은 바로?")
        println("${cl}")
    }
