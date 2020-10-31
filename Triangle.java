public class Triangle {
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1,
                  double x2, double y2,
                  double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter() {
    double AB = v1.distanceTo(v2);
    double BC = v2.distanceTo(v3);
    double AC = v1.distanceTo(v3);
    return AB + BC + AC;
  }

  public double getArea() {
    double AB = v1.distanceTo(v2);
    double BC = v2.distanceTo(v3);
    double AC = v1.distanceTo(v3);
    double S = this.getPerimeter() / 2.0;
    return Math.sqrt(S * (S - AB) * (S - BC) * (S - AC) );
  }

  public String classify() {
    double AB = round(v1.distanceTo(v2));
    double BC = round(v2.distanceTo(v3));
    double AC = round(v1.distanceTo(v3));
    if ( AB == BC && AB == AC ) {
      return "equilateral";
    } else if ( AB == BC || BC == AC || AC == AB ) {
      return "isosceles";
    } else {
      return "scalene";
    }
  }

  public static double round(double num) {
    num = Math.round( num * Math.pow(10, 4) );
    return (num / (Math.pow(10, 4)));
  }

  public String toString() {
    return "v1" + v1 + " v2" + v2 + " v3" + v3;
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) {
      v1 = newP;
    } else if (index == 1) {
      v2 = newP;
    } else if (index == 2) {
      v3 = newP;
    }
  }
}
