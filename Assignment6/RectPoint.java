//package rectangle;

/**
 * Class: CS 501-WS Introduction to JAVA Programming <br />
 * Instructor: M. Jurkat <br />
 * Chapter: 10 <br />
 * Exercise: 4 <br />
 * Description: Create class RectPoint to hold x and y coordinates <br />
 * Due: 4/11/2016 <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
 * <br />
 * Signed: Michael Langford <br />
 */

/*
 * 10.4 The RectPoint class) Design a class named RectPoint to represent a point
 * with x- and y-coordinates.
 */
public class RectPoint {

	// Parameter Decelerations

	private double x = 0.0;
	private double y = 0.0;
	private String errorMessage = "";

	// Constructors

	public RectPoint() {
	}

	public RectPoint(double _x, double _y) {
		x = _x;
		y = _y;
	}

	// Get functions:

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	// Set functions:

	public void setX(double _x) {
		x = _x;
	}

	public void setY(double _y) {
		y = _y;
	}

	// Standard Methods from Object class

	public void print() {
		System.out.print("(" + x + ", " + y + ")");
	}

	public String toString() {
		return "(" + x + ", " + y + ")"; // "[X = " + x + "; Y = " + y + "]";
	}

	public boolean equals(Object o) {
		// check for null parameter
		if (o == null)
			return false;

		// check for object type
		String s = o.getClass().getName(); // method to get class name
		if (!s.equals("RectPoint"))
			return false;

		// check for equivalent parameter values
		RectPoint b = (RectPoint) o; // cast unspecified object to
		// RectPoint object in order to be able
		// to use RectPoint get() functions
		if (x != b.getX())
			return false;
		if (y != b.getY())
			return false;

		return true;
	}

}
