package temp

import search.BinarySearch
import util.ArrayGenerator
import java.lang.reflect.GenericArrayType
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

fun main() {
    val n = 10000000
    var generateOrderedArray = ArrayGenerator.generateOrderedArray(n)

    println(measureTimeMillis {
        for (i in 1..10000000) {
            Algorithm.binarySearch(generateOrderedArray, i-1)
        }
    })


}