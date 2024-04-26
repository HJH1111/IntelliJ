# 계산기


계산기 작동법


Main.kt에 있는 계산기 작동법입니다

fun main() 함수에서 실행 할 수 있습니다 

1번 숫자를 넣어주세요 에서 숫자를 넣습니다

다음은 연산부호입니다 여기서는 + - * / % 중 하나를 골라 넣습니다

2번 숫자를 넣어주세요 에서 두 번째 숫자를 넣습니다

그러면 정답은 바로?!?!?! 이 메세지가 뜨면서 정답이 나옵니다

한번더? Y/N에서 Y를 넣으면 다시 실행됩니다

---

문제점: N을 넣어야 끝이 나야 하는데 다른 걸 넣어도 끝이 나는 현상이 있습니다

이 부분은 기술 부족으로 구현하지 못하였습니다

---

### 작동원리

open class Calculator {
    open fun calculate(n1: Double, n2: Double): Double {
        return 0.0
    }

Calculator 클래스는 기본 클래스이며 calculate 메서드는 Double 타입 매개변수를 받아 계산하고 결과를 반환합니다

---

  class Plus : Calculator() {
    override fun calculate(n1: Double, n2: Double): Double {
        return n1 연산부호 n2
    }
}

Calculator 클래스를 상속하고, calcuratoe 매서드를 오버라이드 하여 연산합니다

---

 println("1번 숫자를 넣어주세요")
        var n1: Double = readLine()!!.toDouble()

첫 번째 숫자 n1을 입력받습니다

---

        println("다음은 연산부호입니다")

        println("+, -, *, /, %")
        var operator: String = readLine()!!

연산부호를 입력받습니다

---

        println("2번 숫자를 넣어주세요")
        var n2: Double = readLine()!!.toDouble()

두 번째 숫자 n2을 입력받습니다

---

        var cl: Double = 0.0

변수 cl을 선언하고 Double 타입으로 초기화 합니다

---

when (operator) {
            "+" -> cl = Plus().calculate(n1, n2)
            "-" -> cl = Minus().calculate(n1, n2)
            "*" -> cl = Multiply().calculate(n1, n2)
            "/" -> cl = Divide().calculate(n1, n2)
            "%" -> cl = Mod().calculate(n1, n2)
        }

when을 사용하여 calculate 메서드를 불러옵니다

계산결과를 변수 cl에 저장합니다

---

 println("정답은 바로?!?!?!")
        println("${cl}")

계산 결과를 출력합니다

---

fun main() {
    var reload = true

    while (reload) {
    
        println("한번더? Y/N")
        val onemore = readLine()!!
        if (onemore != "Y") {
            reload = false
        }
    }
}

while을 사용하여 reload를 false로 설정할 때까지 계속 반복합니다
