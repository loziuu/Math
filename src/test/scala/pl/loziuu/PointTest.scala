package pl.loziuu

import org.scalatest.FlatSpec
import pl.loziuu.model.Point

class PointTest extends FlatSpec {

  "A point" should "create with X and Y" in {
    val point = new Point(1, 2)

    assert(point.x === 1)
    assert(point.y === 2)
  }

  "A list of points" should "be created" in {
    val points = new Point(1,1) :: new Point(2,2) :: Nil

    assert(points.length == 2)
  }
}
