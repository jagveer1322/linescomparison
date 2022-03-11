package linecomparison;
//import java.util.;
import java.util.Scanner;

public class Linecomparison {
	static int x1,x2,x3,x4,y1,y2,y3,y4 ;
	static Double distance1,distance2;
	void getcoordinates() {
	
		 Scanner input = new Scanner(System.in);
		 System.out.println("Line 1 coordinates");
	        System.out.println("Enter the value of x1 : ");
	         x1 = input.nextInt();
	        System.out.println("Enter the value of y1 : ");
	         y1 = input.nextInt();
	        System.out.println("Enter the value of x2 : ");
	         x2 = input.nextInt();
	        System.out.println("Enter the value of y2 : ");
	         y2 = input.nextInt();
	        
	        System.out.println("Line 2 coordinates");
	        System.out.println("Enter the value of x3 : ");
	         x3 = input.nextInt();
	        System.out.println("Enter the value of y3 : ");
	         y3 = input.nextInt();
	        System.out.println("Enter the value of x4 : ");
	         x4 = input.nextInt();
	        System.out.println("Enter the value of y4 : ");
	         y4 = input.nextInt();
	
	}
	
	
	void calculatelength()
	{
         Double distance1 = Math.sqrt( ( x2 - x1 ) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ));
	     Double distance2 = Math.sqrt( ( x4 - x3 ) * ( x4 - x3 ) + ( y4 - y3 ) * ( y4 - y3 ));
	     
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
	public static void main(String[] args) {
      System.out.println("Welcome Line Comparison");
      Linecomparison obj = new Linecomparison();
      obj.getcoordinates();
      obj.calculatelength();
     
	}
}
