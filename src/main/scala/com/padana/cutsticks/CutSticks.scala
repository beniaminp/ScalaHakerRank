package main.scala.com.padana.cutsticks

class CutSticks {
  var n = 8;
  var c = Array[Int](1, 2, 3, 4, 3, 3, 2, 1);
  def cutStick(): Unit = {
    var min = c.filterNot(_ == 0) match {
      case Array() => -1
      case c => c.min
    }
    var count = 0
    for (i <- 0 to c.length - 1 if (c(i) > 0)) {
      c(i) = c(i) - min; count += 1;
    }
    if (count != 0) {
      println(count);
      cutStick()
    }
  }
  cutStick()
}