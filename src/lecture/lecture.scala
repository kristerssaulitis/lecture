package lecture

object FirstObject {

  def computeShippingCost(weight: Double) : Double = {
    val base : Double = 5.0
    val limit : Double = 30.0
    val perkg : Double = 0.25

    if (limit >= weight){
      base
    } else {
      base + ((weight - limit) * perkg)
    }
  }

  def main(args:Array[String]) : Unit = {
    println(computeShippingCost(30.0)+ " $")
    println(computeShippingCost(31.0)+ " $")
  }
}

