package pl.loziuu

import pl.loziuu.model.Point

import scala.collection.mutable.ListBuffer
import scala.io.StdIn

object Application {

  def main(args: Array[String]): Unit = {
    val drawer = new PlotDrawer(20)
    var userPoints = ListBuffer[Point]()
    var run: Boolean = true
    do {
      println("X:")
      val X = StdIn.readLine().toDouble
      println("Y:")
      val Y = StdIn.readLine().toDouble
      userPoints += new Point(X, Y)
      println("Kontynuować? [N]ie")
      if (StdIn.readLine() == "N")
        run = false
    } while (run)

    val userPointsList = userPoints.toList
    val function = Calculator.leastSquares(userPointsList)
    userPointsList.foreach(println)
    val str = String.format("y=%sx + %s", function._1.toString, function._2.toString)
    println(str)
    drawer.drawSimlpleFunctionWithPoints(function._1, function._2, userPointsList)
  }
}
