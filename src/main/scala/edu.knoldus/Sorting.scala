package edu.knoldus
import scala.util.control.Breaks._
class Sorting {
  // var i:Int;
  //var j:Int;
  //val temp:Int;


  var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)


  def insertionSort(list: List[Int]): List[Int] = {
    val intArray: Array[Int] = list.toArray
    for (j <- 1 until intArray.length) {
      breakable {
        for (i <- (1 to j).reverse) {
          if (intArray(i - 1) < intArray(i)) {
            break
          } else {
            val temp = intArray(i)
            intArray(i) = intArray(i - 1)
            intArray(i - 1) = temp
          }
        }
      }
    }
    intArray.toList
  }

  def bubbleSort(list: List[Int]): List[Int] = {
    val intArray: Array[Int] = list.toArray
    for (i <- 1 to intArray.length - 1) {
      for (j <- (i - 1) to 0 by -1) {
        if (intArray(j) > intArray(j + 1)) {
          val temp = intArray(j + 1)
          intArray(j + 1) = intArray(j)
          intArray(j) = temp
        }
      }
    }
    print(intArray)

  }

  def selectionSort(list: List[Int]) : List[Int]={

  }

