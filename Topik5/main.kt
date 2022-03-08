package Chapter1.Topik5

fun main(args: Array<String>) {
    /**
     * Studi kasus
     * */
    val tas = Barang("Tas", 252_500)
    val baju = Barang("Baju", 102_500)
    val parkir = Barang("Parkir", 15_000)
    val celana = Barang("Celana", 80_000)
    val buku = Barang("Buku", 50_000)
    HitungBelanja.hitung(
        tas, baju, parkir, celana, buku,
        modal = 500_000
    )

    /**
     * Studi kasus konversi suhu
     * */
    println("""C to F : ${Suhu.konversi(konversi = "C-F", angka = 50.0)}
        |C to R : ${Suhu.konversi(konversi = "C-R", angka = 50.0)}
        |
    """.trimMargin())

    /**
     * Studi kasus fibonaci
     * */
    val angka = Angka(0, 200, 1)
    Fibo.nacci(angka)
    println()

    val main = Main()
    main.setShowText("Hello world!")
    main.showText()

    /**
     * Studi kasus
     * */
    println("""C to F : ${50.0.konversi("C-F")}
        |C to R : ${50.0.konversi("C-R")}
        |Lambda C to R : ${SuhuLambda.konversiLambda("C-R", 50.0)}
        |Lambda konversi bilangan : ${KonversiBilangan.convert(1000)}
        |Lambda fibonacci :
        |${KonversiBilangan.fibonacci(Angka(start = 0, limit = 100, plus = 1))}
    """.trimMargin())
}

/**
 * Belanja
 * */
class Barang(
    val nama: String,
    val harga: Int
)

object HitungBelanja {
    fun hitung(vararg barangs: Barang, modal: Int) {
        var _modal = modal
        barangs.forEach { 
            println("Aku bayar ${it.nama} - ${it.harga}")
            _modal -= it.harga
        }
        println("Sisa uang saya adalah : $_modal")
        if (_modal <= 0) {
            println("Sisa uang saya habis :(\n")
        }
    }
}

/**
 * Konversi suhu
 * */
object Suhu {
    fun konversi(konversi: String, angka: Double): Double? {
        return when(konversi) {
            "C-F" -> {
                (angka * 1.8) + 32
            }
            "C-R" -> {
                (angka * 0.8)
            }
            "C-K" -> {
                angka + 273.15
            }
            else -> null
        }
    }
}

/**
 * Fibonacci
 * */
class Angka(
    var start: Int,
    var limit: Int,
    var plus: Int
)

object Fibo {
    fun nacci(angka: Angka) {
        print("Fibonacci ${angka.limit} - hasil akhirnya adalah : ")
        while (angka.start <= angka.limit) {
            print("${angka.start} ")
            val sum = angka.start + angka.plus
            angka.start = angka.plus
            angka.plus = sum
        }
    }
}