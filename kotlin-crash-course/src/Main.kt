fun main()
{
    println("Hello Kotlin Program")
    var x: Int = 3 //var types can be reassigned but val cannot be reassigned
    println(x)
    println("Hello, the value of x is $x")
    val y: Int = 100
    println("Hello, the value of y is $y")
    //y = 200 we cannot do this as it is val type\

    val z = if(y == 102) true else false

    println("The value of z is $z")
}