package com.example.myapplication

abstract class AbstractOperation() {
    abstract fun AddOperation(x: Double, y: Double): Double;
    abstract fun SubstractOperation(x: Double, y: Double): Double;
    abstract fun MultiplyOperation(x: Double, y: Double): Double;
    abstract fun DivideOperation(x: Double, y: Double): Double;
    abstract fun RemainderOperation(x: Double, y: Double): Double;
}