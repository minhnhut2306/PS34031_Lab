package com.example.ps34031_lab.ASM

fun main() {
    var so = 0
    do {
        println("------------------------ Menu -----------------------------")
        println("| 0. Tắt chương trình                                     |")
        println("| 1. Kiểm tra số đó có phải là số hoàn thiện hay không    |")
        println("| 2. Tạo chuỗi fibonacci từ 1 đến n                       |")
        println("| 3. Kiểm tra xem số đó có phải là số đối xứng hay không? |")
        println("| 4. Kiểm tra xem số b có chứa trong số a hay không?      |")
        println("|---------------------------------------------------------|")
        do {
            print("Nhập số 0 -> 4: ")
            var soa = readLine()
            so = soa?.toIntOrNull() ?: -1
        } while (so < 0 || so > 4)

        when (so) {
            0 -> {
                println("Đã kết thúc chương trình")
                return
            }

            1 -> kiemTraSoHoanThien()
            2 -> taoChuoiFibonacci()
            3 -> kiemTraSoDoiXung()
            4 -> kiemTraSoChuaTrongSo()
        }

        print("Tiếp tục không? (c/k): ")
        var soa = readLine()
    } while (soa != "k" && soa != "K")
    println("Đã kết thúc chương trình")
}

fun kiemTraSoHoanThien() {
    var n: Int
    do {
        print("Nhập số n: ")
        var son = readLine()
        n = son?.toIntOrNull() ?: -1
    } while (n < 0)
    var sum = 0
    for (i in 1 until n) {
        if (n % i == 0) {
            sum += i
        }
    }
    if (sum == n) {
        println("$n là số hoàn thiện.")
    } else {
        println("$n không phải là số hoàn thiện.")
    }
}

fun taoChuoiFibonacci() {
    var n: Int
    do {
        print("Nhập số n: ")
        var son = readLine()
        n = son?.toIntOrNull() ?: -1
    } while (n < 0)

    var fn1 = 0
    var fn2 = 1
    var fn = 0
    var i = 1
    println("Chuỗi Fibonacci từ 1 đến $n:")
    print("$fn1 $fn2 ")

    while (fn1 + fn2 <= n) {
        fn = fn1 + fn2
        print("$fn ")
        fn1 = fn2
        fn2 = fn
    }
    println()
}


fun kiemTraSoDoiXung() {
    var n: Int
    do {
        print("Nhập số n: ")
        var son = readLine()
        n = son?.toIntOrNull() ?: -1
    } while (n < 0)

    var sodaonguoc = 0
    var num = n

    var temp = num

    while (num > 0) {
        val chuso = num % 10
        sodaonguoc = sodaonguoc * 10 + chuso
        print(sodaonguoc)
        num /= 10
    }

    if (temp == sodaonguoc) {
        println("$n là số đối xứng.")
    } else {
        println("$n không phải là số đối xứng.")
    }
}
fun kiemTraSoChuaTrongSo() {
    var a: Int
    var b: Int
    var bina = false

    do {
        print("Nhập số a: ")
        var soa = readLine()
        a = soa?.toIntOrNull() ?: -1
    } while (a < 0)

    do {
        print("Nhập số b: ")
        var sob = readLine()
        b = sob?.toIntOrNull() ?: -1
    } while (b < 0)

    var tempb = b
    var sodemB = 0
    while (tempb != 0) {
        tempb /= 10
        sodemB++
    }
    var aTemp = a
    while (aTemp != 0) {
        var kiemtraA = aTemp % (Math.pow(10.0, sodemB.toDouble())).toInt()
        println(kiemtraA)
        if (kiemtraA == b) {
            bina = true
            break
        }
        aTemp /= 10
    }

    if (bina) {
        println("$a chứa $b")
    } else {
        println("$a không chứa $b")
    }
}
