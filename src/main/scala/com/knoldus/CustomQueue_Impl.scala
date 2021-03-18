package com.knoldus

object CustomQueue_Impl extends App{
  val customIntQueue = new CustomQueue[Int]
  val listIntOne = customIntQueue.enqueue(List() , 2)
  println(listIntOne)
  val listIntTwo = customIntQueue.enqueue(listIntOne , 3)
  println(listIntTwo)
  println(customIntQueue.isEmpty(listIntTwo))
  val listIntThree = customIntQueue.dequeue(listIntTwo)
  println(listIntThree)

  val customStringQueue = new CustomQueue[String]
  val listStringOne = customStringQueue.enqueue(List() , "Kuldeepak")
  println(listStringOne)
  val listStringTwo = customStringQueue.enqueue(listStringOne , "Prabhat")
  println(listStringTwo)
  println(customStringQueue.isEmpty(listStringTwo))
  val listStringThree = customStringQueue.dequeue(listStringTwo)
  println(listStringThree)

}
