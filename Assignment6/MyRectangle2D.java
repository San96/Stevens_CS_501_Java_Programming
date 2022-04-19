//package rectangle;

/**
 */
/*

 */
public class MyRectangle2D extends Rectangle {

	// Parameter Decelerations

	private RectPoint center = new RectPoint(); // x and y = 0

	// Constructors

	public MyRectangle2D() {
	} // Default constructor

	public MyRectangle2D(double width, double height, double x, double y) throws Exception // parameterized constructor

	{
		setWidth(width);
		setHeight(height);
		center = new RectPoint(x, y);
	}

	// Get & Set functions:

	// Returns coordinates for the Top Left and Bottom Right corners of the
	// Rectangle
	public RectPoint getTopLeft() {
		return new RectPoint(center.getX() - getWidth() / 2, center.getY() + getHeight() / 2);
	}

	public RectPoint getBottomRight() {
		return new RectPoint(center.getX() + getWidth() / 2, center.getY() - getHeight() / 2);
	}

	public RectPoint getCenter() {
		return center;
	}

	public void setCenter(double x, double y) {
		center = new RectPoint(x, y);
	}

	// Special Calculations Methods:

	public boolean contains(double x, double y) {
		// Testing if point is in rectangle
		if (x <= center.getX() + getWidth() / 2 && // Right bound
				x >= center.getX() - getWidth() / 2 && // Left bound
				y <= center.getY() + getHeight() / 2 && // Top bound
				y >= center.getY() - getHeight() / 2) // Bottom bound
		{
			return true;
		}
		return false;
	}

	// Returns True if there is inclusion of one rectangle in other rectangle
	public boolean contains(MyRectangle2D rect) {
		if (rect.getCenter().getX() + rect.getWidth() / 2 < center.getX() + getWidth() / 2 && // Right bound
				rect.getCenter().getX() - rect.getWidth() / 2 > center.getX() - getWidth() / 2 && // Left bound
				rect.getCenter().getY() + rect.getHeight() / 2 < center.getY() + getHeight() / 2 && // Top bound
				rect.getCenter().getY() - rect.getHeight() / 2 > center.getY() - getHeight() / 2) // Bottom bound
		{
			return true;
		}
		return false;
	}

	// Returns True if there is overlap condition for both the rectangles i.e.both
	// the rectangles share a common space, false when abut

	public boolean overlaps(MyRectangle2D rect) {
		// Holds coordinates for the Top Left and Bottom Right corners of each Rectangle
		RectPoint thisTLeft = getTopLeft();
		RectPoint thisBRight = getBottomRight();
		RectPoint otherTLeft = rect.getTopLeft();
		RectPoint otherBRight = rect.getBottomRight();

		if (thisTLeft.getX() >= otherBRight.getX() || otherTLeft.getX() >= thisBRight.getX())
			return false;
		if (thisTLeft.getY() <= otherBRight.getY() || otherTLeft.getY() <= thisBRight.getY())
			return false;
		return true;
	}

	// Returns true if there is abutment condition happens, Both rectangles share
	// only a border
	public boolean abut(MyRectangle2D rect) {
		// Hold coordinates for the Top Left and Bottom Right corners of each Rectangle
		RectPoint thisTLeft = getTopLeft();
		RectPoint thisBRight = getBottomRight();
		RectPoint otherTLeft = rect.getTopLeft();
		RectPoint otherBRight = rect.getBottomRight();

		// Left side of THIS against right side of OTHER
		if (thisTLeft.getX() == otherBRight.getX()
				&& ((thisTLeft.getY() <= otherTLeft.getY() && thisTLeft.getY() >= otherBRight.getY())
						|| (thisBRight.getY() <= otherTLeft.getY() && thisBRight.getY() >= otherBRight.getY())
						|| (thisTLeft.getY() >= otherTLeft.getY() && thisBRight.getY() <= otherBRight.getY())))
			return true;

		// Right side of THIS against left side of OTHER
		if (thisBRight.getX() == otherTLeft.getX()
				&& ((thisTLeft.getY() <= otherTLeft.getY() && thisTLeft.getY() >= otherBRight.getY())
						|| (thisBRight.getY() <= otherTLeft.getY() && thisBRight.getY() >= otherBRight.getY())
						|| (thisTLeft.getY() >= otherTLeft.getY() && thisBRight.getY() <= otherBRight.getY())))
			return true;

		// Top of THIS against bottom of OTHER
		if (thisTLeft.getY() == otherBRight.getY()
				&& ((thisTLeft.getX() >= otherTLeft.getX() && thisTLeft.getX() <= otherBRight.getX())
						|| (thisBRight.getX() >= otherTLeft.getX() && thisBRight.getX() <= otherBRight.getX())
						|| (thisTLeft.getX() <= otherTLeft.getX() && thisBRight.getX() >= otherBRight.getX())))
			return true;

		// Bottom of THIS against top of OTHER
		if (thisBRight.getY() == otherTLeft.getY()
				&& ((thisTLeft.getX() >= otherTLeft.getX() && thisTLeft.getX() <= otherBRight.getX())
						|| (thisBRight.getX() >= otherTLeft.getX() && thisBRight.getX() <= otherBRight.getX())
						|| (thisTLeft.getX() <= otherTLeft.getX() && thisBRight.getX() >= otherBRight.getX())))
			return true;

		return false;
	}

	// Returns true if both the rectangles are distinct to each other, two
	// rectangles do not overlap or do not abut,
	public boolean distinct(MyRectangle2D rect) {
		return (!overlaps(rect) && !abut(rect));
	}

	// Standard Methods from Object class

	public void print() {
		System.out.println("Width     = " + getWidth());
		System.out.println("Height    = " + getHeight());
		System.out.println("Center	  = " + center.toString());
		System.out.println("Area      = " + getArea());
		System.out.println("Perimeter = " + getPerimeter());
	}

	public String toString() {
		return "[Width = " + getWidth() + " : Height = " + getHeight() + " : Center = " + center.toString()
		+ " : Area = " + getArea() + " : Perimeter = " + getPerimeter() + "]";
	}

}// end of MyRectangle2D class
