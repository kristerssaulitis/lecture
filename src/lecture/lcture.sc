object FirstObject {

  def computeShippingCost(weigh: Double) : Double = {
    val base : Double = 5
    val const : Double = 30
    if (weigh >= const){
      base
    } else {
      base + (weigh * 0.25)
    }
  }

  def main(args:Array[String]) : Unit = {
    println(computeShippingCost(30.0))
    println(computeShippingCost(10.0))
    println(computeShippingCost(40.0))
  }
}



