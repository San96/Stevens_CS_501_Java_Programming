/**
 * 
 */
//package assignment2;

import java.util.Scanner;

/**
 * This program will prompts the user to enter points x and y co-ordinates and
 * will determine weather point is inside the triangle
 * 
 * @author Sangram Thorat CWID : 20007345
 *
 */
public class C3E327PointsInTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("This program allows you to enter points with x and y co-ordinates and "
				+ "determine if that point is inside the traingle or not.");
		// beginning of Program
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the point's x and y co-ordinates :");
		double x = scan.nextDouble();
		double y = scan.nextDouble();

		int x1 = 0;
		int y1 = 100;
		int x2 = 0;
		int y2 = 0;
		int x3 = 200;
		int y3 = 0;

		System.out.println("Co-ordinates of Point A of triangle ABC are: " + x1 + "," + y1);
		System.out.println("Co-ordinates of Point B of triangle ABC are: " + x2 + "," + y2);
		System.out.println("Co-ordinates of Point C of triangle ABC are: " + x3 + "," + y3);
		System.out.println("Co-ordinates of given Point P are: " + x + "," + y);

		// Area of Triangle ABC
		double A = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
		System.out.println("Area of bigger Triangle ABC is :" + A);
		// Area of Triangle PAB
		double A1 = Math.abs((x * (y1 - y2) + x1 * (y2 - y) + x2 * (y - y1)) / 2.0);
		System.out.println("Area of inner Triangle PAB is :" + A1);
		// Area of Triangle PAC
		double A2 = Math.abs((x * (y1 - y3) + x1 * (y3 - y) + x3 * (y - y1)) / 2.0);
		System.out.println("Area of inner Triangle PAC is :" + A2);
		// Area of Triangle PCB
		double A3 = Math.abs((x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2)) / 2.0);
		System.out.println("Area of inner Triangle PCB is :" + A3);
		double inn_Area = A1 + A2 + A3;
		System.out.println("Addition of three inner traingles (PAB+PAC+PCB) Area is :" + inn_Area);

		// Condition Area of Triangle ABC is equal to sum of inner triangles divided by
		// inputed point P
		if (A == (A1 + A2 + A3)) {
			System.out.println("Given point " + x + " and " + y + " is inside the triangle because Outer triangle area "
					+ A + " is equal to addition of inner three triangles area " + inn_Area);
		} else {
			System.out.println(
					" Given point " + x + " and " + y + " is not inside the triangle because Outer triangle area " + A
					+ " is not equal to addition of three inner triangles area " + inn_Area);
		} // End of if-else loop

	}// end of main()

}// end of class
