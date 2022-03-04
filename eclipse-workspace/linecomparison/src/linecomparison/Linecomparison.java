package linecomparison;
import java.util.Objects;
import java.util.Scanner;
public class Linecomparison {
	public static void main(String[] args) {
        System.out.println("Welcome Line Comparison");
        Scanner input = new Scanner(System.in);
        System.out.println("Line 1 coordinates");
        System.out.println("Enter the value of x1 : ");
        int x1 = input.nextInt();
        System.out.println("Enter the value of y1 : ");
        int y1 = input.nextInt();
        System.out.println("Enter the value of x2 : ");
        int x2 = input.nextInt();
        System.out.println("Enter the value of y2 : ");
        int y2 = input.nextInt();
        
        System.out.println("Line 2 coordinates");
        System.out.println("Enter the value of x3 : ");
        int x3 = input.nextInt();
        System.out.println("Enter the value of y3 : ");
        int y3 = input.nextInt();
        System.out.println("Enter the value of x4 : ");
        int x4 = input.nextInt();
        System.out.println("Enter the value of y4 : ");
        int y4 = input.nextInt();

        Double distance1 = Math.sqrt( ( x2 - x1 ) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ));
        Double distance2 = Math.sqrt( ( x4 - x3 ) * ( x4 - x3 ) + ( y4 - y3 ) * ( y4 - y3 ));
        System.out.println("Length of the line L1 is : "+distance1);
        System.out.println("Length of the line L2 is : "+distance2);
        int check = distance1.compareTo(distance2);
        if (check == 0) {
            System.out.println("line1 and 2 are equal.");
        }
        else if (check > 0) {
            System.out.println("Line1 is greater than Line 2.");
        }
        else {
            System.out.println("Line 1 is less than Line 2.");
        }
        
	}
}
