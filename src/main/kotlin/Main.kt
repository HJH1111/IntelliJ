open class Calculator {
    open fun calculate(n1: Double, n2: Double): Double {
        return 0.0
    }
}

class Plus : Calculator() {
    override fun calculate(n1: Double, n2: Double): Double {
        return n1 + n2
    }
}

class Minus : Calculator() {
    override fun calculate(n1: Double, n2: Double): Double {
        return n1 - n2
    }
}

class Multiply : Calculator() {
    override fun calculate(n1: Double, n2: Double): Double {
        return n1 * n2
    }
}

class Divide : Calculator() {
    override fun calculate(n1: Double, n2: Double): Double {
        return n1 / n2
    }
}

class Mod : Calculator() {
    override fun calculate(n1: Double, n2: Double): Double {
        return n1 % n2
    }
}

fun main() {
    var reload = true

    while (reload) {
        println("1번 숫자를 넣어주세요")
        var n1: Double = readLine()!!.toDouble()

        println("다음은 연산부호입니다")

        println("+, -, *, /, %")
        var operator: String = readLine()!!

        println("2번 숫자를 넣어주세요")
        var n2: Double = readLine()!!.toDouble()

        var cl: Double = 0.0



        when (operator) {
            "+" -> cl = Plus().calculate(n1, n2)
            "-" -> cl = Minus().calculate(n1, n2)
            "*" -> cl = Multiply().calculate(n1, n2)
            "/" -> cl = Divide().calculate(n1, n2)
            "%" -> cl = Mod().calculate(n1, n2)
        }


        println("정답은 바로?!?!?!")
        println("${cl}")

        println("한번더? Y/N")
        val onemore = readLine()!!
        if (onemore != "Y") {
            reload = false
        }
    }
}


//
//
//
//
//
//
//
//
//
//
//
//
//
