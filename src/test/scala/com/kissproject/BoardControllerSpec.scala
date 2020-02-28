//package com.kissproject
//
//class BoardControllerSpec extends org.specs2.mutable.Specification {
//  val testBoard: String =
//    """
//      |q w e
//      |a s d
//      |z x c
//      |""".stripMargin
//
//  "BoardController" >> {
//    "move symbol on board" >> {
//      val board = new Board(testBoard)
//      val boardController = new BoardController(board)
//      boardController.move("left", 'w')
//
//    }
//  }
//}
//
//class BoardController(board: Board) {
//  def move(direction: String, symbol: Char): Unit = {
//    val size = board.size
//  }
//}
