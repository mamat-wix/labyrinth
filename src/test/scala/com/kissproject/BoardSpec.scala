package com.kissproject

import org.specs2.specification.BeforeEach

class BoardSpec extends org.specs2.mutable.Specification {
  val testBoard =
    """qwe
       asd
       zxc"""

  def board: Board = new Board(testBoard)

  "Board" >> {
    "size" >> {
      "should be correct" >> {
        board.size must beEqualTo((3, 3))
      }
    }

    "set" >> {
      "should change value" >> {
        board.set(0, 0)('Q').toString must beEqualTo("Qwe\r\nasd\r\nzxc")
      }
    }

    "get" >> {
      "should return correct value" >> {
        board.get(0, 0) must beEqualTo('q')
      }
    }

    "find" >> {
      "should return None when predicate is false" >> {
        board.find(char => false) must beNone
      }

      "should return correct character when predicate is false" >> {
        board.find(char => char == 'a') must beSome[Char](beEqualTo('a'))
      }
    }

    "indexWhere" >> {
      "should return (-1,-1) when predicate is false" >> {
        board.indexWhere(_ => false) must beEqualTo((-1, -1))
      }
      "should return (0,0) when predicate is true" >> {
        board.indexWhere(_ => true) must beEqualTo((0, 0))
      }
      "should return correct value" >> {
        board.indexWhere(char => char.equals('a')) must beEqualTo((1, 0))
      }
    }

    "withIndex" >> {
      board.withIndex.get(0, 0) must beEqualTo(('q', (0, 0)))
    }
  }

  "BoardWithIndex" >> {
    "get(i,j) should return (val, (i,j))" >> {
      val boardWithIndex = new BoardWithIndex(board)
      boardWithIndex.get(0, 0) must beEqualTo(('q', (0, 0)))
    }
  }
}

