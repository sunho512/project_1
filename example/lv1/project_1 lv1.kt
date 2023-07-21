fun add(x: Double, y: Double): Double = x + y
fun subtract(x: Double, y: Double): Double = x - y
fun multiply(x: Double, y: Double): Double = x * y
fun divide(x: Double, y: Double): Double = x / y

fun main() {
    println("Simple Calculator")

    while (true) {
        try {
            print("Enter expression (e.g., 5 + 3): ")
            val expression = readLine()

            if (expression.equals("exit", ignoreCase = true)) {
                println("Exiting calculator.")
                break
            }

            val tokens = expression?.split(" ")
            if (tokens?.size != 3) {
                println("Invalid expression. Please try again.")
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
                else -> {
                    println("Invalid operator. Please try again.")
                    continue
                }
            }

            println("Result: $result")
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter numeric values.")
        } catch (e: Exception) {
            println("Error: ${e.message}")
        }
    }
}