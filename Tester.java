public class Tester {
  public static void main(String args[]) {
    Point A = new Point(-1.0, -2.0);
    Point B = new Point(1.0, 3.0);
    Point C = new Point(3.0, 4.0);

    corToPoint( A.getX(), A.getY() );
    corToPoint( B.getX(), B.getY() );

    System.out.println(A.distanceTo(B));
    System.out.println(B.distanceTo(C));

    System.out.println(A.equals(B));
    System.out.println(B.equals(C));

    Triangle ABC = new Triangle(A, B, C);
    Triangle DEF = new Triangle(1.0, 2.0, 2.5, 4.0, 3.0, 3.0);
    }

  public static void corToPoint(double x, double y) {
    System.out.println("(" + x + ", " + y + ")");
  }
}
