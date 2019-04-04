package com.elon33

object mytest {
  def main(args: Array[String]): Unit = {
    case class People(name: String, age: Int)
    val p = People("mobin", 22)
    print(p)
  }
}