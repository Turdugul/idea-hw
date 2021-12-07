package hw.proje


//Okonbaeva Turdugul 2/homework


fun main() {
    val num = readLine()!!.toInt()
    val x0 = num / 1000 % 10
    val x1 = num / 100 % 10
    val x2 = num / 10 % 10
    val x3 = num % 10

    val result = x0+x1 == x2+x3

    println(result)


}
