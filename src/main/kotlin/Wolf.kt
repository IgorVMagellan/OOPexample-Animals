class Wolf (kind: String, name: String, gender: Char, weight: Int,
            var wickedness: Byte, // Злобность, %
            var  endurance: Byte  // Выносливость, %
) : Carnivore(kind, name, gender, weight)
{
    override fun toString(): String {
        return "Плотоядное, тип=$kind, кличка='$name', пол=$gender, вес=$weight, злобность=$wickedness%, " +
                "выносливость=$endurance%"
    }

}