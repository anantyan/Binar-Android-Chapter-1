package Chapter1.MiniChallenge2

fun main() {
    val tampil = Presenter()
    tampil.response { title, item ->
        println(title)
        item.forEach { model ->
            println("[${model.id}, ${model.name}, ${model.phone}, ${model.email}, ${model.address}]")
        }
        println()
    }
    tampil.response2D { title, item ->
        println(title)
        item.forEach { model ->
            model.forEach {
                println("[${it.id}, ${it.name}, ${it.phone}, ${it.email}, ${it.address}]")
            }
            println()
        }
        println()
    }
    tampil.soal1("Soal 1")
    tampil.soal2("Soal 2")
    tampil.soal3("Soal 3")
    tampil.soal4("Soal 4", "email")
    tampil.soal5("Soal 5")
    tampil.soal6("Soal 6", "joni", "jini", "ujang", "wenas")
    tampil.soal7("Soal 7", "joni", "jini", "ujang", "wenas")
}