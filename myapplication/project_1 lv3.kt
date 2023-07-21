package com.example.myapplication

fun add(x: Double, y: Double): Double = x + y
fun subtract(x: Double, y: Double): Double = x - y
fun multiply(x: Double, y: Double): Double = x * y
fun divide(x: Double, y: Double): Double = x / y
fun remainder(x: Double, y: Double): Double = x % y // 나머지 연산 함수 추가

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

            val result = when (operator) {
                "+" -> add(num1, num2)
                "-" -> subtract(num1, num2)
                "*" -> multiply(num1, num2)
                "/" -> divide(num1, num2)
                "%" -> remainder(num1, num2) // 나머지 연산 추가
                else -> {
                    println("잘못된 연산자입니다. 다시 시도해 주세요.")
                    continue
                }
            }

            println("결과는: $result")
        } catch (e: NumberFormatException) {
            println("유효하지 않은 입력입니다. 숫자 값을 입력해주세요.")
        } catch (e: Exception) {
            println("에러 발생: ${e.message}")
        }
    }
}
