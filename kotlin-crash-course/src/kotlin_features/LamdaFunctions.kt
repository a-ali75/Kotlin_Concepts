package kotlin_features

import com.sun.org.apache.xpath.internal.operations.Bool

fun main()
{
    val list = listOf("Java_Kotlin", "JavA", "C++")
    val count = list.count {
        it.contains("a")
    }

    val newCount = list.customCount {
        it.contains("A")
    }

    println(" " + count + " " + newCount)
}

//Making Custom Count
fun List<String>.customCount(function: (String) -> Boolean) : Int
{
    var counter = 0
    for(string in this)
    {
        if(function(string))
        {
            counter++
        }
    }
    return counter
}

//Making Generic Custom Function
fun <T>List<T>.customCount_generic(function: (T) -> Boolean) : Int
{
    var counter = 0
    for(string in this)
    {
        if(function(string))
        {
            counter++
        }
    }
    return counter
}
