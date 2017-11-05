object Main extends App {
  val list: List[Int] = List(1,2,3,4,5,6,7,8,9,10)
  
  val reverseArray: ReverseArray = new ReverseArray
  
  val result: List[Int] = reverseArray.reverse(list)
  
  println(Console.GREEN + result + Console.RESET)
}