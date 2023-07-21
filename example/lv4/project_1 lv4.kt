package com.example.myapplication
fun main() {
    println("간단 계산기")

    while (true) {
        try {
            print("값을 넣어 주세요 ex(1 + 1) :")
            val expression = readLine()

            if (expression.equals("exit", ignoreCase = true)) {
                println("계산기를 종료합니다.")
                break
            }

            val tokens = expression?.split(" ")
            if (tokens?.size != 3) {
                println("잘못된 값입니다. 다시 시도해 주세요.")
                continue
            }

            val num1 = tokens[0].toDouble()
            val operator = tokens[1]
            val num2 = tokens[2].toDouble()

            val myCalculator = Calculator();

            val result = when (operator) {
                "+" -> myCalculator.AddOperation(num1, num2)
                "-" -> myCalculator.SubstractOperation(num1, num2)
                "*" -> myCalculator.MultiplyOperation(num1, num2)
                "/" -> myCalculator.DivideOperation(num1, num2)
                "%" -> myCalculator.RemainderOperation(num1, num2) // 나머지 연산 추가
                else -> {
                    println("잘못된 연산자입니다. 다시 시도해 주세요.")
                    continue
                }
            }

            println("결과는: $num1 와 $num2 의 결과 값은 $result")
        } catch (e: NumberFormatException) {
            println("유효하지 않은 입력입니다. 숫자 값을 입력해주세요.")
        } catch (e: Exception) {
            println("에러 발생: ${e.message}")
        }
    }
}
