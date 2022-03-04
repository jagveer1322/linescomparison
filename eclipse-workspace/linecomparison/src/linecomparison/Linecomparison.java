package linecomparison;

import java.util.Scanner;

public class Linecomparison {
	public static void main(String[] args) {
        System.out.println("Welcome Line Comparison");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x1 : ");
        int x1 = input.nextInt();
        System.out.println("Enter the value of y1 : ");
        int y1 = input.nextInt();
        System.out.println("Enter the value of x2 : ");
        int x2 = input.nextInt();
        System.out.println("Enter the value of y2 : ");
        int y2 = input.nextInt();

        double distance = Math.sqrt( ( x2 - x1 ) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ));

        System.out.println("Length of line : " +distance); 
	}
}
