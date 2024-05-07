package com.example.ps34031_lab.Lab.Lab1

fun main() {
    var a = 0.0
    var b = 0.0

    do {
        print("Nhập a:")
        var soa = readLine()
        a = soa?.toDoubleOrNull() ?: -1.0
    } while (a < 0)

    do {
        print("Nhập b:")
        var sob = readLine()
        b = sob?.toDoubleOrNull() ?: -1.0
    } while (b < 0)

    println("Tổng: " + (a + b))
    println("Hiệu: " + (a - b))
    println("Tích: " + (a * b))
    println("Thương: " + (a / b))
}
