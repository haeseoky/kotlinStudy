fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    println(eval(Sum(Num(1),Num(3))))

    println(makeCollection())

    var strings: String? =  null

    println(strings?.lowercase())

    val main = Button()
    main.showOff()
    main.setFocus(false)
    main.click()
}


interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        else -> throw IllegalArgumentException("Unknown ")

    }


fun makeCollection(): Set<Int> {
    val set = setOf(1, 2, 3)

    for (i in set)
    println(set.javaClass)
    return set

}