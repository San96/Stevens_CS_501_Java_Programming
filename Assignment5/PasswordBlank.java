/**
 * 
 */


import javax.swing.JFrame;
/**
 * @author Sangram Thorat CWID : 20007345
 *
 */
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class PasswordBlank {
	public static void main(String[] args) {
		// create new object
		JPasswordField passwordField = new JPasswordField(20);

		char[] password1 = passwordField.getPassword();

		int option = JOptionPane.YES_OPTION;
		while (option == JOptionPane.YES_OPTION) {
			try {
				String password = JOptionPane.showInputDialog("Enter a Password: Must be 8 or more"
						+ " letters or numerical digits 2" + " of which must be digits");
				isValidPassword(password);

				option = JOptionPane.showConfirmDialog(null, "Valid Password" + "\nDo you want to continue");
			} // end try
			catch (Exception ex) {
				String outputStr = " Invalid Password: " + ex.getMessage() + "\nDo you want to continue? ";
				option = JOptionPane.showConfirmDialog(null, outputStr);

			} // end catch

		} // end while

	} // end main()

	private static void isValidPassword(String str) throws Exception {

		if (!(str.length() >= 8)) { // Rule 1: At least 8 characters
			System.out.println("Password MUST have at least 8 characters long");
			throw new Exception("Please Enter a password with more than 8 characters long");

		}
		if (!str.matches("^[\\w]+$")) { // Rule 2: Only letters and #s
			// ^...$ --> from beginning to end
			// of string [\\w]+ --> check if character is alpha numeric

			System.out.println("Password must contain only letters and digits");
			throw new Exception("Please Enter password which must contains letters and digits");

		}

		if (!str.matches("^.*?\\d.*?\\d.*$")) { // Rule 3: At least 2 digits // ^...$ --> from beginning to end of
			// string
			// .*? --> zero or more occurrences of any char : ? --> one time or not at all
			// \\d.*?\\d at least 2 digits in the string
			// .* --> zero or more characters after the #s
			// Negated to return true only when they are not present

			System.out.println("Password MUST contain at least 2 digits");
			throw new Exception("Please Enter a password which contain at least 2 digits");

		}

		// Passing all rules returns "Valid"
		else {
			System.out.println("Valid Password");
		}

	}// end isValidPassword

	/**
	 * @return
	 */
	private static Exception exception() {

		return null;
	}
} // end class PasswordBlank
