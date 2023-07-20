package com.example.myapplication

class Calculator : AbstractOperation {
    init {}
    constructor(): super() {

        //
    }

    override fun AddOperation(x: Double, y: Double): Double = x + y
    override fun SubstractOperation(x: Double, y: Double): Double = x - y
    override fun MultiplyOperation(x: Double, y: Double): Double = x * y
    override fun DivideOperation(x: Double, y: Double): Double = x / y
    override fun RemainderOperation(x: Double, y: Double): Double = x % y // 나머지 연산 함수 추가
}