import com.sort.{MergeSortScala, QuickSortScala}

/**
 * @author zqw
 * @create 2020-08-29 8:22 
 */
object SortTest {
  def main(args: Array[String]): Unit = {

    val array =new Array[Int](30)
    val arr = Array(1,1,1,1,1,1,1,1,1,1,1,3,2,1,2)
//    QuickSortScala.quickSort(arr,0,array.length-1)
    MergeSortScala.mergeSort(arr,0,arr.length-1,array)
    for (elem <- arr) {
      print(elem +" ")
    }

  }

}
