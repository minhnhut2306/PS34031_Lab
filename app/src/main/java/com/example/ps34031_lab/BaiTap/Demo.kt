package com.example.ps34031_lab.BaiTap

fun main() {
    val n = 125
    var number = n
    var sum = 0

    while (number > 0) {
        val digit = number % 10
        sum += digit
        number /= 10
    }

    println("Tổng các chữ số của $n là $sum")
}
