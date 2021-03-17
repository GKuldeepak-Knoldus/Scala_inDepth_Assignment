package com.knoldus

object CustomQueue_Impl extends App{
  val customIntQueue = new CustomQueue[Int]
  customIntQueue.enqueue(5)
  customIntQueue.enqueue(10)
  println(customIntQueue.getQueue)
  customIntQueue.dequeue
  println(customIntQueue.getQueue)
  customIntQueue.enqueue(15)
  println(customIntQueue.getQueue)
  customIntQueue.dequeue
  println(customIntQueue.getQueue)

  val customStringQueue = new CustomQueue[String]
  customStringQueue.enqueue("Kuldeepak")
  customStringQueue.enqueue("Prabhat")
  println(customStringQueue.getQueue)
  customStringQueue.enqueue("Mansi")
  println(customStringQueue.getQueue)
  customStringQueue.dequeue
  println(customStringQueue.getQueue)


}
