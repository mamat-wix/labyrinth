package com.kissproject

class Board(boardStr: String) {
  def find(p: Char => Boolean): Option[Char] = {
    val index = indexWhere(p)
    if(index == (-1,-1)) None
    else Some(get(index._1, index._2))
  }

  //  def findFirst(p: Char => Boolean): Option[Char] = {
  //
  //  }


  def indexWhere(p: Char => Boolean): (Int, Int) = {
    var i, j = 0
    while (i < height) {
      while (j < width) {
        if (p(board(i)(j))) return (i, j)
        j+=1
      }
      j = 0
      i += 1
    }
    (-1, -1)
  }

  val board: Array[Array[Char]] = makeBoard(boardStr)
  private val width: Int = board(0).length
  private val height: Int = board.length

  val size: (Int, Int) = (width, height)

  def set(i: Int, j: Int)(c: Char): Board = {
    board(i)(j) = c
    this
  }

  def get(i: Int, j: Int): Char = board(i)(j)

  def withIndex: BoardWithIndex = new BoardWithIndex(this)

  override def toString: String = board.map(line => line.mkString("")).mkString("\r\n")

  private def makeBoard(board: String): Array[Array[Char]] = {
    board.split("\n")
      .filterNot(_.isBlank)
      .map(_.filterNot(_.isWhitespace))
      .map(_.toCharArray)
  }
}