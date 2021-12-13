package hw.proje
import java.lang.Exception

fun main() {
    println("print the number: ")
    val a = readLine().parseToInt()

    println("output the operation: ")
    val symbols = readLine()?.symbols()


    println("print the number: ")
    val b = readLine().parseToInt()


    val sum = when (symbols) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b // будет ошибка при делении на 0, никак не обрабатывается
        else -> "try again"
    }
    println("$sum")
}
private fun String?.parseToInt(): Int {
    if (this == null) return  0
    if (this == "") return  0

    return  try {
        this.toInt()
    } catch (e:NumberFormatException){
        println("Exception = $e")
        0
    }
}
private fun String.symbols(): String{
    when (this) { // в этом when'е нет смысла
        "+" -> '+'
        "-" -> '-'
        "*" -> '*'
        "/" -> '/'
        else -> "try again"
    }
    return this // в итоге возвращается this
}
private fun divide(a: Int, b: Int){ // нигде не используется
    println(checkingForZero(a,b))
}
private fun checkingForZero(firstOne: Int, secondOne: Int): String{
    return try {
        "Sum: numOne/numTwo" // здесь нет деления, просто строка "Sum: numOne/numTwo"
    } catch (e: Exception){
        "you can not divide by zero" // эта строка никода не вызовется
    }
}
//cal
