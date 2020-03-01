package com.kissproject

class BoardController(private val board: Board) {
  def boardString: String = board.toString

  private def move(i: Int, j: Int, deltaI: Int, deltaJ: Int): Unit = {
    val (i2, j2) = (i + deltaI, j + deltaJ)
    board.swap(i, j, i2, j2)
  }

  def move(direction: Direction, symbol: Char): Unit = {
    val (i, j) = board.indexWhere(_ == symbol)
    if ((i, j) != (-1, -1)) {
      direction match {
        case Left => move(i, j, 0, -1)
        case Right => move(i, j, 0, 1)
        case Down => move(i, j, 1, 0)
        case Up => move(i, j, -1, 0)
      }
    }
  }
}

sealed trait Direction
case object Left extends Direction
case object Right extends Direction
case object Down extends Direction
case object Up extends Direction