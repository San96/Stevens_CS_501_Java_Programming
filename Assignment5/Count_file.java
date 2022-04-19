/**
 * 
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * @author Sangram Thorat CWID : 20007345
 *
 */
public class Count_file {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) {
		String intro = "This program allows you to select file from JFileChooser class in java\n"
				+ "and then program will count the number of characters, words and lines in a file.\n ";
		System.out.println(intro);

		int option = JOptionPane.YES_OPTION;
		// counters for characters, words and lines in a file
		int charsCount = 0;
		int wordsCount = 0;
		int linesCount = 0;

		Scanner in = null;
		File selectedFile = null;
		// Select D drive
		JFileChooser chooser = new JFileChooser("d:");
		try {
			// choose file
			if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				selectedFile = chooser.getSelectedFile();

				in = new Scanner(selectedFile);

			}

			// Optionpane class for promt the user that file is not selected
			else {
				JOptionPane.showMessageDialog(null, "No file selected");
				System.exit(1);
			}
			while (in.hasNext()) {
				String tmp = in.nextLine();
				if (!tmp.equalsIgnoreCase("")) {
					String replaceAll = tmp.replaceAll("\\s+", "");
					charsCount += replaceAll.length();
					wordsCount += tmp.split(" ").length;
				}
				++linesCount;
			}

			// display the count of characters, words, and lines in a selected file
			System.out.println("Number of characters: " + charsCount);
			System.out.println("Number of words: " + wordsCount);
			System.out.println("Number of lines: " + linesCount);

			in.close();

		} // end of try block
		
		catch (FileNotFoundException e) {

			System.out.println("File not found");
		
		} // end of catch block
	
	}// end of main

}// end of Count_file class