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
    Triangle GHI = new Triangle(0.0, 1.0, 1.0, 0.0, -1.0, 0.0);
    Triangle KLM = new Triangle(0.0, 0.0, 3.0, (3 * Math.sqrt(3)), 6.0, 0.0);

    System.out.println(ABC.getPerimeter());
    System.out.println(DEF.getPerimeter());

    System.out.println(ABC.getArea());
    System.out.println(DEF.getArea());

    System.out.println(ABC.classify());
    System.out.println(DEF.classify());
    System.out.println(GHI.classify());
    System.out.println(KLM.classify());

    System.out.println(A);
    System.out.println(B);
    System.out.println(C);
    System.out.println(ABC);
    System.out.println(DEF);
    System.out.println(KLM);

    ABC.setVertex(2, new Point(2.0, 3.0));
    System.out.println(ABC);
    }

  public static void corToPoint(double x, double y) {
    System.out.println("(" + x + ", " + y + ")");
  }
}
