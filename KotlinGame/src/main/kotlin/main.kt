fun main(args: Array<String>) {
    val tyra = Player("Tyra", 4, 1, 0)

    tyra.show()

    println(tyra.weapon.name)
    println(tyra.weapon.damageInflicted)

    val baksteen = Weapon("Baksteen", 16)

    tyra.weapon = baksteen

    println(tyra.weapon.name)
    println(tyra.weapon.damageInflicted)
    println(baksteen.damageInflicted)

    val travon = Player("Travon", 3, 4, 15, baksteen)

    travon.show()

    val redPotion = Loot("Red Potion", LootType.POTION, 12.50)

    travon.inventory.add(redPotion)
    travon.showInventory().toString()
}