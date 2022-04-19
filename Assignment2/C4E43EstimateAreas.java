/**
 * 
 */
//package assignment2;

/**
 * This program will allows user to compute the area enclosed by 4 cities -
 * -Atlanta, Georgia; - Orlando, Florida; - Savannah, Georgia; - Charlotte,
 * North Carolina;
 * 
 * @author Sangram Thorat CWID : 20007345
 *
 */
public class C4E43EstimateAreas {
	private static final double RADIUS = 6371.01;

	/**
	 * @param Atlanta; 33.7489954,-84.3879824; Charlotte; 35.2270869,-80.8431267
	 *                 Savannah ;32.0835407,-81.0998342
	 *                 Orlando;28.5383355,-81.3792365
	 */
	public static void main(String[] args) {
		// Variable Points declaration
		System.out.println("This program will compute the area enclosed by 4 cities"
				+ " : Atlanta, Georgia; Orlando, Florida;Savannah, Georgia; and Charlotte, North Carolina;  ");

		double Atlantax1 = 33.7489954;
		double Atlantay1 = -84.3879824;

		double Charlottex2 = 35.2270869;
		double Charlottey2 = -80.8431267;

		double savannahx3 = 32.0835407;
		double savannahy3 = -81.0998342;

		double orlandox4 = 28.5383355;
		double orlandoy4 = -81.3792365;

		// Sides of triangle1

		double T1Side1 = RADIUS * Math.acos(Math.sin(Math.toRadians(Atlantax1)) * Math.sin(Math.toRadians(Charlottex2))
				+ Math.cos(Math.toRadians(Atlantax1)) * Math.cos(Math.toRadians(Charlottex2))
				* Math.cos(Math.toRadians(Atlantay1 - Charlottey2)));
		System.out
		.println("Side1 of triangle 1 - Distance between Atlanta, Georgia; and Charlotte, North Carolina; is: "
				+ T1Side1 + " km");
		double T1Side2 = RADIUS * Math.acos(Math.sin(Math.toRadians(Charlottex2)) * Math.sin(Math.toRadians(orlandox4))
				+ Math.cos(Math.toRadians(Charlottex2)) * Math.cos(Math.toRadians(orlandox4))
				* Math.cos(Math.toRadians(Charlottey2 - orlandoy4)));
		System.out.println("Side2 of triangle 1 - Distance between Charlotte, North Carolina; and Orlando,Florida is : "
				+ T1Side2 + " km");
		double T1Side3 = RADIUS * Math.acos(Math.sin(Math.toRadians(Atlantax1)) * Math.sin(Math.toRadians(orlandox4))
				+ Math.cos(Math.toRadians(Atlantax1)) * Math.cos(Math.toRadians(orlandox4))
				* Math.cos(Math.toRadians(Atlantay1 - orlandoy4)));
		System.out.println("Side3 of triangle 1 : Distance between Orlando, Florida; and Atlanta, Georgia; is :"
				+ T1Side3 + " km");

		// sides of triangle 2
		double T2Side1 = RADIUS * Math.acos(Math.sin(Math.toRadians(Charlottex2)) * Math.sin(Math.toRadians(savannahx3))
				+ Math.cos(Math.toRadians(Charlottex2)) * Math.cos(Math.toRadians(savannahx3))
				* Math.cos(Math.toRadians(Charlottey2 - savannahy3)));
		System.out.println(
				"Side1 of triangle 2 - Distance between Charlotte, North Carolina; and Savannah, Georgia; is : "
						+ T2Side1 + " km");
		double T2Side2 = RADIUS * Math.acos(Math.sin(Math.toRadians(savannahx3)) * Math.sin(Math.toRadians(orlandox4))
				+ Math.cos(Math.toRadians(savannahx3)) * Math.cos(Math.toRadians(orlandox4))
				* Math.cos(Math.toRadians(savannahy3 - orlandoy4)));
		System.out.println("Side2 of triangle 2 - Distance between Savannah, Georgia; and Orlando, Florida; is : "
				+ T2Side2 + " km");
		double T2Side3 = RADIUS * Math.acos(Math.sin(Math.toRadians(Atlantax1)) * Math.sin(Math.toRadians(orlandox4))
				+ Math.cos(Math.toRadians(Atlantax1)) * Math.cos(Math.toRadians(orlandox4))
				* Math.cos(Math.toRadians(Atlantay1 - orlandoy4)));
		System.out
		.println("Side3 of triangle 2 - Distance between Orlando, Florida; and Charlotte, North Carolina is : "
				+ T2Side3 + " km");

		// Area of triangle 1
		double s = (T1Side1 + T1Side2 + T1Side3) / 2.0;
		double T1Area = Math.sqrt(s * (s - T1Side1) * (s - T1Side2) * (s - T1Side3));

		System.out.println(
				"Area of triangle 1 - Area enclosed by Atlanta, Georgia;, Charlotte, North Carolina and Orlando, Florida; is : "
						+ T1Area + " km^2");

		// Area of triangle 2
		double s1 = (T2Side1 + T2Side2 + T2Side3) / 2.0;
		double T2Area = Math.sqrt(s1 * (s1 - T2Side1) * (s1 - T2Side2) * (s1 - T2Side3));
		System.out.println(
				"Area of triangle 2 - Area enclosed by Charlotte, North Carolina, Savannah, Georgia; and Orlando, Florida; is :"
						+ T2Area + " km^2");

		// Total Area enclosed by 4 cities
		double Total_Area = T1Area + T2Area;

		System.out.print("The area enclosed by 4 cities - Atlanta, Georgia; " + "Orlando, Florida; Savannah,"
				+ " Georgia; and Charlotte, North Carolina is: " + Total_Area + " km^2");

	}// end of main()

}// end of class
