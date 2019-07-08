package edu.knoldus
import scala.util.control.Breaks._

class Sorting {


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

/*
  def selectionSort(list: List[Int]): List[Int] = {
    def selectMinimum(list: List[Int], accumList: List[Int] = List[Int]()): List[Int] = {

      list match {
        case Nil => accumList
        case _ => {
          val min = list.min
          val requiredList = list.filter(_ != min)
          selectMinimum(requiredList, accumList ::: List.fill(list.length - requiredList.length)(min))
        }
      }
    }

    selectMinimum(list)
  }
*/

  def selectionSort(list: List[Int]): List[Int] = {

    val intArray: Array[Int] = list.toArray

    def swap(list: Array[Int], i: Int, j: Int) {
    var tmp = list(i)
    list(i) = list(j)
    list(j) = tmp
    //  intArray.toList
  }

    var i = 0
    while(i < (list.length - 1)) {
    var min = i
    var j = i + 1

    while (j < list.length) {
    if(list(j) < list(min)) {
    min = j
  }
    j += 1
  }

    swap(list.toArray, i, min)
 i += 1
//intArray.toList
  }
intArray.toList

  }


  def bubbleSort(list: List[Int]): List[Int] = {
    val intArray: Array[Int] = list.toArray
    for (i <- 0 to intArray.length - 1) {
      for (j <- 0 until intArray.length-1-i) {
        if (intArray(j) > intArray(j + 1)) {
          val temp = intArray(j + 1)
          intArray(j + 1) = intArray(j)
          intArray(j) = temp
        }
      }

    }
    intArray.toList

  }
}
