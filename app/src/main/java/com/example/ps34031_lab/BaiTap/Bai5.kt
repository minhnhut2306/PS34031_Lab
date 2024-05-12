package com.example.ps34031_lab.BaiTap

import kotlin.math.*

fun main() {
    var x = 0
    var n = 0
    var S1 = 0
    var S2 = 0
    var S3 = 0.0
    var S4 = 0.0
    var num = n
    var sum = 0
    do {
        println("----------------------- Menu ----------------------------")
        println("| 0. Tắt chương trình                                   |")
        println("| 1. Cac số phạm vi từ 1 đến n                          |")
        println("| 2. Các số chẵn từ 1 đến n                             |")
        println("| 3. Các số lẽ không chia hết cho 3 từ 1 đến n          |")
        println("| 4. Tính biểu thức S1 = 1+2+3 ....n                    |")
        println("| 5. Tính biểu thức S2 = -1+2-3+4 .... (-1)^n*n         |")
        println("| 6. Tính biểu thức S3 = 1/2 + 2/3 + 3/4 ... + n(n+1)   |")
        println("| 7. Tính biểu thức x^n                                 |")
        println("| 8. Tính tổng các chữ số n                             |")
        println("| 10.Kiểm tra số a là chẵn hay lẽ                       |")
        println("| 11.Kiểm tra các chữ số nguyên dương a có giảm dần     |")
        println("| trái sang phải không                                  |")
        println("|--------------------------------------------------------")
        print("Nhập n: ")
        var son = readLine();
        n = son?.toIntOrNull() ?: -1
        while (n < 0) {
            print("Nhập số n: ")
            son = readLine()
            n = son?.toIntOrNull() ?: -1
        }

        print("Nhập số 0 --> 8: ")
        var so = readLine()
        x = so?.toIntOrNull() ?: -1
        while (x < 0 || x > 11) {
            print("Nhập số 0 --> 8: ")
            so = readLine()
            x = so?.toIntOrNull() ?: -1
        }
        when (x) {
            0 -> {
                println("Đã tắt chương trình ")
                break
            }

            1 -> {
                print("Các số từ 1 đến $n là")
                for (i in 1..n) {
                    print(" $i ")
                }

            }

            2 -> {
                print("Các số chẵn từ 1 đến $n là ")
                for (i in 1..n) {
                    if (i % 2 == 0) {
                        print(" $i ")
                    }
                }
            }

            3 -> {
                print("Các số lẽ không chia hết cho 3 1 đến $n là ")
                for (i in 1..n) {
                    if (i % 3 != 0 && i % 2 != 0) {
                        print(" $i ")
                    }
                }
            }

            4 -> {
                print("Biểu thức S1 là:  ")
                for (i in 1..n) {
                    S1 += i
                }
                print(" $S1 ")
            }

            5 -> {
                print("Biểu thức S2 là:  ")
                for (i in 1..n) {
                    if (i % 2 == 0) {
                        S2 += i
                    } else {
                        S2 -= i
                    }
                }
                print(" $S2 ")
            }

            6 -> {
                print("Biểu thức S3 là:  ")
                for (i in 1 until n) {
                    S3 += i.toDouble() / (i + 1)
                    print("SO $S3")
                }
                print(" $S3 ")
            }

            7 -> {
                print("Nhập x: ")
                val x = readLine()?.toDoubleOrNull() ?: 0.0
                S4 = x.pow(n)
                print("Biểu thức S4 là: $S4")
            }

            8 -> {
                while (num > 0) {
                    val x = num % 10
                    sum += x
                    num /= 10
                }
                println("Tổng các chữ số của $n là $sum")
            }
            9 ->{
                var a = 0
                print("Nhập số nguyên dương: ")
                var soa = readLine();
                a = soa?.toIntOrNull() ?: -1
                while (a>=10){
                    a /= 10
                }
                print("Số đầu tiên là $a")
            }
            10 ->{
                var a = 0
                print("Nhập số nguyên dương: ")
                var soa = readLine();
                a = soa?.toIntOrNull() ?: -1
                if (a %2 == 0){
                    print("Số $a là số chẵn")
                }else{
                    print("Số $a là số lẽ")
                }
            }
            11 ->{
                var a = 0
                print("Nhập số nguyên dương: ")
                var soa = readLine()
                a = soa?.toIntOrNull() ?: -1
                val stringa = a.toString()
                var sogiam = true
                for (i in 0  until stringa.length -1){
                    if (stringa[i] < stringa[i+1]){
                        sogiam = false
                        break
                    }
                }
                if (sogiam) {
                    println("$a có các chữ số giảm dần từ trái sang")
                } else {
                    println("$a không có các chữ số giảm dần từ trái sang")
                }

            }
        }
        println("")
        print("Tiếp tục không? (c/k): ")
        so = readLine()
    } while (so != "k" && so != "K")
    println("Đã kết thúc chương trình")
}
