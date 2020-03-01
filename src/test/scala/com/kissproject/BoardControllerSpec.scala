package com.kissproject

class BoardControllerSpec extends org.specs2.mutable.Specification {
  val testBoard: String =
    """
      |q w e
      |a s d
      |z x c
      |""".stripMargin

  "BoardController" >> {
    "move symbol left on board" >> {
      val board = new Board(testBoard)
      val boardController = new BoardController(board)
      boardController.move(Left, 'w')
      boardController.boardString must beEqualTo("wqe\r\nasd\r\nzxc")
    }

    "move symbol right on board" >> {
      val board = new Board(testBoard)
      val boardController = new BoardController(board)
      boardController.move(Right, 'w')
      boardController.boardString must beEqualTo("qew\r\nasd\r\nzxc")
    }

    "move symbol up on board" >> {
      val board = new Board(testBoard)
      val boardController = new BoardController(board)
      boardController.move(Up, 's')
      boardController.boardString must beEqualTo("qse\r\nawd\r\nzxc")
    }

    "move symbol left on board" >> {
      val board = new Board(testBoard)
      val boardController = new BoardController(board)
      boardController.move(Left, 'w')
      boardController.boardString must beEqualTo("wqe\r\nasd\r\nzxc")
    }
  }
}