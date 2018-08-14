package task5_acadgild

object gcdCal {
  
  def gcd(a: Int,b: Int): Int = {

       if(b ==0) a else gcd(b, a%b)

    }
    def main(args: Array[String]) {
      
      println("Type 2 numbers to calculate greatest common divisor")
      var x =readInt()
      var y =readInt()

        println(gcd(x,y))

    }
}
