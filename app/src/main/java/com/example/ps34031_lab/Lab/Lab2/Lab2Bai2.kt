package com.example.ps34031_lab.Lab.Lab2

fun main() {
    var month = 0
    do {
        print("Nhập tháng: ")
        var s = readLine()
        month = s?.toIntOrNull() ?: -1
    } while (month < 1 || month > 12)

    if (month in 1..3) {
        println("Tháng $month thuộc quý 1")
    } else if (month in 4..6) {
        println("Tháng $month thuộc quý 2")
    } else if (month in 7..9) {
        println("Tháng $month thuộc quý 3")
    } else if (month in 10..12) {
        println("Tháng $month thuộc quý 4")
    } else {
        println("Tháng $month không hợp lệ")
    }


}
