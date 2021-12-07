package hw.proje

//Оконбаева Турдугүл.homework4

fun main() {
    var count = 0
    var number = readLine().parseToInt()
    while (number != 0){
        number /= 10
        ++count
    }
    println("колчество цифр -> $count")
}
private fun String?.parseToInt(): Int {
    if (this == null) return 0
    if (this == "") return 0

    return try {
        this.toInt()
    }catch (e: NumberFormatException) {
        println("exeption=$e")
        0
    }catch (e: NumberFormatException){
        0
    }
}