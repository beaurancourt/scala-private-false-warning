import scala.collection.mutable.ListBuffer

trait Foo {
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

class Bar extends Foo

object Main extends App {
  val bar = new Bar
  println(bar.doAThing())
}
