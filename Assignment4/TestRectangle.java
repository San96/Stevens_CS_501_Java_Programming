/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sangram Thorat CWID : 20007345
 *
 */
public class TestRectangle {

	/**
	 * @param args
	 * @return
	 */
	public void Rectangle() {

	}

	/** Main method */
	public static void main(String[] args) {
		Rectangle asm = new Rectangle();
		int repeatInt = 1;
		Scanner input = new Scanner(System.in);
		String intro = "This program will prompt the user to enter width and height in double and then calculate the "
				+ " area and perimeter of the rectangle ";

		while (repeatInt == 1) {
			System.out.println(intro);
			try {
				// Rectangle constructor call
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter the valid width of rectangle: ");
				double w = sc.nextDouble();
				asm.setWidth(w); // set width of rectangle
				System.out.println("Please enter the valid height of rectangle: ");
				double h = sc.nextDouble();
				asm.setHeight(h); // set height of rectangle

				// Display the width, height, area, and perimeter of rectangle1
				System.out.println("Width of Rectanngle is :     " + asm.getWidth());
				System.out.println("Height of Rectanngle is :    " + asm.getHeight());
				System.out.println("Area of Rectanngle is :      " + asm.getArea());
				System.out.println("Perimeter of Rectanngle is: " + asm.getPerimeter());

			} catch (Exception e) {
				
				System.out.println("width must be a real integer number!");
				System.out.println(asm.getErrorNMessage());
				// e.printStackTrace();
			}

			System.out.print("Repeat program (enter 1 for yes or 0 for n)?: ");
			repeatInt = input.nextInt();

		}

	}
}