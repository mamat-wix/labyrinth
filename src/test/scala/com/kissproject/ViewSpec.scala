package com.kissproject

class ViewSpec extends org.specs2.mutable.Specification {
  "View" >> {
    "update" >> {
      "should call painter draw" >> {
        var counter = 0
        val countingPainter = new Painter[String] {
          override def draw(t: String): Unit = counter += 1
          override def clear(): Unit = {}
        }

        val view = new View(countingPainter)
        view.update("")

        counter must beEqualTo(1)
      }
    }
  }
}
