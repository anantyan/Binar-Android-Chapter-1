package Chapter1.MiniChallenge2

import java.util.*

/**
 * setup data class
 * */
data class Model(
    val id: Int,
    val name: String,
    val phone: String,
    val email: String,
    val address: String
)

/**
 * setup abstraction
 * */
abstract class View {
    abstract fun soal1(title: String)
    abstract fun soal2(title: String)
    abstract fun soal3(title: String)
    abstract fun soal4(title: String, shorting: String)
    abstract fun soal5(title: String)
    abstract fun soal6(title: String, vararg filter: String)
    abstract fun soal7(title: String, vararg filter: String)
}

/**
 * setup inheriten with
 * setup class & logic
 * */
class Presenter: View() {
    /**
     * setup with lambda function
     * */
    private var _listener: ((title: String, item: List<Model>) -> Unit)? = null
    fun response(listener: (title: String, item: List<Model>) -> Unit) { this._listener = listener }

    private var _listener2D: ((title: String, item: MutableList<MutableList<Model>>) -> Unit)? = null
    fun response2D(listener: (title: String, item: MutableList<MutableList<Model>>) -> Unit) { this._listener2D = listener }

    override fun soal1(title: String) {
        _listener?.invoke(
            title,
            dataDummy().filter {
                it.name.length < 5
            }
        )
    }
    override fun soal2(title: String) {
        _listener?.invoke(
            title,
            dataDummy().filter {
                it.address != "-" &&
                it.email != "-"
            }.sortedBy {
                it.name
            }
        )
    }
    override fun soal3(title: String) {
        _listener?.invoke(
            title,
            dataDummy().filter {
                it.email.contains("@hotmail") ||
                it.email.contains("@mail")
            }
        )
    }
    override fun soal4(title: String, shorting: String) {
        _listener?.invoke(
            title,
            dataDummy().filter {
                it.email.length >= 3 &&
                it.name.length >= 3 &&
                it.address.contains("jalan")
            }.sortedBy {
                when(shorting) {
                    "email" -> {
                        it.email
                    }
                    "address" -> {
                        it.address
                    }
                    else -> {
                        it.name
                    }
                }
            }
        )
    }
    override fun soal5(title: String) {
        _listener?.invoke(
            title,
            dataDummy().filter {
                it.address.contains("-") &&
                !it.email.contains("@mail.com")
            }.sortedBy {
                it.email
            }
        )
    }
    override fun soal6(title: String, vararg filter: String) {
        filter.forEach { _filter ->
            _listener?.invoke(
                "$title - $_filter",
                dataDummy().filter { model ->
                    model.name.contains(_filter.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }) ||
                    model.name.contains(_filter.uppercase()) ||
                    model.name.contains(_filter.lowercase())
                }
            )
        }
    }
    override fun soal7(title: String, vararg filter: String) {
        val result: MutableList<MutableList<Model>> = mutableListOf()
        filter.forEach { _title ->
            val tempList: MutableList<Model> = mutableListOf()
            dataDummy().filter { model ->
                model.name.contains(_title.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }) ||
                model.name.contains(_title.uppercase()) ||
                model.name.contains(_title.lowercase())
            }.forEach { model ->
                tempList.add(model)
            }
            result.add(tempList)
        }
        _listener2D?.invoke(title, result)
    }


    /**
     * setup tambahan dari fasilitator
     * */
    fun soal6New(): MutableList<MutableList<Model>> {
        val result: MutableList<MutableList<Model>> = mutableListOf()
        for (data in dataDummy()) {
            val name: String = data.name
            val tempList: MutableList<Model> = mutableListOf()
            for (compare in dataDummy()) {
                if (compare.name.contains(name)) {
                    tempList.add(compare)
                }
            }
            result.add(tempList)
        }
        return result.filter { it.size > 1 }.toMutableList()
    }
    fun soal7New(vararg title: String): MutableList<MutableList<Model>> {
        val result: MutableList<MutableList<Model>> = mutableListOf()
        title.forEach { title ->
            val tempList: MutableList<Model> = mutableListOf()
            dataDummy().filter { model ->
                model.name.contains(title.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }) ||
                model.name.contains(title.uppercase()) ||
                model.name.contains(title.lowercase())
            }.forEach { model ->
                tempList.add(model)
            }
            result.add(tempList)
        }
        return result
    }

    /**
     * setup data dummy
     * */
    private fun dataDummy(): List<Model> {
        return mutableListOf(
            Model(
                1,
                "SMG02_IZOS CELL_197738",
                "8996341493",
                "smg@mail.com",
                "-"
            ),
            Model(
                2,
                "wsssasshshshs",
                "85846844569",
                "herna@haha.com",
                "jwjsjsnshshss"
            ),
            Model(
                3,
                "Wano",
                "8132263555",
                "wano@yahoo.com",
                "-"
            ),
            Model(
                5,
                "WWW",
                "813221639223",
                "merlin@hotmail.com",
                "Sepanjang jalanan, kita melaju cepat."
            ),
            Model(
                6,
                "Wre",
                "85222333666",
                "darlihh@gmail.comr",
                "-"
            ),
            Model(
                6,
                "Wenas",
                "856663963",
                "darma@gmail.com",
                "di atas awan yang tenangg"
            ),
            Model(
                7,
                "jonitbshshshshshshhshshsdhddhhd",
                "822255566697",
                "darnu@gmail.com",
                "kwkwkwwkaagg"
            ),
            Model(
                8,
                "joni jino jini",
                "8123456789",
                "joni@mail.com",
                "jl gambir gambir"
            ),
            Model(
                9,
                "test",
                "82117222140",
                "test@mailing.com",
                "-"
            ),
            Model(
                10,
                "joni jini jino",
                "8159159156",
                "joni@mail.com",
                "-"
            ),
            Model(
                11,
                "jes",
                "8147158159",
                "jes.mail@mail.com",
                "-"
            ),
            Model(
                12,
                "hess",
                "8154979988",
                "-",
                "Jalan jaaln menuju langit biru"
            ),
            Model(
                13,
                "aldyaz",
                "825369741",
                "aldyaz@gmail.com",
                "-"
            ),
            Model(
                14,
                "ujang",
                "8217753855",
                "ujang@hotmail.com",
                "Jalan kujang raya"
            ),
            Model(
                15,
                "joni",
                "8127576769",
                "joni2@gmail.com",
                "-"
            ),
            Model(
                16,
                "jini",
                "8157597979",
                "-",
                "-"
            ),
            Model(
                17,
                "joni",
                "821457555",
                "joni@hotmail.com",
                "-"
            ),
            Model(
                18,
                "ujang jang",
                "82124543464",
                "-",
                "Jalan kenanga"
            ),
            Model(
                19,
                "sellfazz",
                "821472588",
                "-",
                "Jalan fazz"
            ),
            Model(
                20,
                "ujang",
                "851212121",
                "ujang@hotmail.com",
                "Jl ujung ujang"
            ),
            Model(
                21,
                "adi wenas",
                "8777666555",
                "adiwenas@gmail.com",
                "jalan gunung gede"
            )
        )
    }
}