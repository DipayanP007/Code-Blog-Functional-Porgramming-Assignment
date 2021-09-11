package FunctionalProgramming.DependancyInversion



object ApplianceSwitch extends App {


  val electricSwitch = (client: Switchable) => {
    if (client.isOn) {
      println(client.name + " is off")
      client.isOn = false
    }
    else {
      println(client.name + " is On")
      client.isOn = true
    }
  }
  val bulbSwitch = new Switchable {
    override var isOn: Boolean = false
    override var name: String = "Bulb"
  }
  electricSwitch(bulbSwitch)
  electricSwitch(bulbSwitch)

  println()
  val fanSwitch = new Fan
  electricSwitch(fanSwitch)
  electricSwitch(fanSwitch)


}