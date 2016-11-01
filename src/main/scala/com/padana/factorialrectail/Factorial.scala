package main.scala.com.padana.factorialrectail

class Factorial {
  val scanner = new java.util.Scanner(System.in)

  def calFac(n: Int): Int = {

    def factorialWithAccumulator(accumulator: Int, n: Int): Int = {
      if (n == 1)
        return accumulator
      else
        factorialWithAccumulator(accumulator * n, n - 1)
    }
    factorialWithAccumulator(1, n)
  }
}