package com.sort

import scala.util.control.Breaks._

/**
 * @author zqw
 * @create 2020-08-29 7:34 
 */
object QuickSortScala {
  def quickSort(arr: Array[Int], left: Int, right: Int): Unit = {
    var l = left
    var r = right
    val pivot = arr((left + right) / 2)
    var temp = 0
    breakable {
      while (l < r) {
        while (arr(l) < pivot) {
          l += 1
        }
        while (arr(r) > pivot) {
          r -= 1
        }
        if (l >= r) {
          break()
        }
        arr(l) = arr(l)^arr(r)
        arr(r) = arr(l)^arr(r)
        arr(l) = arr(l)^arr(r)
        if (arr(l) == pivot) {
          r -= 1
        }
        if (arr(r) == pivot) {
          l += 1
        }
      }
    }
    if (l == r) {
      r -= 1
      l += 1
    }
    if (l < right) {
      quickSort(arr, l, right)
    }

    if (r > left) {
      quickSort(arr, left, r)
    }

  }

}
