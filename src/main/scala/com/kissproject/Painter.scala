package com.kissproject

//created for need to change console for something else)))
trait Painter[T] {
  def draw(t: T)
  def clear()
}