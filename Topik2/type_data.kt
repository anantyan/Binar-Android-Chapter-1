package Chapter1.Topik2

fun main() {
    /**
     * TIPE DATA NUMERIC / BILANGAN
     * */
    val byte: Byte = 1
    val short: Short = 1
    val int: Int = 1
    val long: Long = 1L
    val float: Float = 1.0F
    val double: Double = 1.0
    println(Byte.MAX_VALUE)
    println(Short.MAX_VALUE)
    println(Int.MAX_VALUE)
    println(Long.MAX_VALUE)
    println(Float.MAX_VALUE)
    println(Double.MAX_VALUE)

    /**
     * TIPE DATA BOOLEAN
     * */
    val bool: Boolean = false
    println(bool)

    /**
     * TIPE DATA KARAKTER
     * */
    val char: Char = 'A'
    val string: String = "Hello!"
    println(char)
    println(string)

    /**
     * TIPE DATA ARRAY
     * */
    val array: Array<String> = arrayOf("Hello World!", "Hi!")
    println(array[0])
    println(array.size)

    /**
     * TIPE DATA COLLECTION
     * */
    val collection: MutableList<String> = mutableListOf("Hello World!", "Hi!")
    collection.add("Ahihihi!") // add item
    collection[2] = "Wkwkwkwk!" // put item
    collection.removeAt(2) // delete item
    println(collection)
    println(collection.size)

    val collMap: MutableMap<String, String> = mutableMapOf("One" to "HEHE!", "Two" to "HIHI!")
    collMap += mutableMapOf("Three" to "WKWK!") // add item
    collMap.put("One", "WKWKLAND!") // put item
    collMap -= "Two" // delete item
    println(collMap)
    println(collMap.size)
}