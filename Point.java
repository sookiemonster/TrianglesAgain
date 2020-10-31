public class Point {
  private double x, y;

  public Point(double X, double Y) {
    this.x = X;
    this.y = Y;
  }

  public Point(Point p) {
    x = p.x;
    y = p.y;
  }

  public double getX() {
    return this.x;
  }

  public double getY() {
    return this.y;
  }
}