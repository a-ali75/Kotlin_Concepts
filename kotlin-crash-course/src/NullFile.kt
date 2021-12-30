fun main()
{
    val x: Int? = null
    val n1 = readLine()
    val n2 = readLine()
    val sum = n1!!.toInt() + n2!!.toInt(); // We are indicating that the values are not null
    println("The sum of the two numbers is $sum")

    val m1 = readLine() ?: "0" // If readLine function returns null, then 0 will taken as m1
    val m2 = readLine() ?: "0"
    val sum2 = m1.toInt() + m2.toInt();
    println("The sum of the two numbers is $sum2")
}