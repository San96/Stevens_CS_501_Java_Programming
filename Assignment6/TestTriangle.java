//package triangle;

/**
 @author Sangram Thorat CWID : 20007345
/* Class: CS 501-WS Introduction to JAVA Programming > 
 * 11.1 (The Triangle class) Design a class named Triangle that extends GeometricObject.
 * This Program allows user to test the 'Triangle' "class which extend 'GeometricObjects' class.
 * User will enter values for each side length, color and based on whether or not to fill the triangle
 * The program then displays perimeter and area of your Triangle object
 * @param args
 */

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Declaring data types
		double side1, side2, side3; // Parameters for length of sides
		String color; // Color of triangle object
		boolean filled; // True to fill with color
		int filledInt;
		int repeat = 1; // To allow user to continue testing
		Triangle triangle = new Triangle(); // Triangle object to test

		// Program description
		System.out.println(
				"This program allows user to test the 'Triangle' " + "class which extend 'GeometricObjects' class. ");
		System.out.println("User will enter values for each side length, color and "
				+ "based on whether or not to fill the triangle\n"
				+ "The program then displays perimeter and area of your Triangle object");

		while (repeat == 1) {
			// Prompt user input
			System.out.print("\nEnter side1 length: ");
			side1 = input.nextDouble();
			System.out.print("Enter side2 length: ");
			side2 = input.nextDouble();
			System.out.print("Enter side3 length: ");
			side3 = input.nextDouble();
			System.out.print("Enter color: ");
			color = input.next();
			System.out.print("Enter '1' to set as filled (any other integer to not fill): ");
			filledInt = input.nextInt();
			filled = (filledInt == 1); // Sets filled to true if user entered a 1

			// Exception Handling - Testing for valid input by user
			try {
				triangle = new Triangle(side1, side2, side3, color, filled);
				System.out.println("\nYour Triangle Sides (toString): " + triangle.toString() + "\n");
				triangle.print();
				System.out.print("\nEnter 0 to exit; and enter 1 to test another Triangle: ");
				repeat = input.nextInt();
			} catch (IllegalTriangleException e) {
				System.out.println("--- FAILED ---\n" + e + "\n--- PLEASE TRY AGAIN ---");
				// sent back to user input after message is printed
			}
		}
	}

}
