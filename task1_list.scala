package task5_acadgild

import scala.collection.immutable._ 

object mainList {
  
  
  def main(args:Array[String]){
  
  val liststring: List[String] =  List("alpha","gamma","omega","zeta","beta") ;
  println("list of tuples = "+liststring );
  
  
  val lenght4 = liststring.count(item=>item.length==4);
 println("String with lenght 4 is " +lenght4);
  
  
   
 val lengthofeachstring = liststring.map(item=>item.length);
  println( "the list of string to a list of integers = "+ lengthofeachstring);
  
  
  
  val containsm = liststring.count(item=>item.contains("m"));
  println("the count of all strings which contain alphabet ‘m’ = "+ containsm);
  
  val startswitha = liststring.count(item=>item.startsWith("a"));
  println( "the count of all strings which start with the alphabet ‘a’ = "+startswitha);
  
  
  }
}