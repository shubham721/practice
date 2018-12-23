class ExceptionMessageCatch {

  def func1(): String={
    func2()
  }

  def func2()={
    throw new Exception("xyz")
  }

}

object ExceptionMessageCatch extends App{
    try{
      new ExceptionMessageCatch().func1()
    }
    catch {
      case e: Exception => print("hi"+e.getMessage())
    }
}
