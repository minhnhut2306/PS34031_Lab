package com.example.ps34031_lab.BaiTap

fun main() {
    var sophut= 0
    var phi = 75000
    val nammuoiphut = 700
    val mottramphut = 500
    val mottramnammuoiphut = 300

    do {
        print("Nhập số phút: ")
        val sophutInput = readLine()
        sophut = sophutInput?.toIntOrNull() ?: -1
    } while ( sophut < 0.0)

    var phisd = phi
    if (sophut > 50) {
        phisd += sophut * nammuoiphut
    } else if (sophut > 150) {
        phisd += (sophut * nammuoiphut)+(sophut *mottramphut) +(sophut*mottramnammuoiphut)
    } else {
        phisd += (sophut * mottramphut)+(sophut *nammuoiphut)
    }
    println("Số tiền sử dụng là $phisd")

}