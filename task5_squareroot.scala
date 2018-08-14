package task5_acadgild

object square {
 def squareRoot(n : Double) : Double =
    {
        var x = n : Double;
        var y = 1 : Double;     
        val e = 0.000001 : Double;    // e decides the accuracy level
        
        while(x - y > e)
        {
            x = (x + y)/2;
            y = n/x;
        }
        return x;
    }
   
      def main(args : Array[String])
    {
     println("Type the number to get Square root value : ")
     val n = readDouble()
     println("Square root of " + n + " is " + squareRoot(n));
    }
}
 