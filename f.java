// Java Program to illustrate Reading from FileReader
// using BufferedReader Class

// Importing input output classes
import java.io.*;

// Main class
public class f {

	// main driver method
	public static void main(String[] args) throws Exception
	{

		// File path is passed as parameter
		File file = new File("file1.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		// Declaring a string variable
		String st;
		// Condition holds true till
		// there is character in a string
		while ((st = br.readLine()) != null)

			// Print the string
			System.out.println(st);
	}
}
