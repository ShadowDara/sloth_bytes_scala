// Slothbytes Coding Challenge
// Main Scala File
// made by Shadowdara

package de.shadowdara.sloth_bytes_scala

import scala.io.StdIn

val greeting: String = "Hello, Scala!"

// week 12
val w12_array1 = Array("A", "A", "A")
val w12_array2 = Array("B", "B", "B")

@main
def main(): Unit = {
  print("""Select: 
  0 to break
  1 to see Credits
  12 for the bridge_shuffle
""")
  val input = StdIn.readLine()
  if input == "0" then
    print("break")
  else if input == "1" then
    print("Credits\nMade by Shadowdara\nhttps://github.com/shadowdara")
  else if input == "12" then
    println(bridge_shuffle.make_shuffle(w12_array1, w12_array2).mkString(", "))
  //else if input == "0" then
  //else if input == "0" then
  //else if input == "0" then
  //else if input == "0" then
  //else if input == "0" then

}
