package com.knoldus

import scala.collection.convert.ImplicitConversions.`buffer AsJavaList`
import scala.collection.mutable.ListBuffer

class CustomQueue[A] {
  private val queue = new ListBuffer[A]()
  var firstIndex = -1
  var lastIndex = -1
  def enqueue (element : A) = {
    if (firstIndex == -1 && lastIndex == -1){ // Check if it is the first element
      firstIndex += 1
      queue += element
    }
    else{
      queue += element
    }
    lastIndex += 1
  }

  //dequeue method to delete the first element of the queue
  def dequeue = {
    require(firstIndex != -1 && lastIndex != -1 , "Queue UnderFlow !!!") // Check for queue underflow !!
    if(lastIndex == firstIndex){ // Removing the last element from the queue
      queue -= queue.get(firstIndex)
      lastIndex = -1
      firstIndex = -1
    }
    else{
      queue -= queue.get(firstIndex)
    }
  }

  // egtQueue method to Display the elements of Queue as queue
  def getQueue : ListBuffer[A] = {
    queue
  }
}
