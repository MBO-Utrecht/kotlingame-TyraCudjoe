class Player(val name: String, var life: Int = 3, var level: Int = 1, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fists", 11)
    val inventory = ArrayList<Loot>()

    fun show() {
        if (life < 0) {
            println("$name is dead!")
        }else {
            println("$name is alive!")
        }
    }

    override fun toString(): String {
        return """
            name:       $name
            life:       $life
            level:      $level
            score:      $score
            weaponName: ${weapon.name}
            weaponDamg: ${weapon.damageInflicted}
            """
    }

    fun showInventory(){
        println("$name's Invetory:")
        println(inventory.get(0))
        println("=================================")
    }

}