fun main() {

    val luiza = Cat("Кошачьи", "Лушка", 'W', 3, 10, 75, 10)
    val plusik = Cat("Кошачьи", "Плюсик", 'M', 4, 0, 25, 80)

    val petro = Rabbit("Кролик", "Петруччо", 'M', 5, 100, 0)
    val zosya = Rabbit("Кролик", "Зося", 'W', 4, 100, 100)

    val valet = Herbivores("Лошадь", "Валет", 'M', 75)
    val wolf1 = Wolf("Волк", "Эй, ты!", 'M', 25, 75, 90)

    val list = mutableListOf<Any>()

    list.add(luiza)
    list.add(plusik)
    list.add(petro)
    list.add(zosya)
    list.add(valet)
    list.add(wolf1)

    list.forEach { println(it) }

}