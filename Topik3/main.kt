package Chapter1.Topik3

fun main(args: Array<String>) {
    /**
     * KONDISI IF ELSE
     * */
    if (true) {
        println("Benar!")
    } else {
        println("Salah!")
    }

    /**
     * KONDISI WHEN
     * */
    val angka = 100
    when(angka) {
        10 -> println("10%")
        100 -> println("100%")
        else -> println("Tidak terdefinisikan!")
    }

    when {
        angka >= 150 -> println("Naik gocar")
        angka >= 100 -> println("Naik gojek")
        angka >= 10 -> println("Naik kuda")
        angka >= 0 -> println("Jalan kaki")
        else -> println("Angka nol!")
    }

    when(angka) {
        in 0..10 -> println("Naik kuda")
        in 10..100 -> println("Naik gojek")
        in 100..150 -> println("Naik gocar")
        else -> println("Tidak terdefinisikan!")
    }
}