class Cat (kind: String, name: String, gender: Char, weight: Int, wickedness: Byte,
           var  adequacy: Byte,   // Адекватность, %
           var  sleepiness: Byte  // Cонливость, %
           ) : Carnivore(kind, name, gender, weight)
{
    override fun toString(): String {
        return "Плотоядное, тип=$kind, кличка='$name', пол=$gender, вес=$weight, адекватность=$adequacy%, " +
                "сонливость=$sleepiness%"
    }

}
