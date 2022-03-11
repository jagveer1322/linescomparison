package linecomparison;

public class Main {
	public static void main(String[] args) {
        System.out.println("Welcome to Line Comparision Problem");
   
        Point p1 = new Point();
        p1.x = 12;
        p1.y = 32;

        Point p2 = new Point();
        p2.x = 13;
        p2.y = 43;

        Line l1 = new Line();
        l1.p1 = p1;
        l1.p2 = p2;

        Point p3 = new Point();
        p3.x = 9;
        p3.y = 32;

        Point p4 = new Point();
        p4.x = 17;
        p4.y = 32;

        Line l2 = new Line();
        l2.p1 = p3;
        l2.p2 = p4;

        l1.length = (float) l1.getLength();
        l2.length = (float) l2.getLength();

        System.out.println("Line 1 " + l1.length);
        System.out.println("Line 2 " + l2.length);

        System.out.println(l1.equals(l2));
	}
}
