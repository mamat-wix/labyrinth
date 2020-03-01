package com.kissproject

import scala.io.StdIn

object Main extends App {
  val board = new Board(
    """
      |----------
      ||.*......|
      ||........|
      |----------
      |""".stripMargin)

  val boardController = new BoardController(board)
  val painter = new ConsolePainter
  val player = '*'
  var command = ""
  while (command != "exit") {
    painter.clear()
    painter.draw(board.toString)

    command = StdIn.readLine("Enter command: left, right, up, down or exit\n")
    command match {
      case "left" => boardController.move(Left, player)
      case "right" => boardController.move(Right, player)
      case "up" => boardController.move(Up, player)
      case "down" => boardController.move(Down, player)
      case "exit" => println("GOOD BYE")
      case _ =>
    }
  }
}