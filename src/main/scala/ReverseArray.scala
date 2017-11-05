class ReverseArray {
  def reverse(list: List[Int]): List[Int] = {
    var result: List[Int] = List()
    var mutableList: List[Int] = list

    while(mutableList.nonEmpty){
      result = mutableList.head :: result
      mutableList = mutableList.tail
    }

    result
  }
}