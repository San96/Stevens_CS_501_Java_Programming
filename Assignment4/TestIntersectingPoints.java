/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sangram Thorat CWID : 20007345 This program will prompt the user to
 *         enter four endpoints of two lines, x1, y1, x2, y2, x3, y3, x4, y4
 *         then return the values of linear equation arguments, a,b,c,d,e,and f
 *         which will solve the linear equation and return values of x and y
 *         which are the intersecting points of two lines
 */
public class TestIntersectingPoints {

	/**
	 * @param args
	 */
	/** Main method */
	public static void main(String[] args) {
		int repeatInt = 1;
		Scanner input1 = new Scanner(System.in);
		String intro = "This program will prompt the user to enter four endpoints of two lines, x1, y1, x2, y2, x3, y3, x4, y4\n "
				+ " then return the values of linear equation arguments, a,b,c,d,e,and f which will solve the linear equation\n "
				+ " and return values of x and y which are the intersecting points of two lines ";

		while (repeatInt == 1) {
			Scanner input = new Scanner(System.in);
			System.out.println(intro);
			// Prompt the user to enter four end points
			System.out
			.print("Enter the values of four endpoints of two line segments: x1, y1, x2, y2, x3, y3, x4, y4: ");
			double[][] points = getPoints();

			// Get a, b, c, d, e and f points
			double[] p = getArguments(points);

			System.out.println("The values of a,b,c,d,e and f are: " + p[0] + "," + p[1] + "," + p[2] + "," + p[3] + ","
					+ p[4] + "," + p[5]);
			// Create a LinearEquation object
			LinearEquation intersectingPoint = new LinearEquation(p[0], p[1], p[2], p[3], p[4], p[5]);
			// Display results
			if (intersectingPoint.isSolvable()) {
				System.out.println("The intersecting point is at (" + intersectingPoint.getX() + ", "
						+ intersectingPoint.getY() + ")");
			} else
				System.out.println("The two lines are parallel");

			System.out.print("Repeat program (enter 1 for yes or 0 for n)?: ");
			repeatInt = input1.nextInt();
		} // end of while loop
	} // end of main

	/** getPoints returns a 4 x 2 matrix of user endpoints */
	public static double[][] getPoints() {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Create a 4 x 2 matrix
		double[][] points = new double[4][2];

		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		return points;
	}

	/** getArguments returns the linear equation arguments a, b, c, d, e, and f */
	public static double[] getArguments(double[][] points) {
		double[] p = new double[6];
		p[0] = points[0][1] - points[1][1];
		p[1] = -1 * (points[0][0] - points[1][0]);
		p[2] = points[2][1] - points[3][1];
		p[3] = -1 * (points[2][0] - points[3][0]);
		p[4] = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
		p[5] = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
		return p;
	}

}// end of class
