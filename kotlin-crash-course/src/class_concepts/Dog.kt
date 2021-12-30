package class_concepts

//class Dog : Animal("Dog")
class Dog: AbstractAnimal("Dog")
{
    init {
        println("Hello I am an Dog with legcount = $legCount")
    }

    fun animalSound()
    {
        println("I am barking .. vow vow")
    }

    override fun commonFeature()
    {
        println("Dog Override Animal Function")
    }
}