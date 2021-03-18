package com.knoldus

import org.scalatest.flatspec.AsyncFlatSpec

class CustomQueueTest extends AsyncFlatSpec{
  val customIntQueue = new CustomQueue[Int]

  "enqueue" should "add a element of Int" in {
    val result = customIntQueue.enqueue(List() , 1)
    assert(result == List(1))
  }

  "dequeue " should "remove the element of Int " in {
    val queue = customIntQueue.enqueue(List(1,2) , 3)
    val result = customIntQueue.dequeue(queue)
    assert(result == List(2,3))
  }

  it should "not remove any element" in {
    assertThrows[NoSuchElementException] {
      customIntQueue.dequeue(List())
    }
  }

  "isEmpty " should " return true " in {
    val queue = List.empty[Int]
    val result = customIntQueue.isEmpty(queue)
    assert(result)
  }

  val customStringQueue = new CustomQueue[String]

  "enqueue" should "add a element of String" in {
    val result = customStringQueue.enqueue(List() , "Kuldeepak")
    assert(result == List("Kuldeepak"))
  }

  "dequeue " should "remove the element of String " in {
    val queue = customStringQueue.enqueue(List("Kuldeepak","Prabhat") ,"Mansi")
    val result = customStringQueue.dequeue(queue)
    assert(result == List("Prabhat" , "Mansi"))
  }

  it should "not remove any element of String" in {
    assertThrows[NoSuchElementException] {
      customStringQueue.dequeue(List())
    }
  }

}
