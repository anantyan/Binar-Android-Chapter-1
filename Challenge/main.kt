package Chapter1.Challenge

import Chapter1.Challenge.ObjectLambda.object1
import Chapter1.Challenge.ObjectLambda.object2
import Chapter1.Challenge.ObjectLambda.object3
import Chapter1.Challenge.ObjectLambda.object4
import Chapter1.Challenge.ObjectLambda.object5
import Chapter1.Challenge.ObjectLambda.runObject

/**
 * hello world!
 * nama : Arya Rezza Anantya
 * kelas : Android - 3 Binar Academy
 * */
fun main() {

    /**
     * inisial nilai n
     * */
    val n = 8

    /**
     * output
     * */
    print(runObject(n, object1, object2, object3, object4, object5))
}

/**
 * setup object
 * setup kotlin extention function
 * */
object ObjectLambda {
    /**
     * setup jvm lambda expression
     * */
    val object1 = { args: Int -> args.object1() }
    val object2 = { args: Int -> args.object2() }
    val object3 = { args: Int -> args.object3() }
    val object4 = { args: Int -> args.object4() }
    val object5 = { args: Int -> args.object5() }
    fun runObject(angka: Int, vararg args: (Int) -> String): String {
        var str = ""
        args.forEach {
            str += "${it(angka)}\n"
        }
        return str
    }
}

fun Int.object1(): String {
    var str = ""
    var space = this - 1
    for (j in 1..this) {
        for (i in 1..space) {
            str += " "
        }
        space--
        for (i in 1 until 2 * j) {
            str += "*"
        }
        str += "\n"
    }
    return str
}

fun Int.object2(): String {
    var str = ""
    var start = this * 2 - 1
    val space = this - 1
    for (i in this downTo 1) {
        for (j in space downTo i) {
            str += " "
        }
        for (k in 1..start) {
            str += "*"
        }
        start -= 2
        str += "\n"
    }
    return str
}

fun Int.object3(): String {
    var str = ""
    var space = this - 1
    for (j in 1..this) {
        for (i in 1..space) {
            str += " "
        }
        space--
        for (i in 1 until 2 * j) {
            str += "*"
        }
        str += "\n"
    }
    space = 1
    for (j in 1 until this) {
        for (i in 1..space) {
            str += " "
        }
        space++
        for (i in 1 until 2 * (this - j)) {
            str += "*"
        }
        str += "\n"
    }
    return str
}

fun Int.object4(): String {
    var str = ""
    val start = this + 1
    for (i in 1..start) {
        for (j in 1..start) {
            str += if (i == j || i + j == start + 1) {
                "*"
            } else {
                " "
            }
        }
        str += "\n"
    }
    return str
}

fun Int.object5(): String {
    var str = ""
    for (i in 1..this) {
        for (j in 1..i) {
            str += "*"
        }
        str += "\n"
    }
    return str
}