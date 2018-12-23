object Problem26 {

  def main(args: Array[String])={
    print(combinations(3, List('a, 'b, 'c, 'd, 'e, 'f)))
  }

  def flatsublist[A,B](symbols: List[A])(f:List[A] => List[B]):List[B]={
    symbols match {
      case Nil => Nil
      case sublist@(_ :: tail) => f(sublist) ::: flatsublist(tail)(f)
    }
  }
  def combinations(i: Int, symbols: List[Symbol]):List[List[Symbol]]={
    if(i==0) List(Nil)
    else
    flatsublist(symbols) { sl =>
      combinations(i - 1, sl.tail) map {sl.head :: _}
    }
  }

  def printHello()={
    print("hello world");
  }

  def printHelloWorld()={
    print("xyz");
  }

  def xyz()={
    print("dafs")
  }

}
