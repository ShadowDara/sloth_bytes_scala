// Slothbytes Coding Challenge
// Main Scala File
// made by Shadowdara

package de.shadowdara.sloth_bytes_scala

import scala.io.StdIn
import scala.util.boundary
import scala.util.boundary.break

val info = """Select: 
  0 to break
  1 to see Credits
  2 to run all
  12 for the bridge_shuffle
  13 for the lemonade stand
  14 for the space message"""


// ## vars for the weekly challenges
// week 12
val w12_array1 = Array("A", "A", "A")
val w12_array2 = Array("B", "B", "B")

// week 13
val lemonade1 = Array(5, 5, 5, 10, 20)
val lemonade2 = Array(5, 5, 10, 10, 20)

// week 14
val spacemessage1 = "ABCD"
val spacemessage2 = "AB[3CD]"
val spacemessage3 = "IF[2E]LG[5O]D"


// to break to function
var do_break = false

// functions
def run(): Unit = {
  val input = StdIn.readLine("\nYour Choice: ")
  run_base(input)
  if !do_break == true then
    run()
}

def run_base(input: String): Unit = {
  if input == "info" then
    println(info)

  else if input == "0" then
    print("Exiting!")
    val do_break = true

  else if input == "1" then
    println("Credits\nMade by Shadowdara\nhttps://github.com/shadowdara\nhttps://github.com/ShadowDara/sloth_bytes_scala")
  
  else if input == "2" then
    run_all()

  else if input == "12" then
    println(bridge_shuffle.make_shuffle(w12_array1, w12_array2).mkString(", "))

  else if input == "13" then
    println(lemonade_stand.check_bill(lemonade1))
    println(lemonade_stand.check_bill(lemonade2))

  else if input == "14" then
    println(message_from_space.spaceMessage(spacemessage1))
    println(message_from_space.spaceMessage(spacemessage2))
    println(message_from_space.spaceMessage(spacemessage3))

  //else if input == "0" then
  //else if input == "0" then
  //else if input == "0" then
  //else if input == "0" then
}

// to run the challenge from every week!
def run_all(): Unit = {
  print("All results:")
  print("### Week 12")
  run_base("12")
  print("### Week 13")
  run_base("13")
  print("### Week 14")
  run_base("14")
}

// main run
@main
def main(): Unit = {
  println("Slothbytes Scala Challenge")
  println("Type info for more infos and 0 to exit!")

  run()
}
