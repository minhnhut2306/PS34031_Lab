package com.example.ps34031_lab.BaiTap

fun main(){
    var timbatdau = 0.0
    var timketthuc = 0.0
    var price = 20000
    var bongio = 0.15
    var happyhour = 0.10
    var totalPrice = 0.0

    do{
        print("Nhập giờ bắt đầu: ")
        var inputbatdau = readLine();
        timbatdau = inputbatdau?.toDoubleOrNull() ?: -1.0
    } while (timbatdau < 0 || timbatdau !in 7.0..23.0 )

    do{
        print("Nhập giờ kết thúc: ")
        var inputketthuc = readLine();
        timketthuc = inputketthuc?.toDoubleOrNull() ?: -1.0
    } while (timketthuc < 0 || timketthuc < timbatdau || timketthuc !in 7.0..23.0 )

    var tonggio = timketthuc - timbatdau;

    totalPrice = price * tonggio

    if ( tonggio > 3 ){
        totalPrice -= totalPrice * bongio
    }
    if (timbatdau >= 14 && timketthuc <= 16 ){
        totalPrice -= totalPrice * happyhour
    }
    if ( tonggio >3 || timbatdau >= 14 && timketthuc <= 16 ){
        totalPrice -= totalPrice * (happyhour+bongio)
    }

    println("Số tiền cần thanh toán: $totalPrice")
}
