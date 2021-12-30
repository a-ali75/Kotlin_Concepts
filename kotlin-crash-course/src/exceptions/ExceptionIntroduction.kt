package exceptions

fun main()
{
    val number = readLine() ?: "0"
    //println(number.toInt()) // iF we donot enter number then it will through an exceptions (NumberFormatException.java:65)
    val parsedNumber = try
    {
        println(number.toInt())
        number.toInt()
    }
    catch (ex : NumberFormatException )
    {
        println("Entered String is not a number")
        0
    }
    println(parsedNumber)

}