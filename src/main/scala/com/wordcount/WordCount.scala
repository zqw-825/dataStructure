package com.wordcount

/**
 * @author zqw
 * @create 2020-08-29 22:21 
 */
object WordCount {
  def main(args: Array[String]): Unit = {
    val list = List("hello baochengzhen ss ss s sfsadf ss ad","sd java java java")
//    list.flatMap(_.split(" "))
//      .map((_,1))
//      .groupBy(_._1)
//      .map(e => (e._1,e._2.size))
//      .toList
//      .sortBy(_._2)
//      .reverse
//      .take(3)
//      .foreach(print)

    list.flatMap(_.split(" "))
      .groupBy(e => e)
      .map(e => (e._1,e._2.size))
      .foreach(print)
  }

}
