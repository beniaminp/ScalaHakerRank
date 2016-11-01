package main.scala.com.padana.sockmerchant

class SockMerchant {
  var count = 0

  def checkCom() {
    var n = 9
    var c = Array(10,20,20,10,10,30,50,10,20)

    def byElem(i: Int): Int = {
      if (i < c.length) {
        def checkElem(t: Int): Unit = {
          if (c(i).equals(c(t)) && !c(i).equals(0) && !i.equals(t)) {
            count += 1; c(i) = 0; c(t) = 0
          } else if (!t.equals(n - 1)) {
            checkElem(t + 1)
          }
        }
        checkElem(0);
        byElem(i + 1)
      }
      return count
    }
    println(byElem(0))
  }
}