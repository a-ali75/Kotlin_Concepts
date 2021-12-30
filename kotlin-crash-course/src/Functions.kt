fun main()
{
    println("Is 2 an Even Number? " + isEven(2) + "\n")

    val z = 1002
    println("Is 1002 an Odd Number? " + z.isOdd() + "\n")

    printNumbers(1, 10)

    println("\n\nNext Call\n\n")

    printNumbers(11,20)
}
fun printNumbers(x: Int, y: Int)
{
    for(i in x..y)
    {
        print(i.toString() + " ")
    }
}

fun isEven(x: Int):Int //function name(params name: params Type):return Type
{
    return (if (x%2==0) 1 else 0)
}

fun Int.isOdd(): Boolean // Kotlin feature extension function
{
    return this%2==1;
}