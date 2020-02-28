package com.kissproject

class ConsolePainter extends Painter[String] {
  override def draw(t: String): Unit = println(t)

  override def clear(): Unit = print("\u001b[2J")
}