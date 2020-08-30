package com.zqw.binsearch

import scala.collection.mutable.ListBuffer

/**
 * @author zqw
 * @create 2020-08-30 9:10 
 */
object BinSearchScala {
  def main(args: Array[String]): Unit = {
    val arr = Array[Int](1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9)

    val ints = binSearch(arr, 0, arr.length - 1, 1)

    for (elem <- ints) {
      print(elem + " ")
    }

  }

  def binSearch(arr: Array[Int], left: Int, right: Int, findVal: Int): ListBuffer[Int] = {
    var mid = (left + right) / 2
    val list = ListBuffer[Int]()
    if (findVal < arr(left) || findVal > arr(right) || left > right) {
      return list
    }

    if (findVal < arr(mid)) {
      return binSearch(arr, left, mid - 1, findVal)
    } else if (findVal > arr(mid)) {
      return binSearch(arr, mid + 1, right, findVal)
    } else {
      while (mid >= 0 && arr(mid) == findVal) {
        mid -= 1
      }
      while (mid + 1 <= arr.length - 1 && arr(mid + 1) == findVal) {
        list.append(mid + 1)
        mid += 1
      }
    }
    list
  }

}
