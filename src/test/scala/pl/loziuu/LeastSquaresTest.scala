package pl.loziuu

import org.scalatest.FlatSpec
import pl.loziuu.model.Point

class LeastSquaresTest extends FlatSpec {

  "A least squares" should "return A and B for given points" in {
    val points = new Point(1 , 2) :: new Point(2, 4) :: new Point(3, 5) :: new Point(4, 7) :: Nil

    val function = Calculator.leastSquares(points)

    print(function)
  }
}
