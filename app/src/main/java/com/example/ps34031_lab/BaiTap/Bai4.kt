package com.example.ps34031_lab.BaiTap

fun main() {
    var sotien = 0.0
    do {
        println("Nhập số tiền: ")
        var inputtien = readLine()
        sotien = inputtien?.toDoubleOrNull() ?: -1.0
    } while (sotien < 0.0)
    println("Số tiền là: $sotien")
    var sotienphaitra: Double
    var tiengocphaitra: Double
    var tiengocconlai: Double
    var tienlai: Double

    tiengocphaitra = sotien / 6.0
    for (i in 1..6) {
        tiengocconlai = sotien - tiengocphaitra
        tienlai = sotien * 0.01
        sotienphaitra = tiengocphaitra + tienlai
        println("Tháng $i -- Số tiền gốc còn lại $tiengocconlai -- Tiền gốc phải trả $tiengocphaitra -- Tiền lãi $tienlai -- Số tiền phải trả ${sotienphaitra}")
        sotien = tiengocconlai
    }
}
