package class_concepts

import java.util.*

fun main()
{
    val dog = Animal("Dog")

    val specificDog = Dog()
    specificDog.animalSound()

    val specificCat = Cat()
    specificCat.animalSound()

    specificDog.commonFeature()
    specificCat.commonFeature()

    //val abstractAnimal = AbstractAnimal() // cannot create an instance of abstract class

    //Anonymous Class
    val bear = object : AbstractAnimal("Camebear")
    {
        override fun commonFeature()
        {
            println("Bear override Animal Class")
        }

    }
}