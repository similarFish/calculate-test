
object testList{
  def main(args: Array[String]): Unit = {
    val list=List(1,2,3,4);
    list.foreach{x=>println(x)}
    for (i<-list){
      print(i)
    }
  }
}
