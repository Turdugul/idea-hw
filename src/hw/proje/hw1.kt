package hw.proje

fun sort(sampleArray: IntArray) {
    val n = sampleArray.size
    var temp: Int
    for (i in 0 until n) {
        var indexOfMin = i
        for (j in n - 1 downTo i) {
            if (sampleArray[j] < sampleArray[indexOfMin])
                indexOfMin = j
        }
        if (i != indexOfMin) {
            temp = sampleArray[i]
            sampleArray[i] = sampleArray[indexOfMin]
            sampleArray[indexOfMin] = temp
        }
    }
}

fun main(arg: Array<String>) {
    println("Before Sort")
    val a = intArrayOf(-77, -88, -99, -55, -22, -33, -1, -4, -456)
    for (i in a) print(i)

    sort(a)

    println("Sorted array is : ")
    for (i in a) print(i)
}

