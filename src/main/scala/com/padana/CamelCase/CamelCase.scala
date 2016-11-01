package main.scala.com.padana.CamelCase

class CamelCase {
  var count = 1
  var line = "saveChangesInTheEditor";

  def checkCamelCase(i: Int): Int = {
    if (i == line.length() - 1) {
      return count;
    } else {
      if (Character.isUpperCase(line.charAt(i))) {
        count += 1
      }
      checkCamelCase(i + 1)
    }
  }
  
  println(checkCamelCase(0))
}