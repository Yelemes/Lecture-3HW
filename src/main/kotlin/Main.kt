
fun main() {

    //task1 output
    println(5.powNumber(0))

    //task2 output
    4.powNumber(3) {op -> println(op)}

    //task3 output
    3.displayTypeInfoTask3()
    "Hello".displayTypeInfoTask3()
    3.4.displayTypeInfoTask3()

    //task4 output
    3.displayTypeInfoTask4()
    "Hello".displayTypeInfoTask4()
    3.4.displayTypeInfoTask4()
    DataType.DoubleType(3.141).displayDataTypeInfo()
    DataType.UnitType.displayDataTypeInfo()
}

//task1
fun Int.powNumber(exponent: Int): Int {
    var result = 1
    if (exponent == 0) return 1
    for (i in 0..<exponent) {
        result *= this
    }
    return result
}

//task2
fun Int.powNumber(exponent: Int, output: (Int) -> Unit) {
    var result = 1
    if (exponent == 0) result = 0
    for (i in 0..<exponent) {
        result *= this
    }
    output(result)
}

//task3
fun <T> T.displayTypeInfoTask3() {
    when(this) {
        is String -> println("This is String")
        is Int -> println("This is Int")
        else -> println("Type $this unknown")
    }
}

//task4
sealed class DataType{
    data class DoubleType(val value: Double) : DataType()
    data object UnitType : DataType()
}

fun DataType.displayDataTypeInfo() {
    when(this) {
        is DataType.DoubleType -> println("This is DoubleType with value $value")
        is DataType.UnitType -> println("This is Unit")
    }
}

fun <T> T.displayTypeInfoTask4() {
    when(this) {
        is String -> println("This is String")
        is Int -> println("This is Int")
        is DataType -> this.displayDataTypeInfo()
        else -> println("Type $this unknown")
    }
}

