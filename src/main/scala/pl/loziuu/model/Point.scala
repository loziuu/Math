package pl.loziuu.model

class Point(val _x: Double, val _y: Double) {
  def x: Double = _x
  def y: Double = _y

  override def toString: String = s"[$x, $y]"
}
