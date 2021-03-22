object App extends App{
  print("Hello, Welcome To Animal Kingdom Marketplace")

    var GunishPetShop = new BalancedFactory
    var Tuffy =  GunishPetShop.CreateAnimal()
    println(Tuffy.Species())

    var PlutoPetShop = new RandomFactory
    var Catlyn = PlutoPetShop.CreateAnimal()
    println(Catlyn.Species())

}
