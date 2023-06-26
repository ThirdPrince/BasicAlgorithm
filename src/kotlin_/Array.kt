package kotlin_

class Array(private val capacity:Int) {


    private var intArray:IntArray
    private var size:Int = 0

    init {
        intArray = IntArray(capacity)
        size = 0
    }

    constructor( ):this(10){
        intArray = IntArray(capacity)
        size = 0
    }


}