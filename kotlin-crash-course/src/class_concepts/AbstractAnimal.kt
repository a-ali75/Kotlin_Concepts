package class_concepts

abstract class AbstractAnimal (val name: String, val legCount: Int = 4) //only open classes can be inherrited
{
    init {
        //this block will be called whenever any instance is created
        println("Hello my name is $name")
    }
    abstract fun commonFeature()
}