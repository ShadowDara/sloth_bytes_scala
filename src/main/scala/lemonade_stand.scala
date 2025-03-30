// Slothbytes Lemonade Stand
// Week 13 Year 2025
// made by Shadowdara

package de.shadowdara.sloth_bytes_scala

import scala.util.boundary

object lemonade_stand {
  var bill5 = 0
  var bill10 = 0
  var bill20 = 0
  def check_bill(arr: Array[Int]): Boolean =
    for x <- arr.indices do
      if arr(x) == 5 then
        bill5 += 1
      if arr(x) == 10 then
        bill10 += 1
        if bill5 >= 1 then
          bill5 -= 1
        else return false
      if arr(x) == 20 then
        bill20 += 1
        if bill10 >= 1 then
          bill10 -= 1
          if bill5 >= 1 then
            bill5 -= 1
          else return false
        else if bill5 >= 3 then
          bill5 -= 3
        else return false
    return true
  def test(): Boolean = return false
}
