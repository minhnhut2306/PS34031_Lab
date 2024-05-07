package com.example.ps34031_lab.BaiTap


fun main() {
    var a = 0.0
    var b = 0.0
    var c = 0.0
    val diemToiDa = 10.0

    do {
        print("Nhập điểm 15 phút: ")
        val input = readLine()
        a = input?.toDoubleOrNull() ?: -1.0
    } while (a > diemToiDa || a < 0.0)

    do {
        print("Nhập điểm giữa kỳ: ")
        val input = readLine()
        b = input?.toDoubleOrNull() ?: -1.0
    } while (b > diemToiDa || b < 0.0)

    do {
        print("Nhập điểm cuối kỳ: ")
        val input = readLine()

        c = input?.toDoubleOrNull() ?: -1.0
    } while (c > diemToiDa || c < 0.0)

    val dtb = (a + b * 2 + c * 3) / 6

    if (dtb >= 9.5) {
        println("Học lực xuất sắc")
    } else if (8 <= dtb && dtb <= 9.4) {
        println("Học lực giỏi")
    } else if (6 <= dtb && dtb <= 7.9) {
        println("Học lực Khá")
    } else if (4 <= dtb && dtb <= 5.9) {
        println("Học lực trung bình")
    } else if (0 <= dtb && dtb <= 3.9) {
        println("Học lực yếu")
    }

}