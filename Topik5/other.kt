package Chapter1.Topik5

class Main {
    private var _showText: String? = null

    fun getShowText(): String? {
        return this._showText
    }

    fun setShowText(args: String?) {
        this._showText = args
    }
}

/**
 * Belajar lambda & extentions function
 * */
object KonversiBilangan {
    val fibonacci = { angka: Angka ->
        var result = ""
        result = "Fibonacci ${angka.limit} - hasil akhirnya adalah : "
        while (angka.start <= angka.limit) {
            result += "${angka.start} "
            val sum = angka.start + angka.plus
            angka.start = angka.plus
            angka.plus = sum
        }
        result
    }

    val convert = { data: Int ->
        when {
            data % 1000 == 0 -> "Ribuan"
            else -> "Satuan"
        }
    }
}

object SuhuLambda {
    val konversiLambda = { konversi: String, angka: Double ->
        when(konversi) {
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

fun Main.showText() {
    println(this.getShowText()?.toTitleCase()+"\n")
}

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") {
        it.capitalize()
    }
}

fun Double.konversi(convert: String): Double? {
    return when(convert) {
        "C-F" -> {
            (this * 1.8) + 32
        }
        "C-R" -> {
            (this * 0.8)
        }
        "C-K" -> {
            this + 273.15
        }
        else -> null
    }
}