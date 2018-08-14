package task5_acadgild

object fibonacci {
  
def fibSequence(n: Int): List[Int] = {
    var ret = scala.collection.mutable.ListBuffer[Int](1, 1)
    while (ret(ret.length - 1) < n) {
      val temp = ret(ret.length - 1) + ret(ret.length - 2)
      if (temp >= n) {
        return ret.toList
      }
      ret += temp
    }
    ret.toList
  }

def nthFib(n: Int): Int = {
  var x = 0
  var y = 1
  for (_ <- 1 until n) {
    val temp = x + y
    x = y
    y = temp
  }
  y
}

def fib_rec(n:Long):Long = {
  def fib_recursion(n:Long, a:Long, b:Long):Long = {
    if(n == 0) a
    else fib_recursion(n - 1, b, a + b)
  }
  return fib_recursion(n, 0, 1)
}
  
  def main(args: Array[String]) {
    println("Type the number to find fibonnaci series and value:")
    val nthFib1= readInt()
    
    println("list of fib series="+fibSequence(nthFib1))
    println(nthFib1 +" fibonacci value using for loop = "+nthFib(nthFib1))
    println(nthFib1 +" fibonacci value using recursion function ="+fib_rec(nthFib1))
    }
}

