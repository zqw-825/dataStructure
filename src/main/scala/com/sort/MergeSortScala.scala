package com.sort

/**
 * @author zqw
 * @create 2020-08-29 21:21 
 */
object MergeSortScala {

  def mergeSort(arr: Array[Int], left: Int, right: Int, tempArr: Array[Int]): Unit = {

    if (left < right) {
      val mid = (left + right) / 2
      mergeSort(arr, left, mid, tempArr)
      mergeSort(arr, mid + 1, right, tempArr)
      merge(arr, left, mid, right, tempArr)

    }

  }


  def merge(arr: Array[Int], left: Int, mid: Int, right: Int, tempArr: Array[Int]): Unit = {

    var l = left
    var r = mid + 1
    var temp = 0

    while (l <= mid && r <= right) {
      if (arr(l) <= arr(r)) {
        tempArr(temp) = arr(l)
        l += 1
      } else {
        tempArr(temp) = arr(r)
        r += 1
      }
      temp += 1
    }

    while (l <= mid) {
      tempArr(temp) = arr(l)
      l += 1
      temp += 1
    }

    while (r <= right) {
      tempArr(temp) = arr(r)
      r += 1
      temp += 1
    }

    temp = 0 //数组角标初始值0
    var min = left //遍历的最小值

    while (min <= right) {
      arr(min) = tempArr(temp)
      temp += 1
      min += 1
    }


  }

}
