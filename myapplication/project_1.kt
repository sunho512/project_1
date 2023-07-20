package com.example.myapplication


/*
 * 일단 클래스를 사용하는 목적 그리고 추상화에 대해 간단히 설명을 해보자고
 * 보고있나?
 *
 * 아
 * 나는 들을수없는상태인거같은데
 * 지금까지 너말만 못듣고잇엇던듯?
 * 아래로 내려가자 걍
 */


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
