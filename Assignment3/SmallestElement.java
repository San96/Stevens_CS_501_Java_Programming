/**
 * 
 */
//package assignment4;

import java.util.Scanner;

/**
 * @author Sangram Thorat CWID : 20007345 This Program allows you to enter 10
 *         numbers in array and find the smallest number with its index value
 *         and then sort the given list of array.
 *
 */

public class SmallestElement {
	//smallest element in array with its index value
	public static int indexOfSmallestElement(double[] array) {

		double currentValue = array[0];

		int smallestIndex = 0;
		// loop to find smallest number from array
		for (int j = 1; j < array.length; j++) {

			if (array[j] < currentValue)

			{

				currentValue = array[j];

				smallestIndex = j;

			}

		}
		return smallestIndex;
	}

	// ** selsctionSort sorts array in ascending order
	public static void selectionSort(double[] list) {
		for (int i = list.length - 1; i >= 0; i--) {
			// Find the maximum from list
			double currentMax = list[i];
			int currentMaxIndex = i;

			for (int j = i - 1; j >= 0; j--) {
				if (currentMax < list[j]) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}

			// Swap list[i] with list[currentMax] if necessary
			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String intro = "This program allows you to enter 10 numbers and "
				+ "method will return the smallest element from array and its index then sort that array ";
		int repeatInt = 1;
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		while (repeatInt == 1) {
			System.out.println(intro);
			System.out.println("The entered 10 numbers in array are: \n");
			// initialize doublw array with 10 numbers
			double[] list = new double[10];

			for (int i = 0; i < list.length; i++) {

				System.out.printf("Enter the number for index %d : ", i);

				list[i] = sc.nextDouble();

			}
			// smallest element from list of array
			int smallI = indexOfSmallestElement(list);

			double smallE = list[smallI];

			System.out.println();

			System.out.printf(

					"The smallest element is %.2f and its index is %d.\n", smallE,

					smallI);

			// Invoke selectionSort
			selectionSort(list);
			System.out.println("The Sorted list is : ");
			// Display the sorted numbers
			for (double e : list)
				System.out.print(e + " ");
			System.out.println();

			System.out.print("Repeat program (enter 1 for yes or 0 for n)?: ");
			repeatInt = input.nextInt();

		}

	}
}