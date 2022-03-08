package Chapter1.Topik6

/**
 * Belajar access modifier - Enkapsulasi
 * */
class Human<T, U>(
    private val nama: T? = null,
    private val umur: U? = null
) : Inheriten() {
    fun printBio(): String {
        return "Nama saya adalah ${this.nama}\n" +
                "Umur saya adalah ${this.umur}"
    }

    override val lambda: (String) -> String
        get() = super.lambda
}

open class Inheriten {
    open val lambda = { args: String ->
        args
    }
}