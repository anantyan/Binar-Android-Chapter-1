package Chapter1.Topik4

import Chapter1.Topik4.Belanja
import Chapter1.Topik4.Kendaraan
import Chapter1.Topik4.Komputer
import Chapter1.Topik4.Manusia

fun main() {
    /**
     * Belajar primary contructor & function return
     * */
    val cpu = Komputer()
    cpu.keyboard = "Logitech"
    cpu.monitor = "Lenovo"
    cpu.mouse = "Logitech"
    cpu.ssd = "512gb"
    println("""Keyboard : ${cpu.keyboard}
        |Monitor : ${cpu.monitor}
        |Mouse : ${cpu.mouse}
        |Kapasitas SSD : ${cpu.ssd}
        |Aplikasi yang diinstal : ${cpu.software("Binar App")}
        |
    """.trimMargin())

    /**
     * Belajar object & function return
     * */
    Manusia.nama = "Arya Rezza"
    Manusia.pekerjaan = "Menolong orang"
    println("""Nama : ${Manusia.nama}
        |Pekerjaan : ${Manusia.pekerjaan}
        |Baju : ${Manusia.baju("Erigo")}
        |
    """.trimMargin())

    /**
     * Belajar primary constructor & function return
     * */
    val vehicle = Kendaraan(
        merk = "Ferrari kuda jingkrak",
        roda = 4,
        pintu = 2
    )
    println("""Merk : ${vehicle.merk()}
        |Berapa pintu : ${vehicle.pintu}
        |Berapa roda : ${vehicle.roda}
        |
    """.trimMargin())

    /**
     * Studi kasus
     * */
    Belanja.hitung(
        price = arrayOf(200_000, 100_000, 80_000, 50_000, 15_000),
        barang = arrayOf("Tas", "Baju", "Celana", "Buku", "Parkir"),
        uang = 250_000
    )
}