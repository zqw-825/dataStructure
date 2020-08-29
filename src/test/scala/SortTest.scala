import com.sort.QuickSortScala

/**
 * @author zqw
 * @create 2020-08-29 8:22 
 */
object SortTest {
  def main(args: Array[String]): Unit = {

    val array = Array(1,1,1,1,1,1,1,1,1,1,1,3,2,1,2)
    QuickSortScala.quickSort(array,0,array.length-1)
    for (elem <- array) {
      print(elem +" ")
    }

  }

}
