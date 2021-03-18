package com.knoldus

class CustomQueue[A] {
  def enqueue (queue : List[A] , element : A) : List[A] = {
    val newQueue =  queue ::: List(element)
    newQueue
  }

  //dequeue method to delete the first element of the queue
  def dequeue(queue : List[A] ) : List[A] = {
     queue match {
      case Nil => throw new NoSuchElementException()
      case _ => val newQueue = queue.tail
         newQueue
    }
  }

  def isEmpty (queue : List[A] ): Boolean = {
    queue match {
      case Nil => true
      case _ => false
    }
  }
}
