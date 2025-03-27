// Slothbytes Bridge Shuffle
// Week 12 Year 2025

var x = 0
var array1 = Array("A", "A", "A")
var array2 = Array("B", "B", "B")
var array3 = Array()

def shuffle =
  while True do
    if array1.length >= x && array2.length >= x + 1 then
      array3(x) = array1 (x)
      array3(x+1) = array2 (x+1)

    if array1.length < x && array2.length >= x then
      array3(x) = array2(x)
      array3(x+1) = array2(x+1)

    if array1.length >= x && array2.length < x then
      array3(x) = array1(x)
      array3(x+1) = array1(x+1)

    if array1.length < x && array2.length < x + 1 then
      print("finish")
      break

    i += 2
