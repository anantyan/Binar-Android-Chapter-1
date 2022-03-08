package Chapter1.Topik4

/**
 * Class
 * */
class Komputer {
    var keyboard: String? = null
    var monitor: String? = null
    var ssd: String? = null
    var mouse: String? = null
    fun software(args: String?): String? {
        return args
    }
}

/**
 * Object
 * */
object Manusia {
    var nama: String? = null
    var pekerjaan: String? = null
    fun baju(args: String?): String? {
        return args
    }
}

/**
 * Class with Primary Constructor
 * */
class Kendaraan(
    val roda: Int? = null,
    val pintu: Int? = null,
    private val merk: String? = null
) {
    fun merk(): String? {
        return this.merk
    }
}

/**
 * Studi kasus
 * */
object Belanja {
    fun hitung(price: Array<Int>, barang: Array<String>, uang: Int) {
        var _uang = uang
        price.forEachIndexed { index, i ->
            if (_uang >= i) {
                _uang -= i
                println("""Aku bayar ${barang[index]} seharga $i
                    |Sisa uangnya adalah : $_uang setelah bayar ${barang[index]}
                """.trimMargin())
            }
        }
        if (_uang < price.size - 1) {
            println("""Aku tidak bisa pulang
                |Sisa uangnya adalah : $_uang
            """.trimMargin())
        }
    }
}