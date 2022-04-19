/**
 * 
 */


import java.util.GregorianCalendar;

/**
 * @author Sangram Thorat CWID : 20007345 This program uses GregorianCalendar
 *         class which displays the current year month and day and calculates
 *         specified elapsed time since January 1,1970
 */
public class GrepgorianCalendar {

	/**
	 * @param args
	 */
	/** Main method */
	public static void main(String[] args) {
		System.out.println("This program uses GregorianCalendar class which displays the current year, month and day\n"
				+ "and calculates specified elapsed time since January 1,1970 ");
		// Create a GregorianCalendar object
		GregorianCalendar calender = new GregorianCalendar();

		// Display the current year, month, and day in format Mth/Day/Year
		System.out.print("\nCurrent year, month, and day in format Mth/Day/Year: ");
		System.out.println(calender.get(calender.MONTH) + "/" + calender.get(calender.DAY_OF_MONTH) + "/"
				+ calender.get(calender.YEAR));

		// Set elapsed time since January 1, 1970 to 1234567898765L
		calender.setTimeInMillis(1234567898765L);

		// Display the year, month and day
		System.out.print("\nElapsed time since January 1, 1970 set to " + "1234567898765L in format Mth/Day/Year: ");
		System.out.println(calender.get(calender.MONTH) + "/" + calender.get(calender.DAY_OF_MONTH) + "/"
				+ calender.get(calender.YEAR));

	}

}
