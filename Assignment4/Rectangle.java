
/**
 * 
 */

import java.util.Scanner;

/**
 * @author Sangram Thorat CWID : 20007345 Rectangle 
 */
//UML Class Diagram                     
/**************************************************
 * Rectangle * ------------------------------------------------* width: double *
 * height: double * Rectangle() * Rectangle(newWidth: double, newHeight: double)
 * * getArea(): double * getPerimeter(): double *
 ***************************************************
 * 
 * 
 * ------------------------------------------------*
 */

//Define the Rectangle class
public class Rectangle {

	/**
	 * @param args
	 */
	// Parameters
	private double width; // Width of rectangle
	private double height; // Height of rectangle
	private String errrorMessage = "";

	// Default constructor
	public Rectangle() {

		width = 1;
		height = 1;
	}

	/**
	 * A constructor that creates a rectangle with the specified width and height
	 */
	public Rectangle(double newWidth, double newHeight) throws Exception {
		setWidth(newWidth);
		setHeight(newHeight);

	}

	// return width
	public double getWidth() {
		return width;
	}

	//return height
	public double getHeight() {
		return height;
	}

	// set up accessor for errorMessage
	public String getErrorNMessage() {
		return errrorMessage;
	}

	// equals method
	public boolean equals(Object o) {
		// check for null parameter
		if (o == null)
			return false;
		// check for object type
		String s = o.getClass().getName(); // method to get class name
		if (!s.equals("assignment4.Rectangle"))
			return false;
		// check for equivalent parameter values
		Rectangle b = (Rectangle) o; // cast unspecified object to
		// Building object in order to be able
		// to use Building get() functions
		if (width != b.getWidth())
			return false;
		if (height != b.getHeight())
			return false;

		return true;
	}

	// set a new width
	public void setWidth(double newWidth) throws Exception {
		if (!isValidWidth(newWidth)) {

			Exception e = new Exception(errrorMessage);
			throw e;
		}
		width = newWidth;

	}

	//set a new height
	public void setHeight(double newHeight) throws Exception {
		if (!isValidHeight(newHeight)) {

			Exception e = new Exception(errrorMessage);
			throw e;
		}

		height = newHeight;

	}

	// isValidXX method for width
	public boolean isValidWidth(double _width) {
		if (_width > 0)
			return true;
		errrorMessage = "Invalid width :" + " needs to be greater than '>' 0";
		return false;
	}

	// isValidXX method for height
	public boolean isValidHeight(double _height) {
		if (_height > 0)
			return true;
		errrorMessage = "Invalid height :" + " needs to be greater than '>' 0";

		return false;
	}

	/** Return the area of this rectangle */
	public double getArea() {
		return width * height;
	}

	/** Return the perimeter of this rectangle */
	public double getPerimeter() {
		return 2 * (width + height);
	}

}
