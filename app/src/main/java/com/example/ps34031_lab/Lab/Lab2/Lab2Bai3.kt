package com.example.ps34031_lab.Lab.Lab2

fun main() {
    var year = 0
    var s: String?

    do {
        print("Nhập năm: ")
        s = readLine()
        year = s?.toIntOrNull() ?: -1
        while (year == null || year < 0) {
            print("Nhập sai năm, nhập lại: ")
            s = readLine()
            year = s?.toIntOrNull() ?: -1
        }

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp tục không? (c/k): ")
        s = readLine()
    } while (s != "k" && s != "K")

    println("Kết thúc chương trình")
}
