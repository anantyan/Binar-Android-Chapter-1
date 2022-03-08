package Chapter1.MiniChallenge

import Chapter1.MiniChallenge.Main.addUpTo
import Chapter1.MiniChallenge.Main.capitalizeSentence
import Chapter1.MiniChallenge.Main.containsRange
import Chapter1.MiniChallenge.Main.countDown
import Chapter1.MiniChallenge.Main.getIndex
import Chapter1.MiniChallenge.Main.getOdd
import Chapter1.MiniChallenge.Main.tryUnit
import java.util.*
import kotlin.math.floor
import kotlin.math.roundToInt

/**
 * name : Arya Rezza
 * class : AND - 3
 * */
fun main() {
    /**
     * setup 1 - Capitalize Sentence
     * */
    println(capitalizeSentence("flower"))
    println(capitalizeSentence("this is a house"))
    println(capitalizeSentence("my name is arya rezza"))
    println()

    /**
     * setup 2 - Get Odd without Even
     * */
    println(getOdd(listOf(1,2,3)))
    println(getOdd(listOf(4,6,8,7,9,13)))
    println()

    /**
     * setup 3 - Compare range if true
     * */
    println(containsRange(5..7, 5..7))
    println(containsRange(1..12, 5..7))
    println(containsRange(5..8, 5..9))
    println(containsRange(3..7, 1..5))
    println()

    /**
     * setup 4 - Numeric equivalent
     * */
    println(addUpTo(1))
    println(addUpTo(2))
    println(addUpTo(3))
    println(addUpTo(10))
    println()

    /**
     * setup 5 - Get Index from Array or List
     * */
    println(getIndex(listOf("A", "B", "C"), "A"))
    println(getIndex(listOf("A", "B", "C"), "B"))
    println(getIndex(listOf("A", "B", "C"), "C"))
    println(getIndex(listOf("A", "B", "C"), "D"))
    println()

    /**
     * setup 6 - Count Down timer
     * */
    println(countDown(1))
    println(countDown(4))
    println(countDown(10))
    println()

    /**
     * try lambda unit
     * */
    tryUnit()
}

/**
 * setup open class with child main object
 * */
object Main : Challenge() {
    override val capitalizeSentence = { args: String ->
        args.capitalizeSentence()
    }
    override val getOdd = { args: List<Int> ->
        args.getOdd()
    }
    override val containsRange = { args: IntRange, args2: IntRange ->
        args.compareWith(args2)
    }
    private var i = 0
    override val addUpTo = { args: Int ->
        i += args
        i
    }
    override val getIndex = { args: List<String>, args2: String ->
        args.indexOf(args2)
    }
    override val countDown = { args: Int ->
        args.countDown()
    }
    override val tryUnit = {
        println("Hello world!".capitalizeSentence())
    }
}

abstract class Challenge {
    abstract val capitalizeSentence: (String) -> String
    abstract val getOdd: (List<Int>) -> List<Int>
    abstract val countDown: (Int) -> List<Int>
    abstract val containsRange: (IntRange, IntRange) -> Boolean
    abstract val addUpTo: (Int) -> Int
    abstract val getIndex: (List<String>, String) -> Int
    abstract val tryUnit: () -> Unit
}

/**
 * setup kotlin extension
 * */
fun String.capitalizeSentence(): String {
    return this.split(" ").joinToString(" ") {
        it.replaceFirstChar { char ->
            if (char.isLowerCase()) char.titlecase(Locale.getDefault()) else char.toString()
        }
    }
}
fun List<Int>.getOdd(): List<Int> {
    val i = mutableListOf<Int>()
    this.forEach {
        if (it % 2 != 0) i.add(it)
    }
    return i
}
fun IntRange.compareWith(args: IntRange): Boolean {
    var bool = false
    for (i in args) {
        if (i in this) {
            bool = true
        } else {
            bool = false
            break
        }
    }
    return bool
}
fun Int.countDown(): List<Int> {
    val range = this downTo 0
    val list = mutableListOf<Int>()
    range.forEach {
        list.add(it)
    }
    return list
}