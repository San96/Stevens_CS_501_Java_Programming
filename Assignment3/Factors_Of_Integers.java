/**
 * 
 */
//package assignment4;

import java.util.Scanner;

/**
 * @author Sangram Thorat CWID : 20007345
 *
 */
public class Factors_Of_Integers {
	final static int NUM_PRIMES = 1000;
	private static int[] primes;
	private static final int FIRST_PRIME = 2;

	/**
	 * @param args
	 */
	// Check whether number is prime
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // Number is not a prime
			}
		}

		return true; // Number is prime
	}

	//method to search prime number from given prime numbers array list 
	public static void linearSearch(int[] list, int key) {
		int temp = key;
		for (int j = 0; j < list.length; j++) {
			if (key == list[j]) {
				System.out.println("The Number " + key + " is a prime number ");
				return;
			}
		}

		System.out.println("The number " + key + " is not a prime number ");
		int i = 2;
		String s = " ";

		// code for finding smallest factors
		while (temp != 1) {
			if (temp % i == 0) {
				s = s + ", " + i;
				temp = (temp / i);
				i = 2;
			} else {

				i++;
			}

		}

		System.out.print("The smallest factors of number " + key + " are " + s.substring(2) + ".");
		System.out.println();
	}

	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 10 per line
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness

		// Repeatedly find prime numbers
		while (count < numberOfPrimes) {
			// Print the prime number and increase the count
			if (isPrime(number)) {
				count++; // Increase the count

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Print the number and advance to the new line
					System.out.printf("%-5s\n", number);
				} else
					System.out.printf("%-5s", number);
			}

			// Check whether the next number is prime
			number++;
		}
	}

	public static void generatePrimes() {

		// initialize variables
		primes = new int[168];
		int count = 0;
		int number = FIRST_PRIME;

		// loop until the array is full
		while (number < NUM_PRIMES) {

			// if the number is prime
			if (isPrime(number)) {

				// add it to the array and increment the array index / prime count
				primes[count] = number;
				count++;
			}

			// increment the number being checked
			number++;
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_PRIMES_PER_LINE = 8;
		final int NUM_PRIMES = 1000;
		int count = 0;
		int number = 2;

		String introfactors = "This program allows you to display the first 50 prime numbers between 1 to 1000\n"
				+ "and then it will check if entered number is prime of not, if not then it\n "
				+ "will displays the smallest factors of that number in an increasing order";

		int repeatInt = 1;
		Scanner input = new Scanner(System.in);

		while (repeatInt == 1) {
			System.out.println(introfactors);
			// beginning of code lines responding to the exercise
			System.out.println("The first 50 prime numbers are:  \n");
			// print out the first 50 primes
			printPrimeNumbers(NUMBER_OF_PRIMES);
			System.out.println();

			// Generate prime numbers up to 1000
			System.out.println("The prime numbers upto 1000 are: \n");
			generatePrimes();
			for (int i = 0; i < primes.length; i++) {
				System.out.print(primes[i]+" ");
			}
			System.out.println();

			// integer that will be checked for being prime
			System.out.println("Please enter an integer number to check if its prime or not:");
			int integer = input.nextInt();

			linearSearch(primes, integer);

			// end of code lines responding to the exercise

			System.out.print("Repeat program (enter 1 for yes or 0 for n)?: ");
			repeatInt = input.nextInt();
		} // end while(repeat loop)

	} // end main()

}// end class
