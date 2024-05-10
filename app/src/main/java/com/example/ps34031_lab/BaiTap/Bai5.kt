package com.example.ps34031_lab.BaiTap

import kotlin.math.*

fun main() {
    var x = 0
    var n = 20
    var S1 = 0
    var S2 = 0
    var S3 = 0.0
    var S4 = 0.0
    var num = n
    var sum = 0
    do {
        println("1........")
        println("2........")
        println("3........")
        println("4........")
        println("5........")
        println("6........")
        println("7........")
        println("8........")
        print("Nhập số 1-->8: ")
        var so  = readLine()
        x = so?.toIntOrNull() ?: -1
        while (x < 1 || x > 8) {
            print("Nhập số 1-->8: ")
            so  = readLine()
            x = so?.toIntOrNull() ?: -1
        }
        when (x) {
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
        }
        println("")
        print("Tiếp tục không? (c/k): ")
                    so = readLine ()
        } while ( so != "k" && so != "K")
        println("Kết thúc chương trình")
    }
