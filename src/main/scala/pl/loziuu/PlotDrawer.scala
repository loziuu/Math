package pl.loziuu

import org.sameersingh.scalaplot.Implicits._
import org.sameersingh.scalaplot.{MemXYSeries, XYData, XYPlotStyle, XYSeries}
import pl.loziuu.model.Point


class PlotDrawer(val numTicks: Int = 10) {

  def drawSimpleFunctionPlot(a: Double, b: Double): Unit = {
    val x: Seq[Double] = 0.0 to numTicks by 1
    val y: Seq[Double] = mapToSimpleFunction(a, b, x)

    output(GUI, xyChart(x -> x.map(f => a * f + b)))
  }

  def drawSimlpleFunctionWithPoints(a: Double, b: Double, points: List[Point]): Unit = {
    val x: Seq[Double] = 0.0 to points.last.x by 1
    val y: Seq[Double] = mapToSimpleFunction(a, b, x)

    val XSeries = points.map(f => f.x.toDouble)
    val YSeries = points.map(f => f.y.toDouble)
    val series = new MemXYSeries(XSeries, YSeries, "points")
    series.plotStyle = XYPlotStyle.Dots
    val data = new XYData(series)
    data.+=(new MemXYSeries(x, y))
    output(GUI, xyChart(data = data))
  }

  private def mapToSimpleFunction(a: Double, b: Double, x: Seq[Double]) = x.map(f => a * f + b)
}
