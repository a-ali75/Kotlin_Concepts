package class_concepts

//class Cat: Animal("Cat")
class Cat: AbstractAnimal("Cat")
{
    init {
        println("I am a cat with legcount = $legCount")
    }

    fun animalSound()
    {
        println("I am a cat and I do meow meow")
    }

    override fun commonFeature()
    {
        println("Cat Override Animal Function")
    }
}