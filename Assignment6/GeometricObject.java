//package triangle;

/** The abstract GeometricObject class */
public abstract class GeometricObject {
	private String color = "white";
	private boolean filled = false;

	/** Default constructor */
	protected GeometricObject() {
	}

	/** Constructor of geometricObject class */
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	/** Get method for color */
	public String getColor() {
		return color;
	}

	/** Set method for color */
	public void setColor(String color) {
		this.color = color;
	}

	/** isFilled method for color since its boolean */
	public boolean isFilled() {
		return filled;
	}

	/** Set method for filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Abstract method to findArea */
	public abstract double getArea();

	/** Abstract method to getPerimeter */
	public abstract double getPerimeter();
}
