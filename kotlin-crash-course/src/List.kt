fun main()
{
    val shoppingList = listOf<String>("Lamborghini", "Rolex", "Apple");
    println(shoppingList[0])


    val newShoppingList = mutableListOf<String>("Rolex", "Orange", "Audi"); // We can add new elements to mutable list
    newShoppingList.add("Shirts")

    println(newShoppingList[3])

    var x = 0
    while(newShoppingList.size > x)
    {
        print(newShoppingList[x] + " ")
        x++
    }

    print("\n")

    for(x in shoppingList)
    {
        print(x + " ")
    }

    print("\n")

    for(i in 1..100)
    {
        print(i.toString() + " ")
    }

    print("\n")

    val p = 3
    when(p)
    {
        in 1..2 -> println("x is in between 1 and 2")
        in 3..10 -> println("x is in between 3 and 10")
        else -> println("x is not in range between 1 to 10")
    }
}