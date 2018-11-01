import scala.collection.mutable.ListBuffer

class Bar {
	private var appendedStrings: ListBuffer[String] = ListBuffer("a")

	private def appendString(str: String) {
		appendedStrings += str
	}

  def doAThing(): String = {
    appendString("b")
    appendString("c")
    appendedStrings.foldLeft("")(_ + _)
  }
}

object Main extends App {
  val bar = new Bar
  println(bar.doAThing())
}
