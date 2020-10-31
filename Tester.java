public class Tester {
  public static void main(String args[]) {
    Point A = new Point(1.0, 2.0);
    Point B = new Point(A);

    corToPoint( A.getX(), A.getY() );
    corToPoint( B.getX(), B.getY() );
  }

  public static void corToPoint(double x, double y) {
    System.out.println("(" + x + ", " + y + ")");
  }
}
