class Rabbit (kind: String, name: String, gender: Char, weight: Int,
              var  voracity: Byte,    // Прожорливость, %
              var  fertility: Byte    // Плодовитость, %
             ) : Herbivores(kind, name, gender, weight)

{
    override fun toString(): String {
        return "Травоядное, тип=$kind, кличка='$name', пол=$gender, вес=$weight, прожорливость=$voracity%, " +
                "плодовитость=$fertility%"
    }

}