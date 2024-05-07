package com.example.ps34031_lab.Lab.Lab2

fun main(){
    var a = 0.0
    var b = 0.0

    do {
        print("Nhập a:")
        var soa = readLine()
        a = soa?.toDoubleOrNull() ?: -1.0
    }while (a == -1.0)

    do {
        print("Nhập b:")
        var sob = readLine()
        b = sob?.toDoubleOrNull() ?: -1.0
    }while (b == -1.0)

    if(a ==0.0){
        if(b==0.0){
            print("Phương trình vô số nguyệm")
        }else{
            print("Phương trình vô nguyệm")
        }
    }else{
        var x = -b/a
        print("No x = " + x)
    }
}