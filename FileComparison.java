import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class FileComparison {

	/** Compares two files using the given BufferedReaders line by line. 
	 * If finds a mismatch, returns the number of the line where the first mismatch occured.
	 * If files are the same, returns -1.
	 * Declares that it "throws the IOException" (IOException should be handled in compareFiles).
	 */
	public static int readCompareLines(BufferedReader br1, BufferedReader br2) throws IOException {
			String line1 = "";
			String line2 = "";
			// Read line1 from br1, and line2 from br2 and compare the lines
			// Keep track of the line number
			// If lines do not match, return the line number

	}

	/** Compares two text files line by line. 
	 * If one of the files does not exist, asks the user to reenter the names of both files and attempts to create BufferedReaders again.
	 * If files are identical, prints "Content of the files is the same".
	 * Uses readCompareLines as a helper function. 
	 * Must catch IOException.
	 */
	public static void compareFiles (String filename1, String filename2) {
		// FILL IN CODE
		// Create FileReaders, BufferedReaders for both files inside the try block (use try with resources)
		// call readCompareLines and print "Content of the files is the same" if readCompareLines returned -1
		
		// In the catch block, create a Scanner to read keyboard input, and ask the user to enter the names of the two files
		// Then create FileReaders, BufferedReaders for both files and again try to call readCompareLines
	}

	public static void main(String[] args) {
		compareFiles("song1.txt", "song2.txt");
		// compareFiles("song1.txt", "song3.txt");

	}

}
