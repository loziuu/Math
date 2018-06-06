package pl.loziuu

import org.nspl._
import awtrenderer._

object Application {

  def main(args: Array[String]): Unit = {
    val x : Seq[Double] = 0.0 to 5.0 by 0.1
    val y : Seq[Double] = x.map(f => f*f)
    val plot = xyplot((x, y) -> line(
      stroke = Stroke(3d)))(
      ylab = "y",
      xlab = "x",
      main = "main",
      yNumTicks = 5,
      xNumTicks = 10
    )
    show(plot)
  }

}
