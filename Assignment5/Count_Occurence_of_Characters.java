/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sangram Thorat CWID : 20007345
 *
 */
public class Count_Occurence_of_Characters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Print a program header
		System.out.println();
		String intro = "This program prompts the user to enter a string followed by a character then displayes the \n"
				+ "number of occurences of the character in the string\n ";
		System.out.println(intro);
		int repeatInt = 1;
		Scanner input = new Scanner(System.in);
		while (repeatInt == 1) {

			// Read in a string and find its length
			System.out.print("Enter String from which we are counting a characters: ");
			Scanner scan = new Scanner(System.in);
			String phrase = scan.nextLine().toLowerCase();
			// Length of the input string
			int length = phrase.length();

			// Initialize counts
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a character or string from which each character we have search in given string: ");
			String findChars = scanner.nextLine().toLowerCase(); // count each of the characters from this string
			int[] counts = new int[findChars.length()]; // the counts of findChars

			// for loop - string character by character and count findChars
			for (int i = 0; i < length; i++) {
				char ch = phrase.charAt(i);
				for (int j = 0; j < findChars.length(); j++) {
					char find = findChars.charAt(j);
					if (ch == find) {
						counts[j]++;
						break;
					}
				}
			}

			// Print the result
			for (int n = 0; n < findChars.length(); n++) {
				System.out.println("Number of occurence of '" + findChars.charAt(n) + " is ': " + counts[n]);
			}
			System.out.println();
			System.out.print("Repeat program (enter 1 for yes or 0 for n)?: ");
			repeatInt = input.nextInt();
		}

	}

}