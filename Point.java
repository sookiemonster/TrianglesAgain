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

  public double distanceTo(Point other) {
    return Math.sqrt(Math.pow((other.getX() - this.x), 2) + Math.pow((other.getY() - this.y), 2));
  }
}
