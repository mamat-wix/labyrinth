package com.kissproject

trait Painter[T] {
  def draw(t: T)
  def clear()
}