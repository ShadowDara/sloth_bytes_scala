// Slothbytes Bridge Shuffle
// Week 12 Year 2025

package de.shadowdara.sloth_bytes_scala

import scala.collection.mutable.ArrayBuffer

val array1 = Array("A", "A", "A")
val array2 = Array("B", "B", "B")

def bridgeShuffle(arr1: Seq[Any], arr2: Seq[Any]): Unit = 
  val arr3 = ArrayBuffer[Any]()

  var x = 0
  var do_run = true
  
  while (x < arr1.length || x < arr2.length) do
    if (x < arr1.length) then
      arr3.append(arr1(x))
    if (x < arr2.length) then
      arr3.append(arr2(x))
    x += 1
  
  println(arr3.mkString(", "))
  
bridgeShuffle(array1, array2)
