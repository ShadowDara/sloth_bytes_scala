val lemonade1 = Array(5, 5, 5, 10, 20)
val lemonade2 = Array(5, 5, 10, 10, 20)
val lemonade3 = Array(10, 20)

var bill5 = 0
var bill10 = 0
var bill20 = 0

def check_bill(arr: Array[Int]): Boolean =
  var bill5 = 0
  var bill10 = 0
  var bill20 = 0
    for x <- arr.indices do
      if arr(x) == 5 then
        bill5 += 1

      else if arr(x) == 10 then
        bill10 += 1
        if bill5 >= 1 then
          bill5 -= 1
        else return false

      else if arr(x) == 20 then
        bill20 += 1

        if bill10 >= 1 && bill5 >= 1 then
          bill10 -= 1
          bill5 -= 1

        else if bill5 >= 3 then
          bill5 -= 3
        else return false
    return true


println(check_bill(lemonade1))
println(check_bill(lemonade2))
println(check_bill(lemonade3))