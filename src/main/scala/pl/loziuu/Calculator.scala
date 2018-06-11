package pl.loziuu

import pl.loziuu.model.Point

object Calculator {
  def leastSquares(points: List[Point]): (Double, Double) = {
    val n = points.length

    var sumX: Double = points.map(f => f.x).sum
    var sumX2: Double = points.map(f => f.x * f.x).sum
    var sumY: Double = points.map(f=> f.y).sum
    var sumXY: Double = points.map(f => f.x * f.y).sum

    var a = (n * sumXY - sumX * sumY) / ((n * sumX2) - (sumX*sumX))
    var b = sumY/n - a*sumX/n
    (a, b)
  }
}
