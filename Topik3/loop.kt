package Chapter1.Topik3

fun main() {
    val range = 0..100
    for (i in range) {
        println(i)
    }

    println()

    for ((k, v) in range.withIndex()) {
        println("$k - $v")
    }

    println()

    range.forEach {
        println(it)
    }

    println()

    range.forEachIndexed { index, i ->
        println("$index - $i")
    }

    var nilai = 1
    while(nilai <= 5) {
        println("Cetak angka $nilai")
        nilai++
    }

    do {
        println("Cetak agka $nilai")
        nilai++
    } while(nilai <= 5)
}