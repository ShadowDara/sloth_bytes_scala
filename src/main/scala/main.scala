// Slothbytes Coding Challenge
// Main Scala File
// made by Shadowdara

package de.shadowdara.sloth_bytes_scala

import scala.io.StdIn

val greeting: String = "Hello, Scala!"

// week 12
val w12_array1 = Array("A", "A", "A")
val w12_array2 = Array("B", "B", "B")

// week 13
val lemonade1 = Array(5, 5, 5, 10, 20)
val lemonade2 = Array(5, 5, 10, 10, 20)

@main
def main(): Unit = {
  print("""Select: 
  0 to break
  1 to see Credits
  2 for testing
  12 for the bridge_shuffle
  13 for the lemonade stand
""")

  val input = StdIn.readLine("\nYour Choice: ")
  if input == "0" then
    print("break")

  else if input == "1" then
    print("Credits\nMade by Shadowdara\nhttps://github.com/shadowdara")

  else if input == "2" then
    println(lemonade_stand.test())

  else if input == "12" then
    println(bridge_shuffle.make_shuffle(w12_array1, w12_array2).mkString(", "))

  else if input == "13" then
    println(lemonade_stand.check_bill(lemonade1))
    println(lemonade_stand.check_bill(lemonade2))

  //else if input == "0" then
  //else if input == "0" then
  //else if input == "0" then
  //else if input == "0" then
}
