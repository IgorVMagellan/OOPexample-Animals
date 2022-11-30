open class Carnivore(
    var kind: String,     // Род животного
    var name: String,     // Кличка
    var gender: Char,     // Пол
    var weight: Int       // Вес
)
{
    override fun toString(): String {
        return "Плотоядное, тип=$kind, кличка=$name, пол=$gender, вес=$weight"
    }

}
