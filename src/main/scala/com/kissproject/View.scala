package com.kissproject

class View(painter: Painter[String]) {
  def update(s: String): Unit = painter.draw(s)

}
