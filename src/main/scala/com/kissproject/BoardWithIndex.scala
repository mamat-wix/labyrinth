package com.kissproject

class BoardWithIndex(board: Board) {
  def get(i: Int,j: Int): (Char, (Int,Int)) = {
    (board.get(i,j), (i,j))
  }
}