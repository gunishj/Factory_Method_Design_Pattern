class BalancedFactory() extends AnimalFactory {
  override def CreateAnimal(): Animal = new Duck
}
